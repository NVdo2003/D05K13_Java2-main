package day4.design_pattern.factory_method.baitap.baidemo2;

public class DenDa implements Cafe{
    private String loaiCafe;
    private int Dang;

    public DenDa(String loaiCafe, int Dang) {
        this.loaiCafe = loaiCafe;
        this.Dang = Dang;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha cafe đen đá loại" + loaiCafe + "...");
        System.out.println("Độ đắng: " + Dang );
        // Thực hiện quy trình pha Đen đá
    }
}
