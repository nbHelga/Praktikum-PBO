/*
 * File : Poligon.java 
 * Penulis :  Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskrispsi : representasi dasar dari objek poligon (segi banyak)
 */

package org.poligon; //posisi dari poligon ada dimana, di folder org lalu subfolder poligon

public class Poligon{
    protected int jumlahSisi;  //harus protected supaya bisa dipake di PersegiPanjang.java

    public Poligon(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }
    
    public int getJumlahSisi(){ //harus public
        return jumlahSisi;
    }

    public void printInfo(){
        System.out.println("Bangun ini memiliki banyak sisi : " + this.getJumlahSisi());
    }

    /*overloading : method nama sama, namun parameter beda.
    overreading : sama namanya, namun tidak disarankan untuk mengubah parameter atau signature 
    di superclass/parent ada printinfo di childclass ada printinfo juga (overreading)*/

    /*ada import java.lang.*; untuk tipe data spt string dll atau java.lang.math, 
    namun tidak wajib karena di java sudah secara implisit sudah ada 
    atau kalau tidak pakai tetap bisa jalan
    
    import java.util.scanner package bawaan dari java*/
}