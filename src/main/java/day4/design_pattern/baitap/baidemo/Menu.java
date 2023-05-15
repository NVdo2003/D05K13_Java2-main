package day4.design_pattern.baitap.baidemo;

public class Menu {

    static class Builder {
        private int TraDa;
        private int BanhMyThapCam20k;
        private int Pho;
        private int Bun;
        private int Coca;
        private int Cafe;
        private int Xoi;
        private int Kem;
        private int TraSua;
        private int Chao;

        public Builder(){

        }

        public Builder setTraDa(int traDa) {
            this.TraDa = traDa;
            return this;
        }

        public Builder setBanhMyThapCam20k(int banhMyThapCam20k) {
            this.BanhMyThapCam20k = banhMyThapCam20k;
            return this;
        }

        public Builder setPho(int pho) {
            this.Pho = pho;
            return this;
        }

        public Builder setBun(int bun) {
            this.Bun = bun;
            return this;
        }

        public Builder setCoca(int coca) {
            this.Coca = coca;
            return this;
        }

        public Builder setCafe(int cafe) {
            this.Cafe = cafe;
            return this;
        }

        public Builder setXoi(int xoi) {
            this.Xoi = xoi;
            return this;
        }

        public Builder setKem(int kem) {
            this.Kem = kem;
            return this;
        }

        public Builder setTraSua(int traSua) {
            this.TraSua = traSua;
            return this;
        }

        public Builder setChao(int chao) {
            this.Chao = chao;
            return this;
        }
        public Menu create() {
                return new Menu(TraDa, BanhMyThapCam20k, Pho, Bun, Coca, Cafe, Xoi, Kem, TraSua, Chao);
        }
    }
    private int TraDa;
    private int BanhMyThapCam20k;
    private int Pho;
    private int Bun;
    private int Coca;
    private int Cafe;
    private int Xoi;
    private int Kem;
    private int TraSua;
    private int Chao;

    private Menu(int traDa, int banhMyThapCam20k, int pho, int bun, int coca, int cafe, int xoi, int kem, int traSua, int chao) {
        TraDa = traDa;
        BanhMyThapCam20k = banhMyThapCam20k;
        Pho = pho;
        Bun = bun;
        Coca = coca;
        Cafe = cafe;
        Xoi = xoi;
        Kem = kem;
        TraSua = traSua;
        Chao = chao;
    }

    public int getTraDa() {
        return TraDa;
    }

    public void setTraDa(int traDa) {
        this.TraDa = traDa;
    }

    public int getBanhMyThapCam20k() {
        return BanhMyThapCam20k;
    }

    public void setBanhMyThapCam20k(int banhMyThapCam20k) {
        this.BanhMyThapCam20k = banhMyThapCam20k;
    }

    public int getPho() {
        return Pho;
    }

    public void setPho(int pho) {
        this.Pho = pho;
    }

    public int getBun() {
        return Bun;
    }

    public void setBun(int bun) {
        this.Bun = bun;
    }

    public int getCoca() {
        return Coca;
    }

    public void setCoca(int coca) {
        this.Coca = coca;
    }

    public int getCafe() {
        return Cafe;
    }

    public void setCafe(int cafe) {
        this.Cafe = cafe;
    }

    public int getXoi() {
        return Xoi;
    }

    public void setXoi(int xoi) {
        this.Xoi = xoi;
    }

    public int getKem() {
        return Kem;
    }

    public void setKem(int kem) {
        this.Kem = kem;
    }

    public int getTraSua() {
        return TraSua;
    }

    public void setTraSua(int traSua) {
        this.TraSua = traSua;
    }

    public int getChao() {
        return Chao;
    }

    public void setChao(int chao) {
        this.Chao = chao;
    }
    public void printMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------D05K13-------\n");
        if(TraDa > 0) {
            sb.append("Tra da: " + TraDa + "\n");
        }
        if(BanhMyThapCam20k > 0) {
            sb.append("Banh mi 20k: " + BanhMyThapCam20k + "\n");
        }
        if(Pho > 0) {
            sb.append("Pho: " + Pho + "\n");
        }
        if(Bun > 0) {
            sb.append("Bun: " + Bun + "\n");
        }
        if(Coca > 0) {
            sb.append("Co ca: " + Coca + "\n");
        }
        if(Cafe > 0) {
            sb.append("Caphe: " + Cafe + "\n");
        }
        if(Xoi > 0) {
            sb.append("Xoi: " + Xoi + "\n");
        }
        if(Kem > 0) {
            sb.append("Kem: " + Kem + "\n");
        }
        if(TraSua > 0) {
            sb.append("Tra sua: " + TraSua + "\n");
        }
        if(Chao > 0) {
            sb.append("Chao: " + Chao + "\n");
        }
        System.out.println(sb.toString());
    }
}
