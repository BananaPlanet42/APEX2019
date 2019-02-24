package frc.robot.commands;

import frc.robot.commands.MoveLift;
import edu.wpi.first.wpilibj.command.*;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class LiftHoldPosition extends Command {
    // TalonSRX Lift1 = Robot.lift.Lift1;

    public LiftHoldPosition() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("Start holding position");

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // double angle = RobotMap.Arm1.getClosedLoopTarget(0);
        double liftPosition = Robot.lift.Lift1.getSelectedSensorPosition(0);
        Robot.lift.Lift1.set(ControlMode.MotionMagic, liftPosition);
        // System.out.println("Holding Lift position at" + liftPosition);

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.println("Done holding position");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}