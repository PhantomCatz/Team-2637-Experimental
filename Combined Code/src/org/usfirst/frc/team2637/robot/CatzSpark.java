package org.usfirst.frc.team2637.robot;

import edu.wpi.first.wpilibj.Spark;

public class CatzSpark 
{
	Spark spark;
	public CatzSpark(int port)
	{
		spark = new Spark(port);
	}
	public double GetSpeed()
	{
		return spark.get();
	}
	public void SetSpeed(double speed)
	{
		spark.set(speed);
	}
}
