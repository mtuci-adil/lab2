/**
 * A 2D Point that represents the x and y coordinates.
 *
 * @author Adil Haidar
 */
public class Point2d {

    /**
     * The x coordinate.
     *
     * @defaultValue 0.0
     */
    private double x;

    /**
     * The y coordinate.
     *
     * @defaultValue 0.0
     */
    private double y;

    /**
     * Creates a new instance of {@code Point2d} with the default values of x and y.
     */
    public Point2d() {
        this(0, 0);
    }

    /**
     * Creates a new instance of {@code Point2d}.
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The x coordinate.
     * @return the x coordinate
     */
    public final double getX() {
        return x;
    }

    /**
     * The x coordinate's new value.
     * @param x the new value of x coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * The y coordinate.
     * @return the y coordinate
     */
    public final double getY() {
        return y;
    }

    /**
     * The y coordinate's new value.
     * @param y the new value of y coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Computes the distance between two points.
     *
     * @param px Coordinate x of the second point
     * @param py Coordinate y of the second point
     * @return Distance between {@code this} and {@code (px, py)}
     */
    public double distanceTo(double px, double py) {
        double a = getX() - px;
        double b = getY() - py;
        return Math.sqrt(a * a + b * b);
    }

    /**
     * Returns the distance between two points
     *
     * @param other the second {@code Point2d}.
     * @return Distance between {@code this} and {@code other}
     */
    public double distanceTo(Point2d other) {
        return distanceTo(other.x, other.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Point2d) {
            Point2d other = (Point2d) obj;
            return getX() == other.getX() && getY() == other.getY();
        } else return false;
    }
}
