package frc.robot.commands;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Lift;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID.Hand;
// import edu.wpi.first.wpilibj.command.*;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class MoveLiftManual extends Command {
    // double position;
    // public TalonSRX Lift1 = RobotMap.Lift1;

    public MoveLiftManual() {
        requires(Robot.lift);
        // this.position = RobotMap.Lift1.getSelectedSensorPosition(0);
    }

    protected void initialize() {

    }

    protected void execute() {
        int position = RobotMap.Lift1.getSelectedSensorPosition(0);
        double targetPosition=position+(-450*OI.xbox2.getY(Hand.kLeft));
        // Robot.lift.lift(ControlMode.PercentOutput, 0.5);
        // Robot.lift.lift();

        if (OI.xbox2.getY(Hand.kLeft) >= 0.2 || OI.xbox2.getY(Hand.kLeft) <= -0.2) {
            Robot.lift.lift(ControlMode.MotionMagic, targetPosition);
            // System.out.println("moving manual to " + targetPosition);
            // Robot.lift.lift(ControlMode.PercentOutput, -0.7 * OI.xbox2.getY(Hand.kLeft));
        }
        else {
            end();
        }
    }

    protected boolean isFinished() {
        return false;

    }

    protected void end() {
        //Robot.lift.lift(ControlMode.PercentOutput, 0.0);
        new LiftHoldPosition();
    }

    protected void interrupted() {
        end();
    }

}