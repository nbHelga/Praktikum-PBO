/*
 * File : Segitiga.java 
 * Penulis :  Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskrispsi : representasi dasar dari objek segitiga, turunan kelas poligon 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga (double alas, double tinggi, int jumlahSisi) {
        super(jumlahSisi); // super memanggil konstruktor dari parent
        this.alas = alas;
        this.tinggi = tinggi;
        // this.jumlahSisi = jumlahSisi;
    }
    
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public void printInfo(){
        super.printInfo(); // manggil printfinfo dari parent lalu menjalankan bawahnya
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
