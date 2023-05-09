package day3.dahinh;

public class hinhVuong extends hinhChunhat{
    private double canh;

    public hinhVuong(double canh) {
        super(canh, canh);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
