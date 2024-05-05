/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author lenovo
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata (String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void menembak(){
        System.out.println(bunyi);
        peluru--;
        System.out.println("Sisa Peluru: "+peluru);
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
