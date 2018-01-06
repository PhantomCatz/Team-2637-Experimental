package org.usfirst.frc.team2637.robot;
import edu.wpi.first.wpilibj.RobotDrive;
public class CatzDrive
{
	RobotDrive Drive;
	public CatzDrive(int frontRightID, int frontLeftID, int backRightID, int backLeftID)
	{
		Drive = new RobotDrive(frontRightID, frontLeftID, backRightID, backLeftID);
	}
	public void setModeArcadeDriveRacing(CatzXboxController control)
	{
		Drive.arcadeDrive(control.GetRightTrigger()-control.GetLeftTrigger(), control.GetRightStickX());
	}
	public void setModeArcadeDriveFlash(CatzXboxController control)
	{
		Drive.arcadeDrive(control.GetLeftStickY(), control.GetRightStickX());
	}
}