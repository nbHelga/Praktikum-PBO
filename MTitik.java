public class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
        Titik t3;

		t1 = new Titik();
		t2 = new Titik();
        t3 = new Titik(5,6);

		t1.setAbsis(1);
		t1.setOrdinat(2);
		t2.setAbsis(3);
		t2.setOrdinat(4);
        t3.setAbsis(5);
        t3.setOrdinat(6);

		float counterTitik;
		float absis;
		float ordinat;

		counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);

		absis = t1.getAbsis();
		ordinat = t1.getOrdinat();
		// System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);//1
		System.out.println("t1("+absis + ", " + ordinat + ")");
		
		absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		// System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t2("+absis + ", " + ordinat + ")"); //2

        absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		// System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t3("+absis + ", " + ordinat + ")"); //3

        // System.out.println( "t1("+t1.getJarakPusat()+")");
        System.out.println(t1.getJarakPusat()); // mencetak Jarak Pusat dari t1
        
        System.out.println("\nMencetak Refleksi");
        t3.refleksiX();
        System.out.println("t3("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        t3.refleksiY();
        System.out.println("t3("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        
        Titik t4 = t2.getRefleksiX();
        System.out.println("Refleksi x : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
        Titik t5 = t2.getRefleksiY();
        System.out.println("Refleksi y : (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");



        /*Kesimpulan yang saya dapatkan, perbedaan dalam menggunakan modifier private dan public adalah syarat pengaksesannya.
        Kalau private, tidak bisa diakses atau information hiding, jadi method tidak dapat diakses di luar. 
        Sedangkan public, dapat diakses di luar sehingga pengguna dapat menggunakan method. Hal ini disebut Enkapsulasi.

        Untuk Relasi antar objek, ada 5 jenisnya yaitu pewarisan, asosiasi, agregasi, komposisi, dan dependency.
        Perbedaannya dalam hal simbol atau pembacaannya. 
        Asosiasi, simbolnya "menggunakan"
        Agregasi, simbolnya "memakai"
        Komposisi, simbolnya "memiliki tapi bergantung"
        Dependensi, simbolnya "bergantung pada objek lain"
        */
	}
}