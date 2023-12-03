public class Triangle {
    private Point[] points;
    public void setTri(double p1_x,double p1_y,double p2_x,double p2_y,double p3_x,double p3_y){
        Point p1 = new Point(p1_x,p1_y);
        Point p2 = new Point(p2_x,p2_y);
        Point p3 = new Point(p3_x,p3_y);
        this.points = new Point[]{p1,p2,p3};
    }
    public double getPerimeter(){
        double peri = 0;
        peri += Point.dis(this.points[0], this.points[1]);
        peri += Point.dis(this.points[0], this.points[2]);
        peri += Point.dis(this.points[1], this.points[2]);
        return peri;
    }
    public double getArea(){
        double e1 = Point.dis(this.points[0], this.points[1]);
        double e2 = Point.dis(this.points[0], this.points[2]);
        double e3 = Point.dis(this.points[1], this.points[2]);
        double p = (e1+e2+e3)/2;
        return Math.sqrt(p*(p-e1)*(p-e2)*(p-e3));
    }
}
