public class Garis {
    private Titik TitikAwal;
    private Titik TitikAkhir;
    static double counterGaris;

    public Garis() {
        TitikAwal = new Titik();
        TitikAkhir = new Titik();
        counterGaris++;
    }

    public Garis(Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        counterGaris++;
    }

    public void setTitikAwal(Titik TitikAwal) {
        this.TitikAwal = TitikAwal;
    }

    public void setTitikAkhir(Titik TitikAkhir){
        this.TitikAkhir = TitikAkhir;
    }

    public Titik getTitikAwal(){
        return this.TitikAwal;
    }

    public Titik getTitikAkhir(){
        return this.TitikAkhir;
    }

    public double getPanjang() {
        double x1 = TitikAwal.getAbsis();
        double y1 = TitikAwal.getOrdinat();
        double x2 = TitikAkhir.getAbsis();
        double y2 = TitikAkhir.getOrdinat();
    
        double panjang = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return panjang;
    }

    public double getGradien(){
        double x1 = TitikAwal.getAbsis();
        double y1 = TitikAwal.getOrdinat();
        double x2 = TitikAkhir.getAbsis();
        double y2 = TitikAkhir.getOrdinat();

        double gradien = ((y2 - y1)/(x2-x1));
        return gradien;
    }

    public void getRefleksi(){
        // Garis g = new Garis(-(this.TitikAwal.absis));
        // return g;
        this.TitikAwal = TitikAwal.getRefleksiY();
        this.TitikAkhir = TitikAkhir.getRefleksiY();
    }
    
    public boolean isTegakLurus(Garis G){
        double xAwal = this.getTitikAwal().getAbsis();
        double yAwal = this.getTitikAwal().getOrdinat();
        double xAkhir = this.getTitikAkhir().getAbsis();
        double yAkhir = this.getTitikAkhir().getOrdinat();

        double xAwalG = G.getTitikAwal().getAbsis();
        double yAwalG = G.getTitikAwal().getOrdinat();
        double xAkhirG = G.getTitikAkhir().getAbsis();
        double yAkhirG = G.getTitikAkhir().getOrdinat();

        return ((xAwal - xAkhir) * (xAwalG - xAkhirG) + (yAwal - yAkhir) * (yAwalG - yAkhirG) == 0);
    }
}
