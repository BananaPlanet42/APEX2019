package frc.robot.utils;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import frc.robot.*;

public class LimelightNetworkTables{
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta");
        NetworkTableEntry tv = table.getEntry("tv");
        NetworkTableEntry LedMode = table.getEntry("ledMode");
        NetworkTableEntry CamMode = table.getEntry("camMode");
        NetworkTableEntry Pipeline = table.getEntry("pipeline");
        double x = tx.getDouble(0.0);
        double y = ty.getDouble(0.0);
        double area = ta.getDouble(0.0);
        double target = tv.getDouble(0.0);
        double ledMode = LedMode.getDouble(0.0);
        double camMode = CamMode.getDouble(0.0);
        double VisionPipeline = Pipeline.getDouble(0);
        boolean HasVisionTarget = Robot.booleans.HasVisionTarget;
    public void PostNetworkTables(){

      if (target == 1){
          HasVisionTarget = true;
      }
      else {
          HasVisionTarget = false;
      }
//post to smart dashboard periodically
        SmartDashboard.putBoolean("HasVisionTarget", HasVisionTarget);
        SmartDashboard.putNumber("LimelightX", x);
        SmartDashboard.putNumber("LimelightY", y);
        SmartDashboard.putNumber("LimelightArea", area);
        SmartDashboard.putNumber("LimelightLEDMode", ledMode);
        SmartDashboard.putNumber("CamMode", camMode);
        SmartDashboard.putNumber("VisionPipeline", VisionPipeline);

    }


public void ConfigLimelight(double LedModeSetting, double CamModeSetting, double PipelineSetting){

        table.getEntry("ledMode").setDouble(LedModeSetting);
        table.getEntry("camMode").setDouble(CamModeSetting);
        table.getEntry("pipeline").setDouble(PipelineSetting);




}





}