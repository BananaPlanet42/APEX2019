package frc.robot.commands;
 
// import frc.robot.subsystems.Lift;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


public class ReleaseLift extends Command{
    public ReleaseLift(){
       
    }

    protected void initialize(){
       
    }

    protected void execute(){
        Robot.lift.releaseLift();
        Robot.booleans.IsLocked = false;

    }

    protected boolean isFinished(){
        return false; 
    }

    protected void end(){
        Robot.lift.endLiftLock();
    }

    protected void interrupted(){
        end();
    }
}
