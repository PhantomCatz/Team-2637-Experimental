package org.usfirst.frc.team2637.robot;
import com.ctre.CANTalon;
public class CatzCANTalon 
{
	CANTalon cantalon;
	public CatzCANTalon(int port)
	{
		cantalon = new CANTalon(port);
	}
	public double GetSpeed()
	{
		return cantalon.getSpeed();
	}
	public void SetSpeed(double speed)
	{
		cantalon.set(speed);
	}
}
