package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
// import frc.robot.RobotMap;
import frc.robot.models.DriveSignal;
import frc.robot.utils.DriveHelper;

import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
//import org.usfirst.frc5803.RobotTestBench.Robot;
//import org.usfirst.frc5803.RobotTestBench.models.DriveSignal;
//import org.usfirst.frc5803.RobotTestBench.utils.*;

/**
 *
 */

public class Drive extends Command {

    DriveHelper helper;

    public Drive() {
        helper = new DriveHelper();
        // System.out.println("gonna define subsystem");
        requires(Robot.driveTrain);
        // System.out.println("required subsystem");

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("Initialized drive train in coast mode");
        RobotMap.L1.setNeutralMode(NeutralMode.Coast);
        RobotMap.L2.setNeutralMode(NeutralMode.Coast);
        RobotMap.L3.setNeutralMode(NeutralMode.Coast);
        RobotMap.R1.setNeutralMode(NeutralMode.Coast);
        RobotMap.R2.setNeutralMode(NeutralMode.Coast);
        RobotMap.R3.setNeutralMode(NeutralMode.Coast);

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        /*
         * boolean quickTurn = Robot.driveTrain.quickTurnController();
         * Robot.driveTrain.drivedriveSignal);
         */



    if (OI.xbox1.getYButton() == false && Robot.booleans.AutoVision == false){
        if (OI.xbox1.getBumper(Hand.kLeft) == true || OI.xbox1.getBumper(Hand.kRight) == true) {
        double move = OI.xbox1.getY(Hand.kLeft);
        double rotate = OI.xbox1.getX(Hand.kRight);
        boolean quickTurn = Robot.driveTrain.quickTurnController();
        // DriveSignal driveSignal = helper.cheesyDrive(1.0 * -move, 0.15 * rotate, quickTurn, false);
        DriveSignal driveSignal = helper.cheesyDrive(0.5 * -move, 0.5 * rotate, quickTurn, false);
        Robot.driveTrain.drive(ControlMode.PercentOutput, driveSignal);
    } else {
        double move = OI.xbox1.getY(Hand.kLeft);
        double rotate = OI.xbox1.getX(Hand.kRight);
        boolean quickTurn = Robot.driveTrain.quickTurnController();
        // DriveSignal driveSignal = helper.cheesyDrive(1.0 * -move, 0.3 * rotate, quickTurn, false);
        DriveSignal driveSignal = helper.cheesyDrive(1.0 * -move, rotate, quickTurn, false);
        Robot.driveTrain.drive(ControlMode.PercentOutput, driveSignal);
    }}
        

    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {

    }

}