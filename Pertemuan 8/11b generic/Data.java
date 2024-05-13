/*
 * File : Data.java
 * Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062 / Lab C1
 * Deskripsi : kelas konstruksi generic untuk Kupu 
 */

public class Data <T extends Kupu>{
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}
