package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
// import frc.robot.commands.*;
import frc.robot.commands.ExtendClimber; 
// import frc.robot.utils.Booleans;

public class ClimberPrep extends CommandGroup{
    public ClimberPrep(){
        // Robot.booleans = true;
        Robot.booleans.IsEndGame = true;
        addParallel(new ExtendClimber());
        // addSequential(new MoveLift(1000));
        addSequential(new LockElevator());
        
    } 


}