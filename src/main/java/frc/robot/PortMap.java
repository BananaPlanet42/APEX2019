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

//Spark Max angle cAN
public static int LT1 = 22;
public static int RT1 = 24;
public static int LT2 = 26;
public static int RT2 = 28;

// SparkMax drive CAN
public static int LD1 = 21;
public static int RD1 = 3;
public static int LD2 = 25;
public static int RD2 = 27;

//ENCODERS/DIGITAL INPUT
public static int LFEncoder = 1;
public static int RFEncoder = 0;
public static int LBEncoder = 3;
public static int RBEncoder = 2;




}