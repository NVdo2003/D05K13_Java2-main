package day3.dahinh;

public class Main1 {
    public static void main(String[] args) {
        hinhChunhat hcn = new hinhChunhat(2,3);
        System.out.println("chuVi: "+ hcn.chuVi());
        System.out.println("dienTich: "+ hcn.dienTich());

        hinhVuong hv = new hinhVuong(5);
        hv.setChieuRong(10);
        hv.setChieuDai(20);
        System.out.println("chuVi: "+ hv.chuVi());
        System.out.println("dienTich: "+ hv.dienTich());
    }
}
