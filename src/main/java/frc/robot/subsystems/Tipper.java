// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.subsystems;
// import frc.robot.RobotMap;
// import edu.wpi.first.wpilibj.DoubleSolenoid;
// import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// import frc.robot.Robot;
// import edu.wpi.first.wpilibj.command.Subsystem;


// public class Tipper extends Subsystem{

//     public DoubleSolenoid TipperSolenoid1 = RobotMap.TipperSolenoid1;
   
//     public void TipperUp(){
//         TipperSolenoid1.set(Value.kForward);
//         Robot.booleans.IsLevel2 = true;

//     }

//     public void TipperDown(){
//         TipperSolenoid1.set(Value.kReverse);
//         Robot.booleans.IsLevel2 = false;

//     }


//     @Override
//     public void initDefaultCommand(){

    
//     }
// }