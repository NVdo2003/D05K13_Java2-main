package day3.baitap.bai6_1;


public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}

