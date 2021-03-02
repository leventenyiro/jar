package mass;
import mass.util.Point;

public class Main {
    public static void main(String[] args) {
        //Point p1 = new Point(5, 2);
        //System.out.println(p1);

        int n = Integer.parseInt(System.console().readLine("Pontok száma: "));

        Point[] arr = new Point[n];

        for (int i = 0; i < arr.length; i++) {
            double x = Double.parseDouble(System.console().readLine("x: "));
            double y = Double.parseDouble(System.console().readLine("y: "));
            arr[i] = new Point(x, y);
        }

        System.out.println(Point.centerOfMass(arr));
    }
}
