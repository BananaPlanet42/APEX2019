// package frc.robot.commands;

// // import frc.robot.subsystems.Lift;
// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.Robot;
// import frc.robot.RobotMap;

// public class LockElevator extends Command {
    
//     public LockElevator() {

//     }

//     protected void initialize() {

//     }

//     protected void execute() {
//         RobotMap.Lift1.config_kP(0, 1.0, 0);
//         RobotMap.Lift1.config_kI(0, 0, 0);
//         RobotMap.Lift1.config_kD(0, 10, 0);
//         RobotMap.Lift1.config_kF(0, 0.9, 0);
//         RobotMap.Lift1.configMotionAcceleration(3500, 0); //3500 // 7000 //10500
//         RobotMap.Lift1.configMotionCruiseVelocity(3500, 0);
//         Robot.lift.lockLift();
//         // Robot.booleans.LiftIsLocked = true;

//     }

//     protected boolean isFinished() {
//         return false;
//     }

//     protected void end() {
//         // Robot.lift.endLiftLock();
//         // Robot.booleans.IsLocked = false;
//         // Robot.lift.releaseLift();
//     }

//     protected void interrupted() {
//         end();
//     }
// }
