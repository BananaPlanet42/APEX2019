package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
// import frc.robot.subsystems.Crossbow;
// import frc.robot.RobotMap;

public class ExtendClimberBasic extends Command{

    public ExtendClimberBasic(){
    
    }

    protected void initialize(){
    
    }

    protected void execute(){
        Robot.climber.ExtendClimber();
    }

    protected boolean isFinished(){
        return false;
    }

    protected void end(){
    Robot.climber.RetractClimber();

    }

    protected void interrupted(){
        end();
    }
}