// package frc.robot.commands;

// // import frc.robot.subsystems.Lift;
// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.Robot;

// public class LockElevator extends Command {
    
//     public LockElevator() {

//     }

//     protected void initialize() {

//     }

//     protected void execute() {
//         Robot.lift.lockLift();
//         // Robot.booleans.LiftIsLocked = true;

//     }

//     protected boolean isFinished() {
//         return false;
//     }

//     protected void end() {
//         // Robot.lift.endLiftLock();
//         // Robot.booleans.IsLocked = false;
//         Robot.lift.releaseLift();
//     }

//     protected void interrupted() {
//         end();
//     }
// }
