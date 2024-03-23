/* Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskripsi : Kelas MLingkaran, berisi main dari kelas Lingkaran
 */

import java.util.Scanner;

public class MLingkaran{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas Lingkaran dengan " + "jari 10.2 satuan adalah " + l.hitungLuas());
        /* Jawaban Pertanyaan : dibuat hingga dapat menerima inputan jari dari pengguna*/
        Scanner scan1;
        double jari;
        Lingkaran luas;

        scan1 = new Scanner(System.in);
        System.out.print("Masukkan jari lingkaran 1 : ");

        jari = scan1.nextDouble();
        luas = new Lingkaran(jari);

        System.out.println("Luas Lingkaran 1 adalah " + luas.hitungLuas());

        scan1.close();
    }
}