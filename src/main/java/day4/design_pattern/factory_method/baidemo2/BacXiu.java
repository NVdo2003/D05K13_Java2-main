package day4.design_pattern.factory_method.baitap.baidemo2;

public class BacXiu implements Cafe{
    private String loaiCafe;
    public BacXiu(String loaiCafe) {
        this.loaiCafe = loaiCafe;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha cafe Bạc xỉu loại" + loaiCafe + "...");
    }
}
