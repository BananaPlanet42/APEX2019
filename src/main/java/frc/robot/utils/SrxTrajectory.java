package frc.robot.utils;

import frc.robot.models.SrxMotionProfile;

//Combines left and right motion profiles in one object
public class SrxTrajectory {
	public boolean flipped;
	public boolean highGear;
	public SrxMotionProfile leftProfile;
	public SrxMotionProfile centerProfile;
	public SrxMotionProfile rightProfile;
	public String name = "config";
	public double wheelbase_width_feet;
	public double wheel_dia_inches;
	public int encoder_ticks_per_rev;
	public double scale_factor; // used for reductions between encoder and wheel
	public int direction = 1; // 1 = forward, -1 = backward
	public double robotLength;
	public double robotWidth;
	//public boolean highGear;
	public double max_jerk;
	public double max_acc;
	public double max_vel;

	public SrxTrajectory() {
	}

	public SrxTrajectory(SrxMotionProfile left, SrxMotionProfile center, SrxMotionProfile right) {
		this.leftProfile = left;
		this.centerProfile = center;
		this.rightProfile = right;
		this.direction = direction;
		// this.dt = dt;
		this.max_acc = max_acc;
		this.max_jerk = max_jerk;
		this.max_vel = max_vel;
		this.name = name;
		this.scale_factor = scale_factor;
		this.wheel_dia_inches = wheel_dia_inches;
		this.wheelbase_width_feet = wheelbase_width_feet;
		this.encoder_ticks_per_rev = encoder_ticks_per_rev;
		this.highGear = highGear;
		this.robotLength = robotLength;
		this.robotWidth = robotWidth;
	}
}