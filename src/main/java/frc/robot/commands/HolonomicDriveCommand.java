/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.SwerveDriveTrain;
import frc.robot.common.math.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
// import org.frcteam2910.common.math.Vector2;

public class HolonomicDriveCommand extends Command {
    public HolonomicDriveCommand() {
        requires(SwerveDriveTrain.getInstance());
    }

    @Override
    protected void execute() {
        // boolean ignoreScalars = Robot.getOi().primaryController.getLeftBumperButton().get();

        double forward = Robot.oi.xbox1.getY(Hand.kLeft);
        double strafe = Robot.oi.xbox1.getX(Hand.kLeft);
        double rotation = Robot.oi.xbox1.getX(Hand.kRight);

        boolean robotOriented = Robot.oi.xbox1.getXButton();
        boolean reverseRobotOriented = Robot.oi.xbox1.getYButton();

        Vector2 translation = new Vector2(forward, strafe);

        if (reverseRobotOriented) {
            robotOriented = true;
            translation = translation.rotateBy(Rotation2.fromDegrees(180.0));
        }

        SwerveDriveTrain.getInstance().holonomicDrive(translation, rotation, !robotOriented);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
