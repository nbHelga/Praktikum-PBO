/*
 * File : PersegiPanjang.java 
 * Penulis :  Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskrispsi : representasi dasar dari objek persegi panjang, turunan kelas poligon 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar, int jumlahSisi) {
        super(jumlahSisi);
        this.panjang = panjang;
        this.lebar = lebar;
        // this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println(("Bangun Persegi Panjang bersisi " + getJumlahSisi()));
    }

    // cara compile : javac -cp "org\poligoon;." "org\bangundatar\PersegiPanjang.java"
    // -cp bisa dipakai kalau ada di folder lain spt di folder selain org
    // bisa pakai javac "org\bangundatar\PersegiPanjang.java" karena masi di folder yang sama yaitu org
    // Diatas kalau pakai powershell, kalau cmd tidak usah pakai petik dua

}
