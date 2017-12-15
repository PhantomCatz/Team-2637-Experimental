package org.usfirst.frc.team2637.robot;

import edu.wpi.first.wpilibj.Joystick;

public class CatzJoystick
{
	logger log = new logger();
	final int TRIGGER = 1;
	final int THUMB_BUTTON = 2;
	final int BUTTON_THREE = 3;
	final int BUTTON_FOUR = 4;
	final int BUTTON_FIVE = 5;
	final int BUTTON_SIX = 6;
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
		log.setLogLevel(3);
	}
	public boolean GetTrigger()
	{
		return joy.getRawButton(TRIGGER);
	}
	public boolean GetThumbButton()
	{
		log.add("thumb button", 3, 1.1);
		return joy.getRawButton(THUMB_BUTTON);
	}
	public boolean GetButtonThree()
	{
		return joy.getRawButton(BUTTON_THREE);
	}
	public boolean GetButtonFour()
	{
		return joy.getRawButton(BUTTON_FOUR);
	}
	public boolean GetButtonFive()
	{
		return joy.getRawButton(BUTTON_FIVE);
	}
	public boolean GetButtonSix()
	{
		return joy.getRawButton(BUTTON_SIX);
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