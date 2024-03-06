/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4]; //Kalau huruf di awal besar -> class
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
            System.out.println(arrayInteger[2]); //Karena diatas error ini tidak dicetak, jadi fungsi / code apapun setelah error tidak di proses
        }
        catch (ArrayIndexOutOfBoundsException exception) { //Parameter atau "exception" bebas namanya
            exception.printStackTrace();
            System.out.println("index error");
        }
        catch (Exception exception) { //Parameter atau "exception" bebas namanya
            System.out.println("Error umum");
        }
        finally{ //Optional -> hanya untuk mencetak atau memprogram sesuatu
            System.out.println("clean up code");
        }
        System.out.println("Diluar");
        /* Kalau tidak ada catch atau tidak ditangkap maka semua program dibawah error atau 
         * setelah baris ke-6 "arrayInteger[4] = 10;" akan berhenti
          */
    }
}
