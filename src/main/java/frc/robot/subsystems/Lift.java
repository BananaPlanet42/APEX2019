package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
// import frc.robot.commands.MoveLift;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.OI;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.utils.Booleans;
// import frc.robot.Robot;


public class Lift extends Subsystem{
// public boolean IsEndGame = Robot.booleans.IsEndGame;
public boolean IsEndGame = Robot.booleans.IsEndGame;
// public boolean IsLocked = Robot.booleans.LiftIsLocked;
 
public TalonSRX Lift1 = RobotMap.Lift1;
public DoubleSolenoid LiftSolenoid1 = RobotMap.LiftSolenoid1;

   
    public void lift(ControlMode controlmode, double TargetPosition){
    // if (IsEndGame == false && position <= 0){
    //     Lift1.set(ControlMode.MotionMagic, 1);
    // }
    // else{
    //     Lift1.set(controlmode, position); 
    // }
    
        // Lift1.set(ControlMode.MotionMagic, TargetPosition);
      
    Lift1.set(controlmode, TargetPosition);
    // System.out.println("Moving to" + TargetPosition);
   
   }

   public void lift(double power){
    // if (IsEndGame == false && position <= 0){
    //     Lift1.set(ControlMode.MotionMagic, 1);
    // }
    // else{
    //     Lift1.set(ControlMode.PercentOutput, power); 
    // 
     if(OI.xbox2.getY(Hand.kRight) >= 0.2 || OI.xbox2.getY(Hand.kRight) <= -0.2) {
    Lift1.set(ControlMode.PercentOutput, power);
     }
     else{
         end();
     }
   }



   

   public void lockLift(){
    LiftSolenoid1.set(Value.kForward);
    Robot.booleans.LiftIsLocked = true;   }

   public void releaseLift(){
    LiftSolenoid1.set(Value.kReverse);
    Robot.booleans.LiftIsLocked = false;
   }

   public void endLiftLock(){
       LiftSolenoid1.set(Value.kOff);
   }
   public void end(){
   }

   public void ZeroLift(){
       Lift1.setSelectedSensorPosition(0);
   }
    public void initDefaultCommand(){
        // setDefaultCommand(new MoveLift(0));
    }
}