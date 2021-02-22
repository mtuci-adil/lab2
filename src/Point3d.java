/**
 * A 3D Point that represents the x, y, and z coordinates.
 *
 * @author Adil Haidar
 */
public class Point3d extends Point2d {

    /**
     * The z coordinate.
     *
     * @defaultValue 0.0
     */
    private double z;

    /**
     * Creates a new instance of {@code Point2d} with the default values of x, y, and z.
     */
    public Point3d() {
        super();
        this.z = 0;
    }

    /**
     * Creates a new instance of {@code Point3d}.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param z the z coordinate of the point
     */
    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    /**
     * The z coordinate.
     *
     * @return the z coordinate
     */
    public final double getZ() {
        return z;
    }

    /**
     * The z coordinate's new value.
     *
     * @param z the new value of z coordinate
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Computes the distance between two points.
     *
     * @param px Coordinate x of the second point
     * @param py Coordinate y of the second point
     * @param pz Coordinate z of the second point
     * @return Distance between {@code this} and {@code (px, py, pz)}
     */
    public double distanceTo(double px, double py, double pz) {
        double a = getX() - px;
        double b = getY() - py;
        double c = getZ() - pz;
        return Double.parseDouble(String.format("%.2f", Math.sqrt(a * a + b * b + c * c)));
    }

    /**
     * Returns the distance between two points
     *
     * @param other the second {@code Point3d}.
     * @return Distance between {@code this} and {@code other}
     */
    public double distanceTo(Point3d other) {
        return distanceTo(other.getX(), other.getY(), other.getZ());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Point3d) {
            Point3d other = (Point3d) obj;
            return getX() == other.getX() && getY() == other.getY() && getZ() == other.getZ();
        } else return false;
    }
}
