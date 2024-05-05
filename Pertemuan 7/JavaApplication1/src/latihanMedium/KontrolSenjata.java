/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author lenovo
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
       return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+ jumPeluru);
    }
    
    public void menembak(int jumlah){
        int peluru = senjata.getPeluru();
        String bunyi = senjata.getBunyi();
        System.out.println(">> Siap menembak "+ jumlah +" kali");
        if(peluru!=0){
            for (int i = 0; i< jumlah; i++){
                if(peluru>0){
                    System.out.println(bunyi);
                    peluru--;
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: "+peluru);
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk(){
        senjata.setMenusuk(true);
       return "Jleb!";
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.print("Bayonet terpasang");
    }
}
