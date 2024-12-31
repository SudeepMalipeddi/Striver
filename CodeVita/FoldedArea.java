package CodeVita;

import java.util.*;

public class FoldedArea {

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

    // Function to calculate intersection of line p1p2 and edge of square
    public static Point getIntersection(Point p1, Point p2, Point a, Point b) {
        double x1 = p1.x, y1 = p1.y, x2 = p2.x, y2 = p2.y;
        double x3 = a.x, y3 = a.y, x4 = b.x, y4 = b.y;

        // Line equation for p1p2: (x1, y1) to (x2, y2)
        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denom == 0)
            return null; // Parallel lines or no intersection

        double x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denom;
        double y = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denom;

        return new Point(x, y);
    }

    // Function to get the four corners of the square based on side length s
    public static List<Point> getSquareCorners(double s) {
        List<Point> corners = new ArrayList<>();
        corners.add(new Point(0, 0)); // (0, 0)
        corners.add(new Point(0, s)); // (0, s)
        corners.add(new Point(s, s)); // (s, s)
        corners.add(new Point(s, 0)); // (s, 0)
        return corners;
    }

    // Function to reflect a point over the line formed by points a and b
    public static Point reflect(Point p, Point a, Point b) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double t = ((p.x - a.x) * dx + (p.y - a.y) * dy) / (dx * dx + dy * dy);
        return new Point(2 * a.x + 2 * t * dx - p.x, 2 * a.y + 2 * t * dy - p.y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read area and folding line
        double area = sc.nextDouble();
        double s = Math.sqrt(area); // side length of the square

        Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
        Point p2 = new Point(sc.nextDouble(), sc.nextDouble());

        // Get the initial square corners
        List<Point> corners = getSquareCorners(s);

        // List to hold the new folded corners
        List<Point> foldedCorners = new ArrayList<>();

        // Fold the square across the folding line
        for (Point corner : corners) {
            foldedCorners.add(reflect(corner, p1, p2));
        }

        // Sort the folded corners by x, then by y
        Collections.sort(foldedCorners, Point.comparator);

        // Output the folded corners
        for (Point corner : foldedCorners) {
            System.out.println(corner);
        }

        sc.close();
    }
}
