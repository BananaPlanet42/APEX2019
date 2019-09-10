package frc.robot.commands.autoCommands;

// import frc.robot.paths.BobPathCreator;
import com.team319.follower.FollowArc;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.arcs.DistanceScalingArc;
import frc.arcs.ExampleArc;
import frc.arcs.LeftFrontCargoArc;
import frc.arcs.LeftSideCloseCargoArc;
import frc.arcs.RightFrontCargoArc;
import frc.arcs.TurnScalingArc;
import frc.arcs.CenterSideCargoArc;
import frc.robot.Robot;

public class RightFrontCargo extends CommandGroup{
    public RightFrontCargo(){
        // addSequential(new FollowArc(Robot.driveTrain, new RightFrontCargoArc()));
    }

}