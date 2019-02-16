package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.GenericHID.Hand;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Climber extends Subsystem{

    public DoubleSolenoid ClimberPneu = RobotMap.ClimberPneu1;
    public TalonSRX Climber1 = RobotMap.Climber1;
   
    public void ExtendClimber(){
        ClimberPneu.set(Value.kForward);
    }

    public void RetractClimber(){
        ClimberPneu.set(Value.kReverse);
    }

    public void ClimberForward(){
        Climber1.set(ControlMode.PercentOutput, 0.7);
    }

    public void ClimberReverse(){
        Climber1.set(ControlMode.PercentOutput, -0.7);
    }

    public void ClimberStop(){
        Climber1.set(ControlMode.PercentOutput, 0.0);
    }

    public void ClimberManualForward(){
        if(OI.xbox2.getTriggerAxis(Hand.kLeft) >= 0.2){
            Climber1.set(ControlMode.PercentOutput, 0.5 * OI.xbox2.getTriggerAxis(Hand.kLeft));
        }
        else{
            ClimberStop();
        }
    }

    public void ClimberManualBack(){
        if(OI.xbox2.getTriggerAxis(Hand.kRight) >= 0.2){
            Climber1.set(ControlMode.PercentOutput, -0.5 * OI.xbox2.getTriggerAxis(Hand.kRight));
        }
        else if(OI.xbox2.getTriggerAxis(Hand.kRight) >= -0.2){
            Climber1.set(ControlMode.PercentOutput, -0.5 * OI.xbox2.getTriggerAxis(Hand.kRight));            
        }
        else{
            ClimberStop();
        }
    }

    @Override
    public void initDefaultCommand(){

    
    }
}
