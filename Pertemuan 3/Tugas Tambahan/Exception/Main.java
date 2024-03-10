/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */

public class Main {
    public static void main(String[] args) {
    // Instansiasi kelas anggota dan buku
    Buku buku = new Buku("Computer Tech");
    Buku buku2 = new Buku("Main Storage Tech");
    Buku buku3 = new Buku("Logic Tech");
    Buku buku4 = new Buku("Game Tech");
    Buku buku5 = new Buku("Buku aneh");
    buku5.setTersedia(false);
    Anggota ab = new Anggota("Helga");
    Anggota aa = new Anggota("Nurul");

    /*  TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku */
    /* Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam */
    try{
        ab.pinjamBuku(buku);
        ab.pinjamBuku(buku2);
        ab.pinjamBuku(buku3);
        ab.pinjamBuku(buku4); // Pinjam lebih dari 3
        aa.pinjamBuku(buku5); // Tidak Tersedia
    }
    catch(MaksimumBukuTerpinjamException a){
        System.out.println("Jadi : " + a.getMessage());
    }
    catch(BukuTidakTersediaException a){
        System.out.println("Nah : " + a.getMessage());
    }
    }
}
