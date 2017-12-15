package org.usfirst.frc.team2637.robot;
import edu.wpi.first.wpilibj.RobotDrive;
public class CatzDrive
{
	RobotDrive Drive;
	public CatzDrive(int frontRightID, int frontLeftID, int backRightID, int backLeftID)
	{
		Drive = new RobotDrive(frontRightID, frontLeftID, backRightID, backLeftID);
	}
	public void ArcadeDrive(double axis_y, double axis_x)
	{
		Drive.arcadeDrive(axis_y, axis_x);
	}
}
