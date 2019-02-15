/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.paths;

/**
 * Add your docs here.
 */
import com.team254.lib.trajectory.WaypointSequence;
import com.team254.lib.trajectory.WaypointSequence.Waypoint;
import frc.robot.utils.SrxTrajectory;

public class BobPath {
	private SrxTrajectory config;
	private WaypointSequence waypointSequence;

	public BobPath(SrxTrajectory config) {
		this(config, config.name);
	}

	public BobPath(SrxTrajectory config, String name) {
		this(config, name, false);
	}

	public BobPath(SrxTrajectory config, String name, boolean driveBackwards) {
		this.config = new SrxTrajectory(config);
		this.config.name = name;
		this.waypointSequence = new WaypointSequence(10);
		this.config.direction = driveBackwards ? -1 : 1;
	}

	public BobPath(BobPath toCopy) {
		config = toCopy.config;
		waypointSequence = toCopy.waypointSequence;
	}

	public boolean isExportEnabled() {
		return this.isExportEnabled();
	}

	public void setWaypointSequence(WaypointSequence wps) {
		waypointSequence = wps;
	}

	public WaypointSequence getWaypointSequence() {
		return waypointSequence;
	}

	public void addWaypoint(Waypoint wp) {
		this.waypointSequence.addWaypoint(wp);
	}

	public void addWaypointRadians(double x, double y, double theta_rad, double endVelocity, double maxVelocity) {
		this.waypointSequence.addWaypoint(new Waypoint(x, y, theta_rad, endVelocity, maxVelocity));
	}

	public void addWaypoint(double x, double y, double theta_deg, double endVelocity, double maxVelocity) {
		this.waypointSequence.addWaypoint(new Waypoint(x, y, Math.toRadians(theta_deg), endVelocity, maxVelocity));
	}
	
	public void addWaypoint(double x, double y, double theta_deg) {
		if (waypointSequence.getNumWaypoints() > 0) {
			getLastWaypoint().endVelocity = config.max_vel;
		}
		addWaypoint(new Waypoint(x, y, Math.toRadians(theta_deg), 0, config.max_vel));
	}

	public void addWaypointRelative(double x, double y, double theta_deg) {
		if (waypointSequence.getNumWaypoints() > 1) {
			getLastWaypoint().endVelocity = config.max_vel;
		}
		addWaypointRelative(x, y, theta_deg, 0, config.max_vel);
	}
	public void addWaypointRelative(double x, double y, double theta_deg, double endVelocity, double maxVelocity) {
		Waypoint lastWaypoint = getLastWaypoint();
		Waypoint newWaypoint = new Waypoint(lastWaypoint.x + x, lastWaypoint.y + y,
				lastWaypoint.theta + Math.toRadians(theta_deg), endVelocity, maxVelocity);
		this.waypointSequence.addWaypoint(newWaypoint);
	}

	public Waypoint getLastWaypoint() {
		Waypoint lastWaypoint = this.waypointSequence.getWaypoint(this.waypointSequence.getNumWaypoints() - 1);
		return lastWaypoint;
	}

	public void setConfig(SrxTrajectory c) {
		this.config = c;
	}

	public SrxTrajectory getConfig() {
		return this.config;
	}
}