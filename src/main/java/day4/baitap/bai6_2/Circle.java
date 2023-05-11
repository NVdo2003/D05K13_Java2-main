package day4.baitap.bai6_2;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",getArea=" + getArea() +
                ",getPerimeter=" + getPerimeter() +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
