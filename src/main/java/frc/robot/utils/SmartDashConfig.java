// package frc.robot.utils;

// import frc.robot.RobotMap;
// import frc.robot.commands.ZeroLiftEncoder;
// import frc.robot.commands.MoveLift;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import frc.robot.Robot;

// import frc.robot.commands.ClimberPrep;
// import frc.robot.commands.LockElevator;
// // import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

// public class SmartDashConfig {
//     public static void Testing() {

//         SmartDashboard.putNumber("RobotAngle", Robot.driveTrain.getAngle());

//         SmartDashboard.putNumber("L1 encoder distance", Robot.driveTrain.getLeftDriveLeadDistance());
//         SmartDashboard.putNumber("L1 encoder velocity", Robot.driveTrain.getLeftDriveLeadVelocity());

//         SmartDashboard.putNumber("R1 encoder distance", Robot.driveTrain.getRightDriveLeadDistance());
//         SmartDashboard.putNumber("R1 encoder velocity", Robot.driveTrain.getRightDriveLeadVelocity());

//         SmartDashboard.putData("ZeroLift", new ZeroLiftEncoder());
//         // SmartDashboard.putBoolean("LiftLocked?", Robot.booleans.LiftIsLocked);

//         SmartDashboard.putNumber("Lift1 encoder position", RobotMap.Lift1.getSelectedSensorPosition(0));
//         // SmartDashboard.putNumber("Lift 1 error", Robot.lift.Lift1.getClosedLoopError());

//     }

//     public static void commands() {
//         SmartDashboard.putData("MoveLift: Top", new MoveLift(10000));
//         SmartDashboard.putData("MoveLift: LV2", new MoveLift(8000));
//         SmartDashboard.putData("MoveLift: LV1", new MoveLift(5000));
//         SmartDashboard.putData("MoveLift: Bottom", new MoveLift(2100));

//         SmartDashboard.putData("LockLift", new LockElevator());
//         SmartDashboard.putData("Prep Climb", new ClimberPrep());
//     }

//     public static void Comp() {
//         // SmartDashboard.putData("Auto mode", chooser);

//     }
// }