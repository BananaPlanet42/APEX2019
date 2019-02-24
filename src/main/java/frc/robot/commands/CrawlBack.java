package frc.robot.commands; 

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Climber;
import frc.robot.RobotMap;

public class CrawlBack extends Command{
    public CrawlBack(){
       
    }

    protected void initialize(){
       
    }

    protected void execute(){
        Robot.climber.ClimberManualBack();


    }

    protected boolean isFinished(){
        return false; 
    }

    protected void end(){
        Robot.climber.ClimberStop();
    }

    protected void interrupted(){
        end();
    }
}