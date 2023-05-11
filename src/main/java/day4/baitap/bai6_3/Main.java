package day4.baitap.bai6_3;

import day4.baitap.bai6_2.GeometricObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1,2,2,4);
        System.out.println(mp);
        mp.moveUp();
        System.out.println(mp);
    }
}
