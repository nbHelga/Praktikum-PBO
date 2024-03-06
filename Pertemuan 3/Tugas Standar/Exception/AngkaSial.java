/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */


 public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13){
            throw new AngkaSialException();
            /* Tugasnya untuk melempar ke class AngkaSialException atau membuat objek class AngkaSialException*/
        }
        System.out.println(angka + " Bukan angka sial :D");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial(); // Instansiasi awal
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage()); // Nanti mencetak dari class AngkaSialException yang ada cetakan "Jangan..."
            System.out.println("Hati-hati memasukkan angka bro!!");
        }
    }
    /* Jawaban dari pertanyaan : 
        *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
        *Apakah baris 22 pada AngkaSial.java di atas dieksekusi? 
     * Ketika eksepsi terjadi baris 12 tidak dieksekusi karena saat masuk ke if, eksepsi akan melempar ke class AngkaSialException.
     * Lalu dari class AngkaSialException akan mencetak pesan "Jangan..."

     * Pada baris 22 dieksekusi karena, pada eksepsi setelah di try dan dilempar ke class AngkaSialException,
     * Maka akan ditangkap di class AngkaSialException bernama ase.
     * Setelah itu ase akan mencetak pesan sesuai program -> "Hati-hati..."
    */
}
