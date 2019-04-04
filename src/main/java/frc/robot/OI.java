/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

// import org.graalvm.compiler.replacements.nodes.ReverseBytesNode;
import frc.robot.utils.POVTrigger;
import frc.robot.utils.TriggerButton;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
// import edu.wpi.first.wpilibj.buttons.Trigger;
// import edu.wpi.first.wpilibj.command.Command;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.EatCargo;
import frc.robot.commands.ExtendClimberBasic;
import frc.robot.commands.LiftHoldPosition;
import frc.robot.commands.LiftLock;
import frc.robot.commands.LiftUnlock;
import frc.robot.commands.LockElevator;
import frc.robot.commands.UnlockElevator;
import frc.robot.commands.CrossbowBoop;
import frc.robot.commands.MoveLift;
import frc.robot.commands.MoveLiftManual;
import frc.robot.commands.ReleaseLift;
import frc.robot.commands.RetractClimberBasic;
import frc.robot.commands.CrossbowAcquire;
import frc.robot.commands.SpitCargo;
import frc.robot.commands.TipperDown;
import frc.robot.commands.TipperUp;
import frc.robot.commands.CrawlForward;
import frc.robot.commands.CargoIntakeCreep;
import frc.robot.commands.ClimberLock;
import frc.robot.commands.ClimberPrep;
import frc.robot.commands.ClimberRelease;
import frc.robot.commands.CrawlForward;
import frc.robot.commands.CrawlBack;
import frc.robot.commands.ClimberTimingExtend;
import frc.robot.commands.ClimberTimingRetract;
import frc.robot.commands.ClimberCollect;
import frc.robot.commands.LiftSetPointsActuationDown;
import frc.robot.commands.LiftSetPointsActuationUp;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static XboxController xbox1;
  public static XboxController xbox2;

  public OI() {
    xbox1 = new XboxController(0);
    xbox2 = new XboxController(1);

    Button OpA = new JoystickButton(xbox2, 1); // 1 is equal to A
    OpA.whileHeld(new MoveLiftManual());
    // OpA.whenInactive(new LiftHoldPosition());

    Button OpB = new JoystickButton(xbox2, 2); // 2 is equal to B
    // OpB.whileHeld(new RetractClimberBasic());
    OpB.whenPressed(new ClimberTimingRetract());

    Button OpX = new JoystickButton(xbox2, 3); // 3 is equal to X
    // RPB2.whenPressed(new ClimberPrep());
    // OpX.whileHeld(new ExtendClimberBasic());
    // RPB2.whenInactive(new RetractClimber());
    //OpX.whenPressed(new ClimberTimingExtend());
    OpX.whenPressed(new ClimberCollect());
    OpX.whenReleased(new ClimberTimingRetract());

    Button OpY = new JoystickButton(xbox2, 4); // 4 is equal to Y
    OpY.whileHeld(new CrossbowBoop());

    Button DrA = new JoystickButton(xbox1, 1); // 1 is equal to A
    // DrA.whenPressed(new ClimberPrep());
    //DrA.whileHeld(new ClimberLock());
    DrA.whenPressed(new ClimberTimingExtend());

    Button DrB = new JoystickButton(xbox1, 2); // 2 is equal to B
    DrB.whileHeld(new LiftLock());

    Button DrX = new JoystickButton(xbox1, 3); // 3 is equal to X
    // RPB2.whenPressed(new ClimberPrep());
    DrX.whileHeld(new LiftUnlock());  
    // RPB2.whenInactive(new RetractClimber());

    Button DrY = new JoystickButton(xbox1, 4); // 4 is equal to Y
    //DrY.whileHeld(new ClimberRelease());

    // Y2.whileHeld(new CrawlForward());
    Button LB2 = new JoystickButton(xbox2, 5);
    LB2.whileActive(new TipperDown());

    // Button RB1=new JoystickButton(xbox2,6);
    // RB1.whileHeld(new SpitCargo());
    Button RB2 = new JoystickButton(xbox2, 6);
    RB2.whileActive(new TipperUp());

    TriggerButton RT2 = new TriggerButton(xbox2, 3);
    RT2.whileActive(new SpitCargo());
    RT2.whileActive(new CrawlBack());
    RT2.whenInactive(new CargoIntakeCreep());

    TriggerButton LT2 = new TriggerButton(xbox2, 2);
    LT2.whileActive(new EatCargo());
    LT2.whileActive(new CrawlForward());
    LT2.whenInactive(new CargoIntakeCreep());

    POVTrigger DPAD_UP2 = new POVTrigger(xbox2, 0, 0);
    DPAD_UP2.whenPressed(new LiftSetPointsActuationDown(20800));

    POVTrigger DPAD_RIGHT2 = new POVTrigger(xbox2, 0, 90);
    DPAD_RIGHT2.whenPressed(new LiftSetPointsActuationUp(20800));

    POVTrigger DPAD_LEFT2 = new POVTrigger(xbox2, 0, 270);
    DPAD_LEFT2.whenPressed(new LiftSetPointsActuationDown(15000));

    POVTrigger DPAD_DOWN2 = new POVTrigger(xbox2, 0, 180);
    DPAD_DOWN2.whenPressed(new LiftSetPointsActuationDown(0));

  
  }

  public XboxController xbox1() {
    return xbox1;
  }

  public XboxController xbox2() {
    return xbox2;
  }

}