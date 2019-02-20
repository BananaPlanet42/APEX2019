package frc.robot.utils;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.RobotMap;
import frc.robot.commands.ZeroLiftEncoder;
import frc.robot.commands.MoveLift;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import com.ctre.phoenix.sensors.PigeonIMU;

import frc.robot.commands.ClimberPrep;
import frc.robot.commands.LockElevator;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class SmartDashConfig {
    public static void Testing() {
        //SmartDashboard.putNumber("Lift1 encoder position", RobotMap.Lift1.getSelectedSensorPosition(0));
        //SmartDashboard.putNumber("L1 encoder position", RobotMap.L1.getSelectedSensorPosition(0));
        //SmartDashboard.putNumber("R1 encoder position", RobotMap.R1.getSelectedSensorPosition(0));
        //SmartDashboard.putNumber("RobotAngle",  Robot.driveTrain.getAngle());

       // SmartDashboard.putData("ZeroLift", new ZeroLiftEncoder());
        //SmartDashboard.putBoolean("LiftLocked?", Robot.booleans.IsLocked);







        //SmartDashboard.putNumber("Lift 1 error", angle - Lift1.getSelectedSensorPosition(0)*360/4096);
       
    }

    public static void commands(){
        //SmartDashboard.putData("MoveLift: Top", new MoveLift(19000));
        //SmartDashboard.putData("MoveLift: LV2", new MoveLift(16000));
        //SmartDashboard.putData("MoveLift: LV1", new MoveLift(7600));
       // SmartDashboard.putData("MoveLift: Bottom", new MoveLift(2100));

       // SmartDashboard.putData("LockLift", new LockElevator());
        //SmartDashboard.putData("Prep Climb", new ClimberPrep());
    }
    
    public static void Comp() {
        //SmartDashboard.putData("Auto mode", chooser);
        
    }
}