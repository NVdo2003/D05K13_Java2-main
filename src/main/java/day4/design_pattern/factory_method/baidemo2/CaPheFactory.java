package day4.design_pattern.factory_method.baitap.baidemo2;

public class CaPheFactory {
    public static Cafe taoCaPhe(int loai, String loaiCafe) {
        switch (loai) {
            case 1:
                return new Espresso(loaiCafe, 50, 10);
            case 2:
                return new DenDa(loaiCafe , 20);
            case 3:
                return new NauDa(loaiCafe, 40);
            case 4:
                return new Latte(loaiCafe, 50, 40);
            case 5:
                return new BacXiu(loaiCafe);
            default:
                return null;
        }
    }
}
