
package frc.robot.utils;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

import frc.robot.RobotMap;
import frc.robot.models.BobTalonSRX;
import frc.robot.models.SRXGains;

public class ControllerConfig {
    // configs victor to all default settings, then prepares all proper settings for
    // driving

    // takes and sets: Slot, P, I , D, F, Izone
    public static SRXGains highGearGains = new SRXGains(0, .5, 0, 0, 1, 0); //1, 0, 10, 0.25
    public static SRXGains rotationGains = new SRXGains(1, 1, 0, 0, .15, 0); //2.8, 0, 35, .3, 0

    public static void setL1(BobTalonSRX leaderSRX, Boolean isInverted) {
        leaderSRX.configFactoryDefault();
        leaderSRX.setInverted(isInverted);
        leaderSRX.configNominalOutputForward(0.0);
        leaderSRX.configNominalOutputReverse(0.0);
        leaderSRX.configPeakOutputForward(1);
        leaderSRX.configPeakOutputReverse(-1);
        leaderSRX.configMotionProfileTrajectoryPeriod(0);
        leaderSRX.configContinuousCurrentLimit(25);
        leaderSRX.configPeakCurrentLimit(25);
        leaderSRX.configPeakCurrentDuration(0, 0);
        leaderSRX.setNeutralMode(NeutralMode.Coast);
        leaderSRX.enableCurrentLimit(true);


        leaderSRX.configPIDF(highGearGains);
        leaderSRX.configPIDF(rotationGains);

        leaderSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
        leaderSRX.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 5, 0);
        leaderSRX.setSensorPhase(true);
        // System.out.println("yo im actually working L1");

    }

    public static void setR1(BobTalonSRX leaderSRX, Boolean isInverted) {
        leaderSRX.configFactoryDefault();
        leaderSRX.setInverted(isInverted);
        leaderSRX.configNominalOutputForward(0.0);
        leaderSRX.configNominalOutputReverse(0.0);
        leaderSRX.configPeakOutputForward(1);
        leaderSRX.configPeakOutputReverse(-1);
        leaderSRX.configMotionProfileTrajectoryPeriod(0);
        leaderSRX.configContinuousCurrentLimit(25);
        leaderSRX.configPeakCurrentLimit(25);
        leaderSRX.configPeakCurrentDuration(0, 0);
        leaderSRX.setNeutralMode(NeutralMode.Coast);
        leaderSRX.enableCurrentLimit(true);

        // leaderSRX.configMotionAcceleration(500, 0);
       leaderSRX.configOpenloopRamp(.1);
        // currentSRX.configMotionCruiseVelocity(1000, 0);

        // leaderSRX.configRemoteFeedbackFilter(RobotMap.L1.getDeviceID(), RemoteSensorSource.TalonSRX_SelectedSensor, 0,
                // 0);
        leaderSRX.configRemoteFeedbackFilter(0, RemoteSensorSource.Pigeon_Yaw, 1, 0);
        leaderSRX.setSensorPhase(true);
        // System.out.println("yo im actually working R1");

        leaderSRX.configPIDF(highGearGains);
        leaderSRX.configPIDF(rotationGains);

        leaderSRX.configSensorTerm(SensorTerm.Sum0, FeedbackDevice.RemoteSensor0, 0);
        leaderSRX.configSensorTerm(SensorTerm.Sum1, FeedbackDevice.CTRE_MagEncoder_Relative, 0);
        leaderSRX.configSelectedFeedbackSensor(FeedbackDevice.SensorSum, 0, 0);
        leaderSRX.configSelectedFeedbackCoefficient(0.5, 0, 0);

        leaderSRX.configSelectedFeedbackSensor(FeedbackDevice.RemoteSensor1, 1, 0);
        leaderSRX.configSelectedFeedbackCoefficient((3600.0 / 8192.0), 1, 0);

        // Takes and sets: Slot, P, I, D, F, Izone
        // SRXGains highGearGains = new SRXGains(0, .5, 0.0, 0, .1, 0);//1.0, 0, 10, 0.25
        // SRXGains rotationGains = new SRXGains(1, 1, 0.0, 0, .15, 0);//2.8, 0, 35, .3, 0


      
        // leaderSRX.config_kP(0, 1, 0);
        // leaderSRX.config_kI(0, 0, 0);
        // leaderSRX.config_kD(0, 0, 0);
        // leaderSRX.config_kF(0, 0, 0);
    }

    public static void setDriveFollower(VictorSPX currentSPX, TalonSRX leaderSRX, Boolean isInverted) {
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(isInverted);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
    }

    public static void setLiftLead(TalonSRX currentSRX) {
        currentSRX.configFactoryDefault();
        currentSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
        currentSRX.config_kP(0, 1.0, 0);
        currentSRX.config_kI(0, 0, 0);
        currentSRX.config_kD(0, 40, 0);
        currentSRX.config_kF(0, 0, 0);
        currentSRX.config_IntegralZone(0, 0, 0);
        currentSRX.setInverted(false);
        currentSRX.setSensorPhase(false);
        currentSRX.configNominalOutputForward(0.0);
        currentSRX.configNominalOutputReverse(0.0);
        currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        currentSRX.configAllowableClosedloopError(0, 50, 0);
        currentSRX.configForwardSoftLimitEnable(false, 0);
        currentSRX.configReverseSoftLimitEnable(false, 0);
        // currentSRX.configForwardSoftLimitThreshold(30000,0);
        // currentSRX.configReverseSoftLimitThreshold(0, 0);
        currentSRX.configContinuousCurrentLimit(15);
        currentSRX.configPeakCurrentLimit(15);
        currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(true);
        currentSRX.configMotionAcceleration(14000, 0); //3500 // 7000 //10500
        currentSRX.configMotionCruiseVelocity(14000, 0); //3500 //7000 //10500
        currentSRX.setNeutralMode(NeutralMode.Coast);
    }

    public static void setLiftFollower(VictorSPX currentSPX, TalonSRX leaderSRX, Boolean isInverted) {
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(isInverted);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
        currentSPX.setNeutralMode(NeutralMode.Coast);

    }

    public static void setClimbLead(TalonSRX currentSRX) {
        // System.out.println("Configuring Climb Lead" + currentSRX.getInverted());
        currentSRX.configFactoryDefault();
        currentSRX.setInverted(false);
        currentSRX.configNominalOutputForward(0.0);
        currentSRX.configNominalOutputReverse(0.0);
        currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        currentSRX.configContinuousCurrentLimit(40);
        currentSRX.configPeakCurrentLimit(40);
        currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(true);
        // System.out.println("Done Configuring Climb Lead" + currentSRX.getInverted());

    }

    public static void setClimbFollower(VictorSPX currentSPX, TalonSRX leaderSRX) {
        // System.out.println("Configuring Climb Follower" + currentSPX.getInverted());
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(true);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
        // System.out.println("Done Configuring Climb Follower, Inversion: " +
        // currentSPX.getInverted());
    }
}
