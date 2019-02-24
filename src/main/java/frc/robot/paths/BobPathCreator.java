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
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import com.team254.lib.trajectory.WaypointSequence.Waypoint;
import com.team319.trajectory.AbstractBobPathCreator;
import com.team319.trajectory.BobPath;
import com.team319.trajectory.SrxTranslatorConfig;

public class BobPathCreator extends AbstractBobPathCreator {

	private static double robotWidthInFeet = 22.3 / 12.0; //23 on real bot
	private static double robotLengthInFeet = 27.5 / 12.0; //17.5 on real bot

	// This point and points like it can be used when there are common starting locatons for the robot
	// Remember that paths should be generated from the center point of the robot
	private static Waypoint startingPoint = new Waypoint(robotLengthInFeet / 2.0, 45.5 / 12.0, 0, 0, 0);
	
	private SrxTranslatorConfig config = new SrxTranslatorConfig();
    
	public static void main(String[] args) {
		new BobPathCreator().generatePaths();
	}
	
	private BobPathCreator() {
		config.max_acc = 8.0; // Maximum acceleration in FPS
		config.max_vel = 11.5; // Maximum velocity in FPS
		config.wheel_dia_inches = 6.0;
		config.scale_factor = 1.0; // Used to adjust for a gear ratio and or distance tuning
		config.encoder_ticks_per_rev = 4096; // Count of ticks on your encoder
		config.robotLength = 27.5; // Robot length in inches, used for drawing the robot
		config.robotWidth = 22.3; // Robot width in inches, used for drawing the robot
		config.max_jerk = 30.0;
		config.dt = 0.01;
		config.highGear = true;
	}

	@Override
	protected List<BobPath> getArcs() {
		List<BobPath> paths = new ArrayList<>();
		paths.addAll(getConfigArcs());
		paths.addAll(generateTeamArcs());
		paths.addAll(getLevel1Left());
		// paths.addAll(getLevel1Right());
		//paths.addAll(getLevel1Center()); 

		return paths;
	}

