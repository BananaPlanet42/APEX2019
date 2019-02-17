// package frc.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// import com.ctre.phoenix.*;

// import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import frc.robot.RobotMap;


// public class CargoIntake extends Subsystem {
//     public TalonSRX Intake = RobotMap.Intake;

//     public void Intake(){
//         RobotMap.Intake.set(ControlMode.PercentOutput, -0.5);
//     }

//     public void Expel(){
//         RobotMap.Intake.set(ControlMode.PercentOutput, 0.5 );
       

//     }

 
//     @Override
//     public void initDefaultCommand() {
  
//     }

//     public void end(){
//         RobotMap.Intake.set(ControlMode.PercentOutput, 0.0);
//     }
// }
