package frc.robot.common.math.spline;

import frc.robot.common.math.Rotation2;
import frc.robot.common.math.Vector2;

public abstract class Spline {

    public abstract Vector2 getPoint(double t);

    public abstract Rotation2 getHeading(double t);
}
