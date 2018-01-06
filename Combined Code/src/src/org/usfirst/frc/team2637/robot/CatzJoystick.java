package org.usfirst.frc.team2637.robot;

import edu.wpi.first.wpilibj.Joystick;

public class CatzJoystick
{
	logger log = new logger();
	final int TRIGGER = 1;
	final int SIDE_THUMB = 2;
	final int THUMB_BOTTOM_LEFT = 3;
	final int THUMB_BOTTOM_RIGHT = 4;
	final int THUMB_TOP_LEFT = 5;
	final int THUMB_TOP_RIGHT = 6;
	final int BUTTON_SEVEN = 7;
	final int BUTTON_EIGHT = 8;
	final int BUTTON_NINE = 9;
	final int BUTTON_TEN = 10;
	final int BUTTON_ELEVEN = 11;
	final int BUTTON_TWELVE = 12;
	final int STICK_X_AXIS = 0;
	final int STICK_Y_AXIS = 1;
	final int STICK_Z_AXIS = 2;
	final int SLIDER = 3;
	Joystick joy;
	
	public CatzJoystick(int port)
	{
		joy = new Joystick(port);
	}
	public boolean GetTrigger()
	{
		return joy.getRawButton(TRIGGER);
	}
	public boolean GetSideThumb()
	{
		return joy.getRawButton(SIDE_THUMB);
	}
	public boolean GetThumbBottomLeft()
	{
		return joy.getRawButton(THUMB_BOTTOM_LEFT);
	}
	public boolean GetThumbBottomRight()
	{
		return joy.getRawButton(THUMB_BOTTOM_RIGHT);
	}
	public boolean GetThumbTopLeft()
	{
		return joy.getRawButton(THUMB_TOP_LEFT);
	}
	public boolean GetThumbTopRight()
	{
		return joy.getRawButton(THUMB_TOP_RIGHT);
	}
	public boolean GetButtonSeven()
	{
		return joy.getRawButton(BUTTON_SEVEN);
	}
	public boolean GetButtonEight()
	{
		return joy.getRawButton(BUTTON_EIGHT);
	}
	public boolean GetButtonNine()
	{
		return joy.getRawButton(BUTTON_NINE);
	}
	public boolean GetButtonTen()
	{
		return joy.getRawButton(BUTTON_TEN);
	}
	public boolean GetButtonEleven()
	{
		return joy.getRawButton(BUTTON_ELEVEN);
	}
	public boolean GetButtonTwelve()
	{
		return joy.getRawButton(BUTTON_TWELVE);
	}
	public double GetXAxis()
	{
		return joy.getRawAxis(STICK_X_AXIS);
	}
	public double GetYAxis()
	{
		return joy.getRawAxis(STICK_Y_AXIS);
	}
	public double GetZAxis()
	{
		return joy.getRawAxis(STICK_Z_AXIS);
	}
	public double GetSlider()
	{
		return joy.getRawAxis(SLIDER);
	}
}