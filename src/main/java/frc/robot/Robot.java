/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.models.SRXGains;
import frc.robot.RobotMap;
import frc.robot.commands.autoCommands.DistanceTuningArc;
// import frc.robot.subsystems.Lift;
// import frc.robot.subsystems.CargoIntake;
// import frc.robot.subsystems.Crossbow;
// import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.Compressor; 
import frc.robot.Booleans;
import frc.robot.commands.autoCommands.DistanceTuningArc;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static OI oi;
  // public static CargoIntake cargoIntake;
  // public static Crossbow crossbow;
  // public static Lift lift;
  // public static Climber climber;
  public static DriveTrain driveTrain;
  public static Booleans booleans;
  
  Command m_autonomousCommand;
  //SendableChooser<Command> m_chooser = new SendableChooser<>();
  // SendableChooser<String> autoChooser;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    RobotMap.init();

    // cargoIntake = new CargoIntake();
    // crossbow = new Crossbow();
    driveTrain = new DriveTrain();
    // lift = new Lift();
    // climber = new Climber();
    // Robot.driveTrain.pigeon.setYaw(0, 0);
    // booleans.IsEndGame = false;
    oi = new OI();

    // Compressor compressor = new Compressor (0);

    // m_chooser.setDefaultOption("Default Auto", new ExampleCommand());
    // chooser.addOption("My Auto", new MyAutoCommand());
    // SmartDashboard.putData("Auto mode", m_chooser);

    // compressor.setClosedLoopControl(true);
// 
    // INITIALIZE ALL SENSORS TO START AT ZERO
    driveTrain.L1.setSelectedSensorPosition(0, 0, 0);
    driveTrain.R1.setSelectedSensorPosition(0, 0, 0);
    driveTrain.pigeon.setYaw(0,0);

    // autoChooser = SendableChooser<String>();
    // autoChooser.addDefault(name, object);


  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("RobotAngle", Robot.driveTrain.getAngle());
    SmartDashboard.putNumber("L1 encoder distance", Robot.driveTrain.getLeftDriveLeadDistance());
    SmartDashboard.putNumber("L1 encoder velocity", Robot.driveTrain.getLeftDriveLeadVelocity());

    SmartDashboard.putNumber("R1 encoder distance", Robot.driveTrain.getRightDriveLeadDistance());
    SmartDashboard.putNumber("R1 encoder velocity", Robot.driveTrain.getRightDriveLeadVelocity());


  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = new DistanceTuningArc();
    // INITIALIZE ALL SENSORS TO START AT ZERO
    // RobotMap.Lift1.setSelectedSensorPosition(0);
    RobotMap.R1.setSelectedSensorPosition(0);
    RobotMap.L1.setSelectedSensorPosition(0);
    RobotMap.R1.setNeutralMode(NeutralMode.Brake);
    RobotMap.L1.setNeutralMode(NeutralMode.Brake);

    driveTrain.pigeon.setYaw(0, 0);

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("RobotAngle", Robot.driveTrain.getAngle());
    SmartDashboard.putNumber("L1 encoder distance", Robot.driveTrain.getLeftDriveLeadDistance());
    SmartDashboard.putNumber("L1 encoder velocity", Robot.driveTrain.getLeftDriveLeadVelocity());

    SmartDashboard.putNumber("R1 encoder distance", Robot.driveTrain.getRightDriveLeadDistance());
    SmartDashboard.putNumber("R1 encoder velocity", Robot.driveTrain.getRightDriveLeadVelocity());
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    RobotMap.R1.setNeutralMode(NeutralMode.Coast);
    RobotMap.L1.setNeutralMode(NeutralMode.Coast);

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
    // RobotMap.Lift1.setSelectedSensorPosition(0);
    RobotMap.R1.setSelectedSensorPosition(0);
    RobotMap.L1.setSelectedSensorPosition(0);

    Robot.driveTrain.pigeon.setYaw(0, 0);
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("RobotAngle", Robot.driveTrain.getAngle());
    SmartDashboard.putNumber("L1 encoder distance", Robot.driveTrain.getLeftDriveLeadDistance());
    SmartDashboard.putNumber("L1 encoder velocity", Robot.driveTrain.getLeftDriveLeadVelocity());

    SmartDashboard.putNumber("R1 encoder distance", Robot.driveTrain.getRightDriveLeadDistance());
    SmartDashboard.putNumber("R1 encoder velocity", Robot.driveTrain.getRightDriveLeadVelocity());

  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    Scheduler.getInstance().run();
    SmartDashboard.putNumber("RobotAngle", Robot.driveTrain.getAngle());

    
    SmartDashboard.putNumber("L1 encoder distance", Robot.driveTrain.getLeftDriveLeadDistance());
    SmartDashboard.putNumber("L1 encoder velocity", Robot.driveTrain.getLeftDriveLeadVelocity());

    SmartDashboard.putNumber("R1 encoder distance", Robot.driveTrain.getRightDriveLeadDistance());
    SmartDashboard.putNumber("R1 encoder velocity", Robot.driveTrain.getRightDriveLeadVelocity());
  }
}
