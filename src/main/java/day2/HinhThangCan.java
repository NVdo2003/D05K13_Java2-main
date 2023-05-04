package day2;

public class HinhThangCan {
    // Thuộc tính
    private double dayLon ;
    private double dayBe ;
    private double chieuCao ;

    // PT khoi tao
    public HinhThangCan(){}
    public HinhThangCan(double dayLon,double dayBe,double chieuCao){
        if(dayLon <= 0 || dayBe<= 0 || chieuCao<= 0){
            throw new RuntimeException("Cạnh phải dương!");

        }
        this.dayLon = dayLon;
        this.dayBe = dayBe;
        this.chieuCao = chieuCao;
    }

    public double getDayLon() {
        return dayLon;
    }

    public void setDayLon(double dayLon) {
        this.dayLon = dayLon;
    }

    public double getDayBe() {
        return dayBe;
    }

    public void setDayBe(double dayBe) {
        this.dayBe = dayBe;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double dienTich(){
        return ((dayLon + dayBe)*chieuCao/2);
    }
    public double chuVi(){
        double tmp =(dayLon-dayBe) /2;
        double canhBen = Math.sqrt(tmp*tmp + chieuCao*chieuCao);
        return (dayLon + dayBe + chieuCao *2);
    }

    @Override
    public String toString() {
        return String.format("HinhThangCan{" +
                "dayLon=" + dayLon +
                ", dayBe=" + dayBe +
                ", chieuCao=" + chieuCao +
                ", chuVi="+"%.2f"+
                ", dienTich="+"%.2f"+
                '}',chuVi(), dienTich());
    }
}
