package day4.design_pattern.factory_method.baitap.baidemo2;

public class NauDa implements Cafe{
    private String loaiCafe;
    private int Sua;

    public NauDa(String loaiCafe, int Sua) {
        this.loaiCafe = loaiCafe;
        this.Sua = Sua;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha cafe Nâu Đá loại" + loaiCafe + "...");
        System.out.println("Lượng sữa: " + Sua );
        // Thực hiện quy trình pha Nâu đá
    }
}
