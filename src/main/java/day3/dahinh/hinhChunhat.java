package day3.dahinh;

public class hinhChunhat {
    private double chieuDai;
    private double chieuRong;

    public hinhChunhat(double chieuDai, double chieuRong) {
        if(chieuDai <= 0 || chieuRong <= 0){
            throw new RuntimeException("0");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai <= 0 ){
            throw new RuntimeException("0");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <= 0){
            throw new RuntimeException("0");
        }
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return (chieuRong + chieuDai)*2;
    }
    public double dienTich(){
        return chieuRong * chieuDai;
    }
}
