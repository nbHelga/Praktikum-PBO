public class Main {
    public static void main(String[] args) {
        Mahasiswa m1;
        String nama;
        String nim;
        String jurusan;
        WaliMahasiswa wali;
        
        //Inisialisasi Pertama
        wali = new WaliMahasiswa("Dosen A","6218163", "Jl. Tentara Pelajar no. 51");
        m1 = new Mahasiswa("Helga", "64060", "IF", wali); 
        
        // Pengisian Data Mahasiswa 1
        m1.setNama("Helga Nurul Bhaiti");
        m1.setNim("24060122130062");
        m1.setJurusan("Informatika");
        nama = m1.getNama();
        nim = m1.getNim();
        jurusan = m1. getJurusan();
        m1 = new Mahasiswa(nama, nim, jurusan, wali);
        System.out.println("Mahasiswa Kelas C\n" + "Nama : " + m1.getNama() + "\nNim : " + m1.getNim() + "\nJurusan : " + m1.getJurusan() + "\n\nWali Mahasiswa : \n" + m1.getInfoWali());
    }
}
