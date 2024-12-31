package CodeVita;

import java.util.*;

public class Solution {

    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%.2f %.2f", x, y);
        }

        // Sorting logic for sorting by x, then by y
        public static Comparator<Point> comparator = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (Double.compare(p1.x, p2.x) == 0) {
                    return Double.compare(p1.y, p2.y);
                }
                return Double.compare(p1.x, p2.x);
            }
        };
    }

    // Reflection of point p over line formed by points a and b
    public static Point reflect(Point p, Point a, Point b) {
        double dx = b.x - a.x, dy = b.y - a.y;
        double t = ((p.x - a.x) * dx + (p.y - a.y) * dy) / (dx * dx + dy * dy);
        return new Point(2 * a.x + 2 * t * dx - p.x, 2 * a.y + 2 * t * dy - p.y);
    }

    // Returns the four corners of the square with side length s
    public static List<Point> getSquareCorners(double s) {
        List<Point> corners = new ArrayList<>();
        corners.add(new Point(0, 0));
        corners.add(new Point(0, s));
        corners.add(new Point(s, s));
        corners.add(new Point(s, 0));
        return corners;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the area and folding line
        double area = sc.nextDouble();
        double s = Math.sqrt(area); // side length of the square

        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());

        // Get the initial square corners
        List<Point> corners = getSquareCorners(s);

        // Reflection process: reflect the square corners across the folding line
        List<Point> foldedCorners = new ArrayList<>();
        for (Point corner : corners) {
            foldedCorners.add(reflect(corner, p1, p2));
        }

        // Sort the corners first by x, then by y
        Collections.sort(foldedCorners, Point.comparator);

        // Output the folded corners
        for (Point corner : foldedCorners) {
            System.out.println(corner);
        }

        sc.close();
    }
}
