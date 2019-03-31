/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.autoCommands.CenterForward;
import frc.robot.commands.autoCommands.DistanceTuningArc;
import frc.robot.commands.autoCommands.LeftFrontCargo;
import frc.robot.commands.autoCommands.NullCommand;
import frc.robot.commands.autoCommands.RightFrontCargo;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.CargoIntake;
import frc.robot.models.DriveSignal;
import frc.robot.subsystems.Crossbow;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Compressor;
import frc.robot.commands.Drive;
import frc.robot.commands.ReleaseLift;
import frc.robot.commands.PrintAutos.PrintAuto1;
import frc.robot.commands.PrintAutos.PrintAuto2;
import frc.robot.commands.PrintAutos.PrintAuto3;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.utils.SmartDashConfig;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import frc.robot.utils.LimelightStuff;


import edu.wpi.first.cameraserver.*;
// import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// import frc.robot.commands.ReleaseLift;
import frc.robot.utils.Booleans;
import frc.robot.utils.CanScore;
import frc.robot.utils.DriveHelper;
import frc.robot.subsystems.Tipper;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
     public static OI oi;
    public static CargoIntake cargoIntake;
    public static Crossbow crossbow;
    public static DriveTrain driveTrain;
    public static Lift lift;
    public static Tipper tipper;
    public static Climber climber;
    public static Booleans booleans;
    // Command m_autonomousCommand;
    // SendableChooser<String> m_chooser = new SendableChooser<>();
    // public DoubleSolenoid LiftSolenoid1 = RobotMap.LiftSolenoid1;
     Command m_autonomousCommand;
     SendableChooser<String> m_chooser = new SendableChooser<>();
     String SelectedCommand;
    // private boolean m_LimeLightHasValidTarget = false;
    // private double m_LimeLightDriveCommand = 0.0;
    // private double m_LimeLightSteerComand = 0.0;
    DriveHelper helper;
    public static LimelightStuff limelightStuff;
    public static CanScore canScore;

    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        booleans = new Booleans();
        cargoIntake = new CargoIntake();
        crossbow = new Crossbow();
        driveTrain = new DriveTrain();
        lift = new Lift();
        climber = new Climber();
        tipper = new Tipper();
         oi = new OI();
         helper = new DriveHelper();
        Robot.driveTrain.pigeon.setYaw(0, 0);
        limelightStuff = new LimelightStuff();
        canScore = new CanScore();
        // booleans= false;
        // CameraServer.getInstance().startAutomaticCapture();
        Compressor compressor = new Compressor(0);
        booleans.LiftIsLocked = false;
    

        m_chooser.setDefaultOption("Null Command", "Null Command");
        m_chooser.addOption("Forward 10", "Forward 10");
        m_chooser.addOption("L to LC Cargo", "L to LC Cargo");
        m_chooser.addOption("R to RC Cargo", "R to RC Cargo");
        SmartDashboard.putData("Auto mode", m_chooser);

        compressor.setClosedLoopControl(true);
        // compressor.setClosedLoopControl(true);

        driveTrain.L1.setSelectedSensorPosition(0, 0, 0);
        driveTrain.R1.setSelectedSensorPosition(0, 0, 0);
        lift.Lift1.setSelectedSensorPosition(0);
        driveTrain.pigeon.setYaw(0, 0);
        // new ReleaseLift();

        // autoChooser = SendableChooser<String>();
        // autoChooser.addDefault(name, object);

    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * <p>
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
        SmartDashConfig.Testing();
        SmartDashConfig.commands();
    }

    /**
     * This function is called once each time the robot enters Disabled mode. You
     * can use it to reset any subsystem information you want to clear when the
     * robot is disabled.
     */
    @Override
    public void disabledInit() {
        // new ReleaseLift();
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        SmartDashConfig.Comp();
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different autonomous modes using the dashboard. The sendable chooser
     * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
     * remove all of the chooser code and uncomment the getString code to get the
     * auto name from the text box below the Gyro
     *
     * <p>
     * You can add additional auto modes by adding additional commands to the
     * chooser code above (like the commented example) or additional comparisons to
     * the switch structure below with additional strings & commands.
     */
    @Override
    public void autonomousInit() {
        String SelectedCommand = (String) m_chooser.getSelected();

        switch (SelectedCommand) {
        case "Null Command":
            m_autonomousCommand = new NullCommand();
            break;
        case "L to LC Cargo":
            m_autonomousCommand = new LeftFrontCargo();
            break;
        case "R to RC Cargo":
            m_autonomousCommand = new RightFrontCargo();
            break;
        case "Forward 10":
            m_autonomousCommand = new CenterForward();
            break;

        default:
            m_autonomousCommand = new NullCommand();

        }
        // m_autonomousCommand = new DistanceTuningArc();
        // INITIALIZE ALL SENSORS TO START AT ZERO
        // RobotMap.Lift1.setSelectedSensorPosition(0);
        RobotMap.R1.setSelectedSensorPosition(0);
        driveTrain.L1.setSelectedSensorPosition(0);
        driveTrain.R1.setNeutralMode(NeutralMode.Brake);
        RobotMap.L1.setNeutralMode(NeutralMode.Brake);
        RobotMap.Lift1.setSelectedSensorPosition(0);
        driveTrain.pigeon.setYaw(0, 0);

        /*
         * String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
         * switch(autoSelected) { case "My Auto": autonomousCommand = new
         * MyAutoCommand(); break; case "Default Auto": default: autonomousCommand = new
         * ExampleCommand(); break; }
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
        // SmartDashConfig.Testing();
        SmartDashConfig.Comp();
        if (OI.xbox1.getYButton() == true){
            limelightStuff.DriveByLimelight();
        }
        canScore.Scoreable();
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
        driveTrain.R1.setSelectedSensorPosition(0);
        driveTrain.L1.setSelectedSensorPosition(0);
        new ReleaseLift();
        Robot.driveTrain.pigeon.setYaw(0, 0);
        lift.lift(ControlMode.PercentOutput, 0);
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        // SmartDashConfig.commands();
        SmartDashConfig.Comp();
        SmartDashboard.putNumber("L1 power", RobotMap.L1.getSelectedSensorVelocity());
        SmartDashboard.putNumber("R1 power", RobotMap.R1.getSelectedSensorVelocity());

        if (OI.xbox1.getYButton() == true){
            limelightStuff.DriveByLimelight();
        }
        
        Scheduler.getInstance().run();
        canScore.Scoreable();
        // SmartDashConfig.commands();
    
    }

   /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() {
        Scheduler.getInstance().run();
        SmartDashConfig.Testing();
    }
}
