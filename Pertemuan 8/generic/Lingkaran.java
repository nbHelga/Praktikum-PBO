/*
 * File : Lingkaran.java
 * Deskripsi : implementasi Lingkaaran sebagai BangunDatar 
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*3.14*jejari;
    }

}
