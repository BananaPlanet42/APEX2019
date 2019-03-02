package frc.robot;


public class PortMap{


//drive base CAN ids, R1 and L1 are TalonSRX and others are VictorSPX
//talons
public static int R1 = 1;
public static int L1 = 2;

//victors
public static int R2 = 1;
public static int R3 = 2;
public static int L2 = 3;
public static int L3 = 4;

//lift ids,  1 is talon 2 is victor
public static int Lift1 = 3;
public static int Lift2 = 8;

public static int Lift_Solenoid1_Forward_Channel = 5; //2, 5 for lift solenoid
public static int Lift_Solenoid1_Reverse_Channel = 2;

//eater (intake) id, TalonSRX
public static int Intake = 5;

//Crossbow PDP stuff, solenoid IDs (adjust later)
public static int Crossbow1_Forward_Channel = 1; //1, 6 for crossbow
public static int Crossbow1_Reverse_Channel = 6;


//Climber PDP stuff, solenoid IDs (adjust later)
public static int ClimberSolenoid1_Forward_Channel = 3; //4, 3 are for climber
public static int ClimberSolenoid1_Reverse_Channel = 4;

//climber speed controller ids,1 is talon 2 is victor
public static int Climber1 = 7;
public static int Climber2 = 6;

//climber lock solenoid ids
public static int ClimberLockSolenoid1_Forward_Channel = 7;
public static int ClimberLockSolenoid1_Reverse_Channel = 0;
public static int Pidgeon = 0;

}