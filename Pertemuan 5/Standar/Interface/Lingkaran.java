/* Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskripsi : Kelas Lingkaran, berisi implementasi dari kelas Lingkaran
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jari;

    public Lingkaran(double r){
        jari = r;
    }

    public double hitungLuas(){
        return PI*jari*jari;
    }
}
