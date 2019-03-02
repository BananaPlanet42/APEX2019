package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.commands.ClimberLock;
import frc.robot.commands.ClimberRelease;

public class ClimberHookTiming extends CommandGroup {
    public ClimberHookTiming() {
       // Robot.booleans.ClimberIsLocked = true;
        addSequential(new ClimberRelease());
        addSequential(new ExtendClimberBasic());
        addSequential(new ClimberLock());
    }
}
