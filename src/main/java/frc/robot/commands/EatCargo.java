package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.RobotMap;
// import frc.robot.subsystems.*;
// import frc.robot.subsystems.CargoIntake;
import frc.robot.*;

public class EatCargo extends Command {
    
    
    protected void initialize() {
    }

    protected void execute() {
     Robot.cargoIntake.IntakeManual();
    }

    public boolean isFinished(){
        return false;
    }

    protected void interrupted() {
        end();
    }

    protected void end() {
        Robot.cargoIntake.end();
    }
}