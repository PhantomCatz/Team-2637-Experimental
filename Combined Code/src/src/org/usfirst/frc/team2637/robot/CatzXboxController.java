package org.usfirst.frc.team2637.robot;
import edu.wpi.first.wpilibj.XboxController;
public class CatzXboxController
{
	logger log = new logger();
	final int A_BUTTON = 1;
	final int B_BUTTON = 2;
	final int X_BUTTON = 3;
	final int Y_BUTTON = 4;
	final int LEFT_BUMPER = 5;
	final int RIGHT_BUMPER = 6;
	final int LEFT_STICK_X = 0;
	final int LEFT_STICK_Y = 1;
	final int LEFT_TRIGGER = 2;
	final int RIGHT_TRIGGER = 3;
	final int RIGHT_STICK_X = 4;
	final int RIGHT_STICK_Y = 5;
	XboxController xbox;
	public CatzXboxController(int port)
	{
		xbox = new XboxController(port);
		log.setLogLevel(3);
	}
	public boolean getAButton()
	{
		return xbox.getRawButton(A_BUTTON);
	}
	public boolean getBButton()
	{
		return xbox.getRawButton(B_BUTTON);
	}
	public boolean getXButton()
	{
		return xbox.getRawButton(X_BUTTON);
	}
	public boolean getYButton()
	{
		return xbox.getRawButton(Y_BUTTON);
	}
	public boolean getLeftBumper()
	{
		return xbox.getRawButton(LEFT_BUMPER);
	}
	public boolean getRightBumper()
	{
		return xbox.getRawButton(RIGHT_BUMPER);
	}
	public double getLeftStickX()
	{
		return xbox.getRawAxis(LEFT_STICK_X);
	}
	public double getLeftStickY()
	{
		return -(xbox.getRawAxis(LEFT_STICK_Y));
	}
	public double getRightStickX()
	{
		return xbox.getRawAxis(RIGHT_STICK_X);
	}
	public double getRightStickY()
	{
		return -(xbox.getRawAxis(RIGHT_STICK_Y));
	}
	public double getRightTrigger()
	{
		return xbox.getRawAxis(RIGHT_TRIGGER);
	}
	public double getLeftTrigger()
	{
		return xbox.getRawAxis(LEFT_TRIGGER);
	}
}