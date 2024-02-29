public class MGaris {
    public static void main(String[] args) {
        Garis p1;
        Garis p2;
        Garis p3;
        Garis p4;
        boolean tegaklurus;

        Titik titikAwal = new Titik(1, 0); 
        Titik titikAkhir = new Titik(4, 4); 

        /* Membuat objek Garis p1 menggunakan konstruktor */ 
        p1 = new Garis(titikAwal, titikAkhir);
        titikAwal = p1.getTitikAwal();
        titikAkhir = p1.getTitikAkhir();

        /* Mencetak titik awal dan titik akhir dari p1 */
        System.out.println("Garis p1 : (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") dan (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
        /* Mencetak Panjang Garis p1 */
        System.out.println("Panjang Garis p1 : " + p1.getPanjang());
        /* Mencetak Gradien Garis p1 */
        System.out.println("Gradien Garis p1 : " + p1.getGradien());

        /* Membuat objek Garis baru p2 sebagai refleksi terhadap sumbu y dari Garis p1 */
        p2 = new Garis(titikAwal, titikAkhir);
        p2.getRefleksi();
        titikAwal = p2.getTitikAwal();
        titikAkhir = p2.getTitikAkhir();
        System.out.println("Refleksi Garis p1 : (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") dan (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
        
        /* Membuat objek Garis p3 dan p4 untuk mencari tahu apakah tegak lurus */
        titikAwal = new Titik(4, 5); 
        titikAkhir = new Titik(6, 3); 
        p3 = new Garis(titikAwal, titikAkhir);
        titikAwal = new Titik(5, 2); 
        titikAkhir = new Titik(7, 4); 
        p4 = new Garis(titikAwal, titikAkhir);

        /* Mengecek apakah Garis p3 dan p4 tegak lurus */
        tegaklurus = p3.isTegakLurus(p4);
        if(tegaklurus){
            System.out.println("Garis Tegak Lurus");
        }
        else{
            System.out.println("Garis Tidak Tegak Lurus");
        }
    }
}
