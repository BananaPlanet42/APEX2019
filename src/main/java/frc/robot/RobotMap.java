/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import frc.robot.utils.ControllerConfig;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.models.*;
import frc.robot.commands.ReleaseLift;

public class RobotMap {

//drive train stuff
  public static BobTalonSRX R1;
  public static BobTalonSRX L1;

  public static VictorSPX R2;
  public static VictorSPX R3;
  public static VictorSPX L2;
  public static VictorSPX L3;
//lift stuff
  public static TalonSRX Lift1;
  public static VictorSPX Lift2;
  public static DoubleSolenoid LiftSolenoid1;
  public static DoubleSolenoid LiftSolenoid2;
//intake/eater stuff
  public static TalonSRX Intake;

// crossbow stuff
  public static DoubleSolenoid Crossbow1;
  public static DoubleSolenoid Crossbow2;

  //climber stuff
  public static DoubleSolenoid ClimberPneu1;
  public static DoubleSolenoid ClimberLock1;
  public static TalonSRX Climber1;
  public static VictorSPX Climber2;

  public static void init(){
    System.out.println("Initializing Speed Controllers");

    //left side drive base
    L1 = new BobTalonSRX(PortMap.L1, false); //Create lead drive talon with inversion settings
    ControllerConfig.setDriveLeader(L1, false);
    L2 = new VictorSPX(PortMap.L2);
    ControllerConfig.setDriveFollower(L2, L1, L1.getInverted());
    L3 = new VictorSPX(PortMap.L3);
    ControllerConfig.setDriveFollower(L3, L1, L1.getInverted());

    //right side drive base
    R1 = new BobTalonSRX(PortMap.R1, true); //Create lead drive talon with inversion settings
    ControllerConfig.setDriveLeader(R1, true);
    R2 = new VictorSPX(PortMap.R2);
    ControllerConfig.setDriveFollower(R2, R1, R1.getInverted());
    R3 = new VictorSPX(PortMap.R3);
    ControllerConfig.setDriveFollower(R3, R1, R1.getInverted());
//lift stuff
Lift1 = new TalonSRX(PortMap.Lift1);
ControllerConfig.setLiftLead(Lift1);
Lift2 = new VictorSPX(PortMap.Lift2);
ControllerConfig.setLiftFollower(Lift2, Lift1, false);
LiftSolenoid1 = new DoubleSolenoid(PortMap.Lift_Solenoid1_Forward_Channel, PortMap.Lift_Solenoid1_Reverse_Channel);
// new ReleaseLift();

//intake stuff
Intake = new TalonSRX(PortMap.Intake);
// //crossbow stuff
Crossbow1 = new DoubleSolenoid(PortMap.Crossbow1_Forward_Channel, PortMap.Crossbow1_Reverse_Channel);
// //climber stuff
ClimberPneu1 = new DoubleSolenoid(PortMap.ClimberSolenoid1_Forward_Channel, PortMap.ClimberSolenoid1_Reverse_Channel);
ClimberLock1 = new DoubleSolenoid(PortMap.ClimberLockSolenoid1_Forward_Channel, PortMap.ClimberLockSolenoid1_Reverse_Channel);
Climber1 = new TalonSRX(PortMap.Climber1);
ControllerConfig.setClimbLead(Climber1);
Climber2 = new VictorSPX(PortMap.Climber2);
ControllerConfig.setClimbFollower(Climber2, Climber1);

// Climber2.setInverted(true);
}






  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
// public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
