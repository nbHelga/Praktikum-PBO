/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */
public class Asersi1{
    public static void main(String[] args){
        int x = -10;
        if (x > 0){
            System.out.println("Nilai x positif");
        }
        else{
            assert(x > 0): "Ada kesalahan kode"; //Kalau yang dalam kurung salah / error maka akan mencetak "ada kode kesalahan"
            System.out.println("Nilai x negatif");
        }
    }
}