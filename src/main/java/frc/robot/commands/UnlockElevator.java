package frc.robot.commands;

// import frc.robot.subsystems.Lift;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class UnlockElevator extends Command {
  public UnlockElevator() {

  }

  protected void initialize() {

  }

  protected void execute() {
    Robot.lift.releaseLift();
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {

  }

  protected void interrupted() {
    end();
  }
}
