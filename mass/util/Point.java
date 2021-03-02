package mass.util;

public class Point {
    double x, y;
    int id;

    static int currentId = 1;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        id = currentId++;
    }
    
    void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    void mirror(double cx, double cy) {
        this.x = 2 * cx - this.x;
        this.y = 2 * cy - this.y;
    }

    void mirror(Point p) {
        this.x = 2 * p.x - this.x;
        this.y = 2 * p.y - this.y;
    }

    double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Point centerOfMass(Point[] arr) {
        double centerX = 0;
        double centerY = 0;
        for (Point p : arr) {
            centerX += p.getX();
            centerY += p.getY();
        }
        centerX /= arr.length;
        centerY /= arr.length;

        return new Point(centerX, centerY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}