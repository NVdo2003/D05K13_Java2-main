package day4.design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        TongThong t = TongThong.getInstance();
        t.duaRaQuyetDinh();
        t.ThamGiaHoiNghi();
        System.out.println(t.hashCode());

        TongThong t2 = TongThong.getInstance();
        t2.duaRaQuyetDinh();
        t2.ThamGiaHoiNghi();
        System.out.println(t2.hashCode());

    }
}
