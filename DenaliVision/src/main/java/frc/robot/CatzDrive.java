package frc.robot;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.can.*;


/*
*  Author : Derek Duenas
*  Last Revised : 2-9-2018 AL
*  touchup
*  Methods : setModeArcadeDriveRacing, setModeArcadeDriveFlash
*  Functionality : sets the drive mode to racing or flash
*/

public class CatzDrive
{

	public static SpeedControllerGroup leftMotors;
	public static SpeedControllerGroup rightMotors;

	public static WPI_TalonSRX fRight;
	public static WPI_TalonSRX rRight;
	public static WPI_TalonSRX fLeft;
	public static WPI_TalonSRX rLeft;
	

	private DifferentialDrive drive;

	public CatzDrive()
	{

		fRight = new WPI_TalonSRX(6); 
		rRight = new WPI_TalonSRX(5);
		fLeft  = new WPI_TalonSRX(3);
		rLeft  = new WPI_TalonSRX(2);

		leftMotors  = new SpeedControllerGroup(fLeft, rLeft);
		rightMotors = new SpeedControllerGroup(fRight, rRight);

		drive = new DifferentialDrive(leftMotors, rightMotors);
		drive.setSafetyEnabled(false);
		//printOutDebugData("Successfully instantiated CatzDrive");
	}
	
	public void setModeArcadeDriveRacing(XboxController control){
		drive.arcadeDrive(control.getRawAxis(3)-control.getRawAxis(2), control.getRawAxis(4));
	}
	
	public void setModeArcadeDriveFlash(XboxController control){
		drive.arcadeDrive(control.getRawAxis(1), control.getRawAxis(4));
	}
	public void setModeReverseArcadeDriveFlash(XboxController control){
		drive.arcadeDrive(-control.getRawAxis(1), control.getRawAxis(4));
	}
	
	public void tankDrive(double lPower, double rPower){
		drive.tankDrive(lPower, rPower);
	}
	
	public void arcadeDrive(double xSpeed, double zRotation) {
		drive.arcadeDrive(xSpeed, zRotation);
	}

	public void stop()
	{
		drive.stopMotor();
	}
	
/*	private static void printOutDebugData(String info) {
		if(CatzRobotMap.debugMode == true) {
			double current+Time = CatzRobotMap.globalTimer.get();
			System.out.println(currentTime + "  -" + info);
		} 
} */
}
