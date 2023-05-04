package day2;

public class Hinhchunhat {
    // Thuộc tính
    private double chieuDai = 1.0d;
    private double chieuRong = 1.0d;

    // PT khoi tao
    public Hinhchunhat(){}
    public Hinhchunhat(double chieuDai, double chieuRong){
        if(chieuDai <= 0 || chieuRong<= 0){
            throw new RuntimeException("Cạnh phải dương!");

        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){

        return (chieuDai + chieuRong)*2;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        if(chieuDai <= 0){
            throw new RuntimeException("Cạnh phải dương");
        }
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <= 0){
            throw new RuntimeException("Cạnh phải dương");
        }
        this.chieuRong = chieuRong;
    }
    public double dienTich(){

        return chieuRong * chieuDai;
    }

}
