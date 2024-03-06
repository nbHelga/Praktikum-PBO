/* 
 * Penulis : Helga Nurul Bhaiti / 24060122130062
 */
class Lingkaran {
    private double jarijari;
    public Lingkaran (double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        /* Secara konsep ada yang kurang tepat cetaknya kurang tepat 
        harusnya tidak boleh null atau kurang dari null // 
        jari-jari != 0 atau jari-jari harus positif */
        double jarijari = 0;
        assert(jarijari > 0):"Jari-jari tidak boleh null!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
    /* Menjawab pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
     * Karena kata-kata yang kita cetak adalah jari-jari tidak boleh null yang harusnya menggunakan tanda "!= 0"
     * Kalau tanda "> 0", maka yang harus dicetak kata-katanya adalah "Jari jari tidak boleh null atau tidak boleh negatif"
    */
}
