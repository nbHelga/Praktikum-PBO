package org.orang;

public class Orang{
    protected String nama, nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }

    public String getNik(){
        return nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("Nik : " + nik);
    }
}