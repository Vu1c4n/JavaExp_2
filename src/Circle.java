public class Circle {
    private final double radius;
    Circle(){
        this.radius = 0;
    }
    Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    private double getArea(){
        return radius*radius*Math.PI;
    }
    public void disp(){
        System.out.print(
            "半径为：" + this.radius + '\n' +
            "周长为：" + getPerimeter() + '\n' +
            "面积为：" + getArea()
        );
    }
}
