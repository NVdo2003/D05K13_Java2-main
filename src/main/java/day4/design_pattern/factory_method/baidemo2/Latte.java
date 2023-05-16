package day4.design_pattern.factory_method.baitap.baidemo2;

public class Latte implements Cafe{
    private String loaiCafe;
    private int apSuat;
    private int nuoc;

    public Latte(String loaiCafe, int apSuat, int nuoc) {
        this.loaiCafe = loaiCafe;
        this.apSuat = apSuat;
        this.nuoc = nuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha cafe Latte loại " + loaiCafe + "...");
        System.out.println("Áp suất: " + apSuat + " Pa");
        System.out.println("Lượng nước: " + nuoc + " ml");
        // Thực hiện quy trình pha Latte
    }
}
