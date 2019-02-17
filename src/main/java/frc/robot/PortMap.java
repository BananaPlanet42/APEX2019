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

//lift ids, all are talons
public static int Lift1 = 3;

public static int Lift2 = 4;


public static int Lift_Solenoid1_Forward_Channel = 9;
public static int Lift_Solenoid1_Reverse_Channel = 10;
public static int Lift_Solenoid2_Forward_Channel = 11;
public static int Lift_Solenoid2_Reverse_Channel = 12;

//eater (intake) id, TalonSRX
public static int Intake = 5;


//Crossbow PDP stuff, solenoid IDs (adjust later)
public static int Crossbow1_Forward_Channel = 1;
public static int Crossbow1_Reverse_Channel = 2;

public static int Crossbow2_Forward_Channel = 3;
public static int Crossbow2_Reverse_Channel = 4;


//Climber PDP stuff, solenoid IDs (adjust later)
public static int ClimberSolenoid1_Forward_Channel = 5;
public static int ClimberSolenoid1_Reverse_Channel = 6;

public static int ClimberSolenoid2_Forward_Channel = 7;
public static int ClimberSolenoid2_Reverse_Channel = 8;

//climber speed controller ids, both are talonsrx
public static int Climber1 = 6;
public static int Climber2 = 7;

public static int Pidgeon = 0;

}