package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.commands.ClimberLock;
import frc.robot.commands.ClimberRelease;

public class ClimberCollect extends CommandGroup {
    public ClimberCollect() {
       // Robot.booleans.ClimberIsLocked = true;
        addSequential(new ClimberRelease(), .5);
        addSequential(new ExtendClimberBasic(), .3);
        addSequential(new ClimberLock(), .1);
    }
}
