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
//public class WaypointSequence {
    import com.team254.lib.util.ChezyMath;

    /**
     * A WaypointSequence is a sequence of Waypoints. #whatdidyouexpect
     *
     * @author Art Kalb
     * @author Stephen Pinkerton
     * @author Jared341
     */
    public class WaypointSequence {
    
        public static class Waypoint {
    
            public Waypoint(double x, double y, double theta, double endVelocity, double maxVelocity) {
                this.x = x;
                this.y = y;
                this.theta = theta;
                this.endVelocity = endVelocity;
                this.maxVelocity = maxVelocity;
            }
    
            public Waypoint(Waypoint tocopy) {
                this.x = tocopy.x;
                this.y = tocopy.y;
                this.theta = tocopy.theta;
                this.endVelocity = tocopy.endVelocity;
                this.maxVelocity = tocopy.maxVelocity;
            }
    
            public double x;
            public double y;
            public double theta;
            public double endVelocity;
            public double maxVelocity;
        }
    
        Waypoint[] waypoints_;
        int num_waypoints_;
    
        public WaypointSequence(int max_size) {
            waypoints_ = new Waypoint[max_size];
        }
    
        public void addWaypoint(Waypoint w) {
            if (num_waypoints_ < waypoints_.length) {
                waypoints_[num_waypoints_] = w;
                ++num_waypoints_;
            }
        }
    
        public int getNumWaypoints() {
            return num_waypoints_;
        }
    
        public Waypoint getWaypoint(int index) {
            if (index >= 0 && index < getNumWaypoints()) {
                return waypoints_[index];
            } else {
                return null;
            }
        }
    
        public WaypointSequence invertY() {
            WaypointSequence inverted = new WaypointSequence(waypoints_.length);
            inverted.num_waypoints_ = num_waypoints_;
            for (int i = 0; i < num_waypoints_; ++i) {
                inverted.waypoints_[i] = waypoints_[i];
                inverted.waypoints_[i].y *= -1;
                inverted.waypoints_[i].theta = ChezyMath
                        .boundAngle0to2PiRadians(2 * Math.PI - inverted.waypoints_[i].theta);
            }
    
            return inverted;
        }
        
        public WaypointSequence reversed() {
            WaypointSequence inverted = new WaypointSequence(waypoints_.length);
            for(int i = waypoints_.length; i > 0; i--)
            {
                if (waypoints_[i-1] != null) {
                    inverted.addWaypoint(waypoints_[i-1]);
                }
            }
            return inverted;
        }
    }
