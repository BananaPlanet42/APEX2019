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
import javax.swing.SwingUtilities;

import com.team254.lib.trajectory.Path;
import com.team319.trajectory.BobPath;

public class PathViewer {

	private static Viewer viewer = new Viewer();

	public static void showPath(BobPath bobPath, Path path) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				viewer.addPath(bobPath, path);
			}
		});
	}

}