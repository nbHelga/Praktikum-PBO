/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author lenovo
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        System.out.print("AK47 Menembak 3x: "); ak47.menembak(3);
    }
    
}
