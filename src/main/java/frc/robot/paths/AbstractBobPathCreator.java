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
public abstract class AbstractBobPathCreator {

	/**
	 * Generate the path files, to include config paths, display the paths in GUIS, and 
	 * move the files into the robot code project
	 */
	protected void generatePaths() {
		//generateArcFiles(getArcs());
		List<BobPath> frc;
		frc.robot.paths.AbstractBobPathCreator.getArcs();
	}

	/**
	 * Return the list of arcs that are to be generated
	 */
	protected abstract List<BobPath> getArcs(); 

	private void generateArcFiles(List<BobPath> paths) {
		for (BobPath path : paths) {
			BobPathGenerator.exportArcToJavaFile(path);
		}
	}
}
