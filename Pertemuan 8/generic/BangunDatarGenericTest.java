/*
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic BangunDatar 
 */

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>(); //new BangunDatarGeneric<Lingkaran>(); boleh ada isi/tidak
        bdg.set(l);
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());

        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<>(); //BangunDatarGeneric<Persegi>(); boleh ada isi/tidak
        bdg2.set(p);
        System.out.println("tipe generic : " + bdg2.get().getClass().getName());
        System.out.println("keliling lingkaran : " + bdg2.hitungKeliling());
    }
     
}
