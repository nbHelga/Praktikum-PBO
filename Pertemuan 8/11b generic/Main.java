/*
 * File : Main.java
 * Nama : Helga Nurul Bhaiti
 * NIM : 24060122130062 / Lab C1
 * Deskripsi : main class untuk generic Kupu 
 */

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data <Ulat> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        // System.out.println(anu.getIsi().gerak());

        Kepompong K2 = new Kepompong();
        Data <Kepompong> anu2 = new Data<>();
        anu2.setIsi(K2);
        anu2.getIsi().gerak();
        // System.out.println(anu2.getIsi().gerak());

        KupuDewasa K3 = new KupuDewasa();
        Data <KupuDewasa> anu3 = new Data<>();
        anu3.setIsi(K3);
        anu3.getIsi().gerak();
        // System.out.println(anu3.getIsi().gerak());
        
        /*
         * {Terjemahkan ke bahasa Java}
class Kupu has 
  procedure gerak()
class Ulat inherits Kupu has 
  procedure gerak() 
    output "ulat merayap"
class Kepompong inherits Kupu has 
  procedure gerak() 
    output "kepompong diam"
class KupuDewasa inherits Kupu has 
  procedure gerak() 
    output "kupu terbang"
class Data<T> has 
  isi is T
  function getIsi() -> T
     -> this.isi 
  procedure setIsi( input x : T )  
     this.isi <- x
class Main 
  {kamus}
  K : Ulat 
  anu : Data<Kupu>
  {algoritma}
  K <- new Ulat
  anu <- new Data<>()
  anu.setIsi(K)
  anu.getIsi().gerak()
  anu.setIsi( new Kepompong )
  anu.getIsi().gerak()
  anu.setIsi( new KupuDewasa )
  anu.getIsi().gerak()
         */
    }
}
