
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.Vision.SensorObjContainer;
import frc.Vision.SensorObject;
import frc.Vision.UDPServerThread;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public CatzDrive driveTrain;

  public UDPServerThread server;
  public AHRS navx;

  public double distance;
  public double heading;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {

    server = new UDPServerThread();
    driveTrain = new CatzDrive();

    navx = new AHRS(SerialPort.Port.kMXP);

    server.start();

  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    SmartDashboard.putNumber("encoder Dist", driveTrain.getDriveTrainEncoderDistance());

    SensorObject vo = SensorObjContainer.get("vis");
    distance = 0;
    heading = 0;
    

    if(vo != null)
    {
      distance = SensorObjContainer.get("vis").getDistance();
      heading = SensorObjContainer.get("vis").getHeading();
    }

    SmartDashboard.putNumber("Distance", distance);
    SmartDashboard.putNumber("Heading", heading);
    

  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {



  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {

   double motorPower = 0.5;
   double rotation = 0.0;

    if(heading > 2)
    {
      rotation = 0.3;
    }
    else if(heading < -2)
    {
      rotation = -0.3;
    }

    driveTrain.arcadeDrive(motorPower, rotation);


    if(!SensorObjContainer.get("vis").isValid())
    {
      motorPower = 0;
    }

    if(distance < 10)
    {
      motorPower = 0;
        if(heading < 0)
        {
          driveTrain.tankDrive(0, 0);
        }
        if(heading <= 0 )
        {
          driveTrain.tankDrive(0, 0);
        }
    }

    else
    {
      if(distance < 0.25)
      {
        motorPower = 0.25;
      }
    }

    /*

    int maxHead = 10;

    double motorPower = 0.55;

    if(heading > maxHead)
    {
      heading = maxHead;
    }

    else if(heading < -maxHead)
    {
      heading = -maxHead;
    }

    double rotation = heading / maxHead;

    if(!SensorObjContainer.get("vis").isValid())
    {
      motorPower = 0;
    }

    if(distance < 10)
    {
      motorPower = 0;
    }

    else
    {
      if(distance < 25)
      {
        motorPower = 0.4;
      }
    }
    */

  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
