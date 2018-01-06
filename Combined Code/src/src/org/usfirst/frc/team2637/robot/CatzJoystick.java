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
	public boolean getTrigger()
	{
		return joy.getRawButton(TRIGGER);
	}
	public boolean getSideThumb()
	{
		return joy.getRawButton(SIDE_THUMB);
	}
	public boolean getThumbBottomLeft()
	{
		return joy.getRawButton(THUMB_BOTTOM_LEFT);
	}
	public boolean getThumbBottomRight()
	{
		return joy.getRawButton(THUMB_BOTTOM_RIGHT);
	}
	public boolean getThumbTopLeft()
	{
		return joy.getRawButton(THUMB_TOP_LEFT);
	}
	public boolean getThumbTopRight()
	{
		return joy.getRawButton(THUMB_TOP_RIGHT);
	}
	public boolean getButtonSeven()
	{
		return joy.getRawButton(BUTTON_SEVEN);
	}
	public boolean getButtonEight()
	{
		return joy.getRawButton(BUTTON_EIGHT);
	}
	public boolean getButtonNine()
	{
		return joy.getRawButton(BUTTON_NINE);
	}
	public boolean getButtonTen()
	{
		return joy.getRawButton(BUTTON_TEN);
	}
	public boolean getButtonEleven()
	{
		return joy.getRawButton(BUTTON_ELEVEN);
	}
	public boolean getButtonTwelve()
	{
		return joy.getRawButton(BUTTON_TWELVE);
	}
	public double getXAxis()
	{
		return joy.getRawAxis(STICK_X_AXIS);
	}
	public double getYAxis()
	{
		return joy.getRawAxis(STICK_Y_AXIS);
	}
	public double getZAxis()
	{
		return joy.getRawAxis(STICK_Z_AXIS);
	}
	public double getSlider()
	{
		return joy.getRawAxis(SLIDER);
	}
}