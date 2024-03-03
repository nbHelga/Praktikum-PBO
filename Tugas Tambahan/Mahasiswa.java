public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(){
        nama = "";
        nim = "";
        jurusan = "";
        wali = new WaliMahasiswa();
    }

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public WaliMahasiswa getWali(){
        // String nama = WaliMahasiswa.getNama();
        // String nomorHp = WaliMahasiswa.getNomorHp();
        // String alamat = WaliMahasiswa.getAlamat();
        // WaliMahasiswa wali = (nama, nomorHp, alamat);
        return wali;
    }

    public String getInfoWali(){
        return wali.DataWali();
    }
}
