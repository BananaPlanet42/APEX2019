// package frc.robot.commands;
// import frc.robot.OI;
// import frc.robot.Robot;
// import frc.robot.subsystems.Lift;
// import com.ctre.phoenix.motorcontrol.ControlMode;
// import edu.wpi.first.wpilibj.GenericHID.Hand;
// import edu.wpi.first.wpilibj.command.*;
// import frc.robot.RobotMap;

// public class MoveLift extends Command {
// double position;
// double TargetPosition;
// public MoveLift(double TargetPosition){
//     // requires(Robot.lift);
//     this.position= RobotMap.Lift1.getSelectedSensorPosition(0);
// }

// protected void initialize(){

// }
// protected void execute(double TargetPosition){
//     Robot.lift.lift(ControlMode.MotionMagic, TargetPosition);
    
// }


// protected boolean isFinished() {
//     if (RobotMap.Lift1.getSelectedSensorPosition(0) <= TargetPosition + 10 && RobotMap.Lift1.getSelectedSensorPosition(0) >= TargetPosition + 10){

//     return true;
//     }
//     else return false;

// }
// protected void end() {
//     Robot.lift.lift(ControlMode.MotionMagic, RobotMap.Lift1.getSelectedSensorPosition(0));

// }

// protected void interrupted(){
    
// }

// }