package day2;

import day1.HinhChuNhat;
import day2.Hinhchunhat;

public class Main1 {
    public static void main(String[] args) {
        Hinhchunhat hcn1 = new Hinhchunhat();
        System.out.println("Chu vi HNC1 = " + hcn1.chuVi());
        hcn1.setChieuDai(2);
        System.out.println("Chu vi HNC1: "+ hcn1.chuVi());

    }
}