	/**
	 * Use this method to generate team paths. You can create more methods like this one to organize your path, 
	 * just make sure to add the method call to the returned list in getArcs()
	 * @return the list of team paths to generate
	 */
	private List<BobPath> generateTeamArcs() {
		// Create a path with the name of "Example", this will generate a file named ExampleArc
		BobPath exampleArc = new BobPath(config, "Example");
		// Set the first point to the starating point, this be done with any of the addWaypoint methods
		// positive X is forward, positive Y is left, units are in feet and degrees
		exampleArc.addWaypoint(startingPoint);
		// Add the next point that 3 ft forward, and doesn't turn, it also has a max speed of 5 FPS, 
		// it will arrive at this location going 2 FPS
		exampleArc.addWaypointRelative(3, 0, 0, 2, 5);
		// Add the next point to be an additional 5 feet forward and 5 feet to the left with max speed of 2 FPS,
		// it  will arrive at this locaton going 0 FPS 
		exampleArc.addWaypointRelative(5, 5, 0, 0, 2);
		 
		return asList(exampleArc); // return asList(path1, path2, path3, ...);
	}
	
	
	/**
	 * Generate the configuration arcs, distance, turning, and speed
	 * DistanceScaling - This path will run 3 feet forward and stop. To tune this
	 * adjust the scaling factor until the robot stops at exactly 3 feet.
	 * TurnScaling - This path will run 3 feet forward and 3 feet to the left, this will 
	 * end at 90 degrees. This path can be used when tuning your heading loop for arc mode.
	 * SpeedTesting - This path will drive 3 feet forward and 3 feet to the left at 3 FPS,
	 * then drive another 3 feed forward and 3 feet to the left. This path will end with 
	 * the robot 6 feet to the left of it's starting position facing the oppostite direction.
	 */
	private List<BobPath> getConfigArcs() {
		BobPath distanceScaling = new BobPath(config, "DistanceScaling");
		distanceScaling.addWaypoint(new Waypoint(2, 13.5, 0, 0, 0));
		distanceScaling.addWaypointRelative(3, 0, 0, 0, 11.5);

		BobPath turnScaling = new BobPath(config, "TurnScaling");
		turnScaling.addWaypoint(new Waypoint(2, 3, 0, 0, 0));
		turnScaling.addWaypointRelative(3, -3, 89.9, 0, 3);//divide all distanc values by six to get roughly apropriate distance to set in code

		BobPath speedTesting = new BobPath(config, "SpeedTesting");
		speedTesting.addWaypoint(new Waypoint(2, 13.5, 0, 0, 0));
		speedTesting.addWaypointRelative(3, 3, 89.99, 1, 3);
		speedTesting.addWaypointRelative(3, 3, 89.99, 0, 1);

		return asList(distanceScaling, turnScaling, speedTesting);
	}
	//change the starting waypoint
	//yo all the turns are switched so get ready for that ok cool
	private List<BobPath> getLevel1Left(){
		//this is a giant mess and idk why
		//BobPath LeftSideCargo = new BobPath(config, "LeftSideCargo");
		//LeftSideCargo.addWaypoint(new Waypoint(5.3, 17.5, 0, 0, 0));

		BobPath LeftSideCloseCargo = new BobPath(config, "LeftSideCloseCargo");
		LeftSideCloseCargo.addWaypoint(new Waypoint(5.3, 17.5, 0, 0, 0));
		LeftSideCloseCargo.addWaypointRelative(9, 3, 30, 3, 5);
		LeftSideCloseCargo.addWaypointRelative(7, -4, 89.9, 0, 5);

		// BobPath LeftFrontCargo = new BobPath(config, "LeftFrontCargo");
		// LeftFrontCargo.addWaypoint(new Waypoint(5.3, 17.5, 0, 0, 0));
		// LeftFrontCargo.addWaypointRelative(6, -3, 0, 3, 6);
		// LeftFrontCargo.addWaypointRelative(6, 0, 0, 0, 5);
// 
		// BobPath LeftFrontRocket = new BobPath(config, "LeftFrontRocket");
		// LeftFrontRocket.addWaypoint(new Waypoint(5.3, 17.5, 0, 0, 0));
		// LeftFrontRocket.addWaypointRelative(8, 3, 55, 3, 6);
		// LeftFrontRocket.addWaypointRelative(4, 4.5, -30, 0, 6);
// 
		//not done
		// BobPath LeftBackRocket = new BobPath(config, "LeftBackRocket");
		// LeftBackRocket.addWaypoint(new Waypoint(5.3, 17.5, 0, 0, 0));
		// LeftBackRocket.addWaypointRelative(9, 3, 30, 3, 6);
		// LeftBackRocket.addWaypointRelative(7.5, 4.6, 45, 3, 6);

		return asList(LeftSideCloseCargo);

	}
	// private List<BobPath> getLevel1Right(){
		// BobPath RightSideCargo = new BobPath(config, "RightSideCargo");
		// RightSideCargo.addWaypoint(new Waypoint(5.3, 10, 0, 0, 0));
		// RightSideCargo.addWaypointRelative(8, 0, 30, 3, 6);
		// RightSideCargo.addWaypointRelative(4,-1, 60, 0 , 4);
// 
		// BobPath RightFrontCargo = new BobPath(config, "RightFrontCargo");
		// RightFrontCargo.addWaypoint(new Waypoint(5.3, 10, 0, 0, 0));
		// RightFrontCargo.addWaypointRelative(6, 3, 0, 3, 6);
		// RightFrontCargo.addWaypointRelative(6, 0, 0, 0, 5);
// 
		// BobPath RightFrontRocket = new BobPath(config, "RightfrontRocket");
		// RightFrontRocket.addWaypoint(new Waypoint(5.3, 10, 0, 0, 0));
		// RightFrontRocket.addWaypointRelative(8, -3, -45, 3, 6);
		// RightFrontRocket.addWaypointRelative(4, -4.5, 30, 0, 6);
// 
// 
		// not done
		// BobPath RightBackRocket = new BobPath(config, "RightBackRocket");
		// RightBackRocket.addWaypoint(new Waypoint(5.3, 10, 0, 0, 0));
		// RightBackRocket.addWaypointRelative(9, -3, 30, 3, 6);
		// RightBackRocket.addWaypointRelative(7.5, -4.6, 45, 3, 6);
// 
// 
		// BobPath CenterSideCargo = new BobPath(config, "CenterSideCargo");
		// CenterSideCargo.addWaypoint(new Waypoint(5.3, 13.5, 0, 0, 0));
		// CenterSideCargo.addWaypointRelative(6, -.5, 0, 3, 3);
		// CenterSideCargo.addWaypointRelative(4, -.5, 0, 0, 5);
// 
		// return asList(CenterSideCargo, RightSideCargo, RightFrontCargo, RightFrontRocket, RightBackRocket);
// 
	// }
	/*
	private List<BobPath> getLevel1Center(){
		BobPath CenterFrontCargo = new BobPath(config, "CenterFrontCargo");
		CenterFrontCargo.addWaypoint(new Waypoint(5.3, 13.5, 0, 0, 0));
		CenterFrontCargo.addWaypointRelative(8, 0, 30, 3, 6);
		CenterFrontCargo.addWaypointRelative(4,-1, 60, 0 , 4);

		BobPath CenterSideCargo = new BobPath(config, "CenterSideCargo");
		CenterSideCargo.addWaypoint(new Waypoint(5.3, 13.5, 0, 0, 0));
		CenterSideCargo.addWaypointRelative(6, -.5, 0, 3, 3);
		CenterSideCargo.addWaypointRelative(4, -.5, 0, 0, 5);

		BobPath CenterFrontRocket = new BobPath(config, "CenterFrontRocket");
		CenterFrontRocket.addWaypoint(new Waypoint(5.3, 13.5, 0, 0, 0));
		CenterFrontRocket.addWaypointRelative(5, -.5, 30, 3, 6);
		CenterFrontRocket.addWaypointRelative(2, -.5, 30, 0, 6);
		
		//not done
		/*BobPath CenterBackRocket = new BobPath(config, "CenterBackRocket");
		CenterFrontCargo.addWaypoint(new Waypoint(5.3, 13.5, 0, 0, 0));
		CenterBackRocket.addWaypointRelative(6, -.5, 30, 3, 6);
		CenterBackRocket.addWaypointRelative(6, -.5, 30, 3, 6);
		//CenterSideCargo.addWaypoint(new Waypoint()
		//CenterSideCargo));
		return asList(CenterFrontCargo, CenterSideCargo, CenterFrontRocket, CenterBackRocket);
		*/
}
