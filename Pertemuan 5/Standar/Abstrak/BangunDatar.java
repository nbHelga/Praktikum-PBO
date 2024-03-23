/* Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskripsi : Krlas abstrak, berisi abstraksi bangun datar
 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l; 
    }

    public double getLuas(){
        return luas;
    }
}