package day4.design_pattern.factory_method.baitap.baidemo2;

public class Espresso implements Cafe{
    private String loaiCafe;
    private int apSuat;
    private int nuoc;

    public Espresso(String loaiCafe, int apSuat, int nuoc) {
        this.loaiCafe = loaiCafe;
        this.apSuat = apSuat;
        this.nuoc = nuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha cafe Espresso loại " + loaiCafe + "...");
        System.out.println("Áp suất: " + apSuat + " Pa");
        System.out.println("Lượng nước: " + nuoc + " ml");
        // Thực hiện quy trình pha Espresso
    }
}
