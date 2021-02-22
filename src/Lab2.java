import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        var pn = new Point3d(2.5, 3.25, 1.5);
        var pm = new Point3d();

        System.out.printf("pm: %.2f %.2f %.2f\n", pm.getX(), pm.getY(), pm.getZ()); // получение координат
        pm.setX(1.5);
        pm.setY(3.0);
        pm.setZ(5.75); // изменение координат
        System.out.printf("pm: %.2f %.2f %.2f\n", pm.getX(), pm.getY(), pm.getZ()); // после изменения
        System.out.println();

        var pd = new Point3d(2.5, 3.25, 1.5); // pd равнозначна точке pn
        System.out.println(pn.equals(pd)); // равенство совпадающих точек
        System.out.println(pn.distanceTo(pm)); // расстояние между точками

        System.out.println();
        Scanner sc = new Scanner(System.in);
        var vt = new Point3d[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите координаты точки %d: ", i + 1);
            var cc = doubleArgs(sc);
            vt[i] = new Point3d(cc[0], cc[1], cc[2]);
        }
        if (!(vt[0].equals(vt[1]) || vt[1].equals(vt[2]) || vt[0].equals(vt[2])))
            System.out.printf("\nПлощадь треугольника равна %.2f\n\n", computeArea(vt[0], vt[1], vt[2]));
        else System.out.println("(!) Треугольник задан некорректно");
    }

    private static double[] doubleArgs(Scanner sc) {
        return Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
    }

    /**
     * Computes the area of a triangle defined by three 3D points,
     *
     * @param a the first {@code Point3d}
     * @param b the first {@code Point3d}
     * @param c the first {@code Point3d}
     * @return area of a triangle defined by three 3D points
     */
    private static double computeArea(Point3d a, Point3d b, Point3d c) {
        double x = a.distanceTo(b), y = a.distanceTo(c), z = b.distanceTo(c);
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}