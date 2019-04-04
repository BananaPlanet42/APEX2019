/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class LiftSetPointsActuationDown extends CommandGroup {
  /**
   * Add your docs here.
   */
  public LiftSetPointsActuationDown(int position) {
    // addSequential(new TipperDown());
    // if (Robot.booleans.IsLevel2 == true){
      addSequential(new TipperDown(), 0.0);
      addSequential(new MoveLift(position));

    // }
    // else if (Robot.booleans.IsLevel2 == false){
    //   addSequential(new MoveLift(position));
    // }

    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
