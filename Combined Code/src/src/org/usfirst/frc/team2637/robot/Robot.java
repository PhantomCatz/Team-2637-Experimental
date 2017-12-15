package org.usfirst.frc.team2637.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
public class Robot extends IterativeRobot 
{
	final int XBOX_PORT         = 0;
	final int JOYSTICK_PORT     = 1;
	
	final int FRONT_LEFT_DRIVE  = 0;
	final int REAR_LEFT_DRIVE   = 1;
	final int FRONT_RIGHT_DRIVE = 4;
	final int REAR_RIGHT_DRIVE  = 5;
	
	final int LEFT_SHOOTER      = 2;
	final int RIGHT_SHOOTER     = 3;
	
	final int LEFT_JOSTLER      = 4;
	final int RIGHT_JOSTLER     = 5;
	
	final int KICKER   = 1;
	final int INTAKE   = 2;
	final int CONVEYOR = 3;
	
	final double FULL_POWER  = 1;
	final double NO_POWER    = 0;
	final double HALF_POWER  = 0.5;
	final double SIXTY_POWER = 0.6;
	
	boolean shooterToggle = false;
	
	CatzXboxController xbox;
	CatzJoystick joy;
	
	CatzCANTalon frontRightDrive;
	CatzCANTalon frontLeftDrive;
	CatzCANTalon rearRightDrive;
	CatzCANTalon rearLeftDrive;
	CatzDrive driver;
	CatzCANTalon rShooter;
	CatzCANTalon lShooter;
	
	CatzSpark intake;
	CatzSpark lJostler;
	CatzSpark rJostler;
	CatzSpark conveyor;
	CatzSpark kicker;

	public Robot() 
	{
		frontRightDrive = new CatzCANTalon(FRONT_RIGHT_DRIVE);
		frontLeftDrive  = new CatzCANTalon(FRONT_LEFT_DRIVE);
		rearRightDrive  = new CatzCANTalon(REAR_RIGHT_DRIVE);
		rearLeftDrive   = new CatzCANTalon(REAR_LEFT_DRIVE);
		
		rShooter = new CatzCANTalon(RIGHT_SHOOTER);
		lShooter = new CatzCANTalon(LEFT_SHOOTER);
		driver   = new CatzDrive(FRONT_RIGHT_DRIVE, FRONT_LEFT_DRIVE, REAR_RIGHT_DRIVE, REAR_LEFT_DRIVE);
		
		intake   = new CatzSpark(INTAKE);
		lJostler = new CatzSpark(LEFT_JOSTLER);
		rJostler = new CatzSpark(RIGHT_JOSTLER);
		kicker   = new CatzSpark(KICKER);
		conveyor = new CatzSpark(CONVEYOR);
		
		xbox = new CatzXboxController(XBOX_PORT);
		joy = new CatzJoystick(JOYSTICK_PORT);
	}

	@Override
	public void teleopPeriodic() 
	{
		driver.ArcadeDrive(xbox.GetLeftStickY(), xbox.GetRightStickX());
		
		if (joy.GetThumbButton() == true) 
		{
			shooterToggle = !shooterToggle;
		}
		if (shooterToggle) 
		{
			rShooter.SetSpeed(SIXTY_POWER);
			lShooter.SetSpeed(-SIXTY_POWER);
			lJostler.SetSpeed(HALF_POWER);
			rJostler.SetSpeed(HALF_POWER);
		} 
		else 
		{
			rShooter.SetSpeed(NO_POWER);
			lShooter.SetSpeed(NO_POWER);
			lJostler.SetSpeed(NO_POWER);
			rJostler.SetSpeed(NO_POWER);

		}

		if (joy.GetTrigger()) 
		{
			conveyor.SetSpeed(FULL_POWER);
		} 
		else 
		{
			conveyor.SetSpeed(NO_POWER);
		}

		if (xbox.GetRightTrigger()>HALF_POWER) 
		{
			intake.SetSpeed(-FULL_POWER);
		} 
		else 
		{
			intake.SetSpeed(NO_POWER);
		}

	}
}
