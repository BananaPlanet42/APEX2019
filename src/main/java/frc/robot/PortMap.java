package frc.robot;


public class PortMap{


//drive base CAN ids, R1 and L1 are TalonSRX and others are VictorSPX
//talons
public static int R1 = 1;
public static int L1 = 2;

//victors
public static int R2 = 1;//PCM
public static int R3 = 2;
public static int L2 = 3;
public static int L3 = 4;

//lift ids,  1 is talon 2 is victor
public static int Lift1 = 3;
public static int Lift2 = 8;

public static int Lift_Solenoid1_Forward_Channel = 2; //2, 5 for lift solenoid
public static int Lift_Solenoid1_Reverse_Channel = 5; //PCM

//eater (intake) id, TalonSRX
public static int Intake = 5; //CAN

//Crossbow PDP stuff, solenoid IDs (adjust later)
public static int Crossbow1_Forward_Channel = 1; //1, 6 for crossbow
public static int Crossbow1_Reverse_Channel = 6; //PCM


//Climber PDP stuff, solenoid IDs (adjust later)
public static int ClimberSolenoid1_Forward_Channel = 4; //4, 3 are for climber
public static int ClimberSolenoid1_Reverse_Channel = 3; //PCM

//climber speed controller ids,1 is talon 2 is victor
public static int Climber1 = 6; //6 for climber 1, 7 for climber 2
public static int Climber2 = 7; //CAN

//climber lock solenoid ids
public static int ClimberLockSolenoid1_Forward_Channel = 0;//0, 7 for climber lock
public static int ClimberLockSolenoid1_Reverse_Channel = 7; //CAN
public static int Pidgeon = 0;

//level 2 rocket
public static int TipperSolenoid1_Forward_Channel = 0;//0, 7
public static int TipperSolenoid1_Reverse_Channel = 7; //CAN

//PCM IDS
public static int PCM_1 = 0;
public static int PCM_2 = 1;

//Swerve drive IDs

//PCMs 
public static int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 9;
public static int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 10;
public static int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 11;
public static int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 12;

// SparkMax CAN
public static int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 1;
public static int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 2;
public static int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 3;
public static int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 4;

//ENCODERS/DIGITAL INPUT
public static int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 1;
public static int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 2;
public static int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 3;
public static int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 4;




}