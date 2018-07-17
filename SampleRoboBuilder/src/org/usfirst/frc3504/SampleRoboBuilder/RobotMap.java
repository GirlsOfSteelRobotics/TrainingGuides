// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3504.SampleRoboBuilder;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX chassisTalonSRX1;
    public static WPI_TalonSRX chassisTalonSRX2;
    public static WPI_TalonSRX chassisTalonSRX3;
    public static WPI_TalonSRX chassisTalonSRX4;
    public static WPI_TalonSRX chassisTalonSRX5;
    public static WPI_TalonSRX chassisTalonSRX6;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisTalonSRX1 = new WPI_TalonSRX(1);
        
        
        chassisTalonSRX2 = new WPI_TalonSRX(2);
        
        
        chassisTalonSRX3 = new WPI_TalonSRX(3);
        
        
        chassisTalonSRX4 = new WPI_TalonSRX(4);
        
        
        chassisTalonSRX5 = new WPI_TalonSRX(5);
        
        
        chassisTalonSRX6 = new WPI_TalonSRX(6);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
