package day3.baitap.bai6_1;

public class Square extends Rectangle{

    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        this.color = color;
        this.filled =filled;
        this.side =side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                ", width=" + width +
                ", length=" + length +
                ']';
    }
}
