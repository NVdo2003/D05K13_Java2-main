package day2.baitap.bai2;

public class Circle {
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;

    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "TestMain[" +
                "radius=" + radius +
                ']';
    }
}
