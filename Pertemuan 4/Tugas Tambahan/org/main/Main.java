package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali = new WaliMahasiswa("Dosen A", "9876", "6218163", "Jl. Tentara Pelajar no. 51");
        Mahasiswa m = new Mahasiswa("Helga","12345", "24060122130062", "IF", wali);
        m.cetak();
    }
}
