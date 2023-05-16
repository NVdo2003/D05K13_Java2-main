package day4.design_pattern.factory_method.baitap.baidemo2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaPheFactory factory = new CaPheFactory();

        int luaChon;
        String loaiCafe;

        do {
            // Hiển thị menu
            System.out.println("--- MAY PHA CA PHE ---");
            System.out.println("1. Espresso");
            System.out.println("2. Den da");
            System.out.println("3. Nau da");
            System.out.println("4. Latte");
            System.out.println("5. Bac xiu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();

            if (luaChon == 0) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            }

            scanner.nextLine(); // Đọc bỏ ký tự newline

            System.out.print("Nhap loai ca phe: ");
            loaiCafe = scanner.nextLine();

            Cafe caPhe = factory.taoCaPhe(luaChon, loaiCafe);
            if (caPhe != null) {
                caPhe.taoCaPhe();
                System.out.println("Ca phe da duoc pha xong.");
            } else {
                System.out.println("Lua chon khong hop le.");
            }

            System.out.println();
        } while (true);
    }
}
