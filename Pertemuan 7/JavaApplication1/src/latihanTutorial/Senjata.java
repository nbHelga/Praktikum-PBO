/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author lenovo
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setMenusuk(){
        this.menusuk = true;
    }
    
//    private boolean isMenusuk(){
//        return menusuk;
//    }
    
    public void isiPeluru(int peluru){
        this.peluru = peluru;
        System.out.println(">> Peluru berhasil ditambah: "+ peluru);
    }
    
    public void menembak(int jumlah){
        if(peluru!=0){
            System.out.println(">> Siap menembak "+ jumlah +" kali");
            for (int i = 0; i< jumlah; i++){
                if(peluru>0){
                    System.out.print(bunyi);
                    peluru--;
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: "+peluru);
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
    
    public void pasangBayonet(){
        setMenusuk();
        System.out.print("Bayonet terpasang");
    }
    
    public void menusuk(){
        setMenusuk();
        System.out.print("Jleb!");
    }
}
