public class Point {
    private double x;
    private double y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printPt() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    public static double dis(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}