/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.*;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.*;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import frc.robot.models.DriveSignal;
import frc.robot.utils.DriveHelper;
import frc.robot.OI;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import com.ctre.phoenix.motorcontrol.ControlMode;



/**
 * Add your docs here.
 */
public class LimelightStuff {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    boolean m_LimeLightHasValidTarget = false;
    double m_LimeLightDriveCommand = 0.0;
    double m_LimeLightSteerComand = 0.0;
    DriveHelper helper = new DriveHelper();
    


    public void Update_Limelight_Tracking() {
        // These numbers must be tuned for your Robot! Be careful!
        final double STEER_K = 0.20; // how hard to turn toward the target
        final double DRIVE_K = 0.5; // how hard to drive fwd toward the target
        final double DESIRED_TARGET_AREA = 12.43; // Area of the target when the robot reaches the wall
        final double MAX_DRIVE = 0.5; // Simple speed limit so we don't drive too fast
        double Kp = -0.1;
        double min_command = 0.5;

        double tv = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
        double tx = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
        double ty = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0);
        double ta = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ta").getDouble(0);

        if (tv == 0) {
            m_LimeLightHasValidTarget = false;
            m_LimeLightDriveCommand = 0.0;
            m_LimeLightSteerComand = 0.0;
            return;
        }
        else  {
             m_LimeLightHasValidTarget = true;
        } 
        // Start with proportional steering
        double steer_cmd = tx * STEER_K;
        m_LimeLightSteerComand = steer_cmd;

        // try to drive forward until the target area reaches our desired area
        double drive_cmd = (DESIRED_TARGET_AREA - ta) * DRIVE_K;

        // don't let the robot drive too fast into the goal
        if (drive_cmd > MAX_DRIVE) {
            drive_cmd = MAX_DRIVE;
        }
        m_LimeLightDriveCommand = drive_cmd;
    }


    public void DriveByLimelight() {
        Update_Limelight_Tracking();
        double steer = OI.xbox1.getX(Hand.kRight);
        double drive = -OI.xbox1.getY(Hand.kLeft);
        boolean auto = OI.xbox1.getYButton();
        System.out.println("targeting: " +m_LimeLightDriveCommand + "steer: " + m_LimeLightSteerComand);
        steer *= 0.7;
        drive *= 0.7;
        if (auto == true) {
            if (m_LimeLightHasValidTarget == true) {
                boolean quickTurn = Robot.driveTrain.quickTurnController();
                // DriveSignal driveSignal = helper.cheesyDrive(0.0, 0.3 * m_LimeLightSteerComand, false, false);
                DriveSignal driveSignal = helper.cheesyDrive(0.65 * m_LimeLightDriveCommand, 0.3 * m_LimeLightSteerComand, false, false); 
                   Robot.driveTrain.drive(ControlMode.PercentOutput, driveSignal);
                         } 
         else {
                Robot.driveTrain.drive(ControlMode.PercentOutput, 0, 0);
            }
        } 
        // else {
            // DriveTrain.arcadeDrive(drive,steer);
            // boolean quickTurn2 = driveTrain.quickTurnController();
            // DriveSignal driveSignal2 = helper.cheesyDrive(1.0 * -drive, 0.3 * steer, quickTurn2, false);
            // driveTrain.drive(ControlMode.PercentOutput, driveSignal2);
            // new Drive();
        // }
    }
}
