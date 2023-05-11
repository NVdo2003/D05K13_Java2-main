package day4.baitap.bai6_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> g = new ArrayList<>();
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(3,2);
        g.add(c);
        g.add(r);

        for (GeometricObject h : g) {
            System.out.println(h);
        }

    }
}
