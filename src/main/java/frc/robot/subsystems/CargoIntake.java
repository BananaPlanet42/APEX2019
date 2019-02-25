package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// import com.ctre.phoenix.*;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.CargoIntakeCreep;

public class CargoIntake extends Subsystem {
    public TalonSRX Intake = RobotMap.Intake;

    public void Intake() {
        RobotMap.Intake.set(ControlMode.PercentOutput, 1.0);
    }

    public void IntakeManual() {
        Intake.set(ControlMode.PercentOutput, 1.0 * OI.xbox2.getTriggerAxis(Hand.kLeft));

    }

    public void IntakeCustom(double speed) {
        RobotMap.Intake.set(ControlMode.PercentOutput, speed);

    }

    public void Expel() {
        RobotMap.Intake.set(ControlMode.PercentOutput, -1.0);

    }

    public void ExpelManual() {
        Intake.set(ControlMode.PercentOutput, -.7 * OI.xbox2.getTriggerAxis(Hand.kRight));

        // else if(OI.xbox2.getTriggerAxis(Hand.kRight) >= -0.2){
        // Intake.set(ControlMode.PercentOutput, -0.5 *
        // OI.xbox2.getTriggerAxis(Hand.kRight));
        // }

    }

    @Override
    public void initDefaultCommand() {
        new CargoIntakeCreep();
    }

    public void end() {
        RobotMap.Intake.set(ControlMode.PercentOutput, 0.0);
    }
}
