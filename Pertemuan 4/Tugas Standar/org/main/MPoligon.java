/*
 * File : MPoligon.java 
 * Penulis :  Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskrispsi : driver class untuk poligon, persegi panjang, dan Segitiga
 */

package org.main;

import org.bangundatar.*; // * itu import semua yang ada di folder bangundatar
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 15, 4);  

        persegiPanjang.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());

        // run : java org.main.MPoligon     java org/main/MPoligon      
        // compile javac org\main\MPoligon.java

        Segitiga segitiga = new Segitiga(2, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
  }
}
