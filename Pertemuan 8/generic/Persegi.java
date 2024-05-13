public class Persegi extends BangunDatar{ // kalau tidak di extends maka error, karena dalam generic T itu extend bangunDatar,
    //Sehingga yang bisa diisi T hanya bisa digunakan pd class yg jg extends persegi
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling(){
        return (double)4*sisi;
    }
    
}
