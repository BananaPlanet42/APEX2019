package frc.robot.commands;
// import frc.robot.OI;
import frc.robot.Robot;
// import frc.robot.subsystems.Lift;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.*;
import frc.robot.RobotMap;

public class MoveLift extends Command {
double position;
double GoalPosition;

public MoveLift(double TargetPosition){
    requires(Robot.lift);
    this.position = RobotMap.Lift1.getSelectedSensorPosition();
    this.GoalPosition = TargetPosition;
}

protected void initialize(){

}
protected void execute(){
    Robot.lift.lift(ControlMode.MotionMagic, GoalPosition);
    System.out.println("Moving lift to" + GoalPosition);
    
    
}


protected boolean isFinished() {
    // if (RobotMap.Lift1.getSelectedSensorPosition(0) <= GoalPosition + 10 && RobotMap.Lift1.getSelectedSensorPosition(0) >= GoalPosition - 10){

    // return true;
    // }
    // else return false;
    return false;

}
protected void end() {
    System.out.println("Going to Hold Position");
    new LiftHoldPosition();

}

protected void interrupted(){
    System.out.println("Interrupted");
    end();
}

}