package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.commands.ClimberLock;
import frc.robot.commands.ClimberRelease;

public class ClimberTimingRetract extends CommandGroup {
    public ClimberTimingRetract() {
       // Robot.booleans.ClimberIsLocked = true;
       addSequential(new ExtendClimberBasic(), 1);
        addSequential(new ClimberRelease(), 1);
        addSequential(new RetractClimberBasic(), 1);
        addSequential(new ClimberLock(), 1);
    }
}
