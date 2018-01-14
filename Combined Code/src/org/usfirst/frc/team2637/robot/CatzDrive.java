package org.usfirst.frc.team2637.robot;
import edu.wpi.first.wpilibj.RobotDrive;
public class CatzDrive
{
	
	final String NAME;
	CatzLogger log;
	RobotDrive Drive;
	CatzTimer timers;
	
	public CatzDrive(int frontRightID, int frontLeftID, int backRightID, int backLeftID)
	{
		log = CatzLogger.getInstance();
		NAME = this.getClass().getSimpleName();
		Drive = new RobotDrive(frontRightID, frontLeftID, backRightID, backLeftID);
		timer = CatzTimer.getInstance();
	}
	public void setModeArcadeDriveRacing(CatzXboxController control)
	{
		log.add(NAME, "Arcade Drive set to Racing.", 5, timer.getTime());
		Drive.arcadeDrive(control.GetRightTrigger()-control.GetLeftTrigger(), control.GetRightStickX());
	}
	public void setModeArcadeDriveFlash(CatzXboxController control)
	{
		log.add(NAME, "Arcade Drive set to Flash.", 5, timer.getTime());
		Drive.arcadeDrive(control.GetLeftStickY(), control.GetRightStickX());
	}
}