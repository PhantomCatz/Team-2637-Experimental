package org.usfirst.frc.team2637.robot;
import com.ctre.CANTalon;
public class CatzCANTalon 
{
	final String NAME;
	CANTalon cantalon;
	CatzLogger log;
	CatzTimer timer
	
	public CatzCANTalon(int port)
	{
		log = CatzLogger.getInstance();
		timer = CatzTimer.getInsatnce();
		NAME = this.getClass().getSimpleName();
		cantalon = new CANTalon(port);
	}
	public double GetSpeed()
	{
		return cantalon.getSpeed();
	}
	public void SetSpeed(double speed)
	{
		log.add(NAME, "CANTalon speed set at " + speed + ".", 5, timer.getTime());
		cantalon.set(speed);
	}
}
