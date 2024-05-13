/*
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayList sebagai Collection class 
 */

package collection;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        //Inisialisasi ArrayList yg hy dpt berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pd keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s + " ");
        }
    }
}
