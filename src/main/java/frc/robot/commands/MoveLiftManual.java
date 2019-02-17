// package frc.robot.commands;
// import frc.robot.OI;
// import frc.robot.Robot;
// import frc.robot.subsystems.Lift;
// import com.ctre.phoenix.motorcontrol.ControlMode;
// import edu.wpi.first.wpilibj.GenericHID.Hand;
// import edu.wpi.first.wpilibj.command.*;
// import frc.robot.RobotMap;

// public class MoveLiftManual extends Command {
// double position;
// public MoveLiftManual(){
//     requires(Robot.lift);
//     this.position = RobotMap.Lift1.getSelectedSensorPosition(0);
// }

// protected void initialize(){

// }
// protected void execute(){
    
//     if (OI.xbox2.getY(Hand.kLeft) >= 0.2  || OI.xbox2.getY(Hand.kLeft) <= -0.2) {
//         Robot.lift.lift(ControlMode.MotionMagic, position + 10*OI.xbox2.getY(Hand.kLeft));
//     }
   
//     else end();

// }


// protected boolean isFinished() {
//      return false;

// }
// protected void end() {
//     Robot.lift.lift(ControlMode.MotionMagic, RobotMap.Lift1.getSelectedSensorPosition(0));

// }

// protected void interrupted(){
    
// }

// }