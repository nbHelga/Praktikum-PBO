/* Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062
 * Deskripsi : Kelas BujurSangkar, berisi implementasi dari kelas BujurSangkar
 */

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    /*Jawaban Pertanyaan : apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar
     * Dah bikin method abstrak hitung luas di class BangunDatar tidak ada body implementasi, jadi harus ada implementasi di kelas BujurSangkar supaya tidak eror
     */
}
