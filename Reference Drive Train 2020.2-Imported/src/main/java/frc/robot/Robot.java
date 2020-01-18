package frc.robot;

import java.io.IOException;
import java.util.ArrayList;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static ArrayList<CatzLog> dataArrayList; 
  
  public static Timer t;
  public static Timer autonomousTimer;
 
  public static CatzDriveTrain driveTrain;
  
  public static XboxController drvXbox;

  public static DataCollection dataCollection;

  public static PowerDistributionPanel pdp;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */

  
  @Override
  public void robotInit() 
  { 
    t = new Timer();

    dataArrayList = new ArrayList<CatzLog>();

    driveTrain     = new CatzDriveTrain();
    dataCollection = new DataCollection();

    drvXbox = new XboxController (0);

    pdp = new PowerDistributionPanel(0);

    dataCollection.dataCollectionInit(dataArrayList);

    autonomousTimer = new Timer();
/*
    try{
      dataCollection.writeHeader();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
*/
    System.out.println("hello world");
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
  public void autonomousInit() 
  {
    t.start();
    dataCollection.setDataType(1);
    dataCollection.startDataCollection();

    autonomousTimer.start();

    while(autonomousTimer.get() < 3)
    {
    //   driveTrain.arcadeDrive(1.0, 0);  
    }
    
    driveTrain.arcadeDrive(0, 0);
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() 
  {
  }

  @Override
  public void teleopInit() 
  {
    t.start();
    dataCollection.setDataType(1);

    dataCollection.startDataCollection();

    System.out.println("hello world");
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() 
  {
    driveTrain.arcadeDrive(-drvXbox.getY(Hand.kLeft), drvXbox.getX(Hand.kRight));

    if(drvXbox.getBumper(Hand.kRight) == true)
    {
      driveTrain.deployGearShift();
    }

    if(drvXbox.getBumper(Hand.kLeft) == true)
    {
      driveTrain.retractGearShift();
    }
  }

  @Override
  public void disabledInit() 
  {
    dataCollection.stopDataCollection();
    System.out.println("Data print out");
      for (int i = 0; i <dataArrayList.size();i++)
      {
         System.out.println(dataArrayList.get(i));
      } 

      System.out.println("Starting export");
    dataCollection.writeData(dataArrayList);
    try {
      dataCollection.exportData();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }  


  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}