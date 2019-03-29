package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class CatzDrive
{

    public static WPI_TalonSRX fRight;
    public static WPI_TalonSRX rRight;
    public static WPI_TalonSRX fLeft;
    public static WPI_TalonSRX rLeft;
    
    public static SpeedControllerGroup leftMotors;
    public static SpeedControllerGroup rightMotors;

    public static Encoder leftDTEncoder;

    public DifferentialDrive drive;

    public CatzDrive()
    {

        fRight = new WPI_TalonSRX(4);
        rRight = new WPI_TalonSRX(5);
        fLeft  = new WPI_TalonSRX(0);
        rLeft  = new WPI_TalonSRX(1);

        leftMotors = new SpeedControllerGroup(fLeft, rLeft);
        rightMotors = new SpeedControllerGroup(fRight, rLeft);

        drive = new DifferentialDrive(leftMotors, rightMotors);
        drive.setSafetyEnabled(false);

        leftDTEncoder = new Encoder(6, 7, false, Encoder.EncodingType.k4X);
        leftDTEncoder.setDistancePerPulse(0.1);

    }
    
    public double getDriveTrainEncoderDistance()
    {
        return leftDTEncoder.getDistance();
    }

    public void arcadeDrive(double xSpeed, double zRotation)
    {
        drive.arcadeDrive(xSpeed, zRotation);
    }

}