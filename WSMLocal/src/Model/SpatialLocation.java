package Model;

/**
 * Created by vsuley on 11/15/2014.
 */
public class SpatialLocation {

    public double X;
    public double Y;
    public double Z;

    public SpatialLocation() {
        X = 0;
        Y = 0;
        Z = 0;
    }

    public SpatialLocation(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    public double GetDistanceTo(SpatialLocation pointB) {

        double xComp = pointB.X - this.X;
        double yComp = pointB.Y - this.Y;
        double zComp = pointB.Z - this.Z;

        double value = Math.sqrt( xComp*xComp + yComp*yComp + zComp*zComp);
        return value;
    }
}
