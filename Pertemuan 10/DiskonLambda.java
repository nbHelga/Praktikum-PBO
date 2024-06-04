interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        //Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //Dengan Lambda
        IDiskon diskonLebaran = (price) -> price - (price * 0.4);
        //Dengan Lambda dengan blok statement, memiliki 2 perbedaan :
        //1. ekspresi menggunakan return
        //2. dapat mengisi lebih dari 1 statement
        //cth : di atas return masih bisa ada return lagi 
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}