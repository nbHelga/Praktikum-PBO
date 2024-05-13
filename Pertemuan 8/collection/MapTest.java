/*
 * File : MapTest.java
 * Deskripsi : program yang menggunakan Generic untuk pasangan Kunci-Nilai 
 */

package collection;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        // for(String s : map.values()){
        //     System.out.print(s + " ");
        // }

        for(Integer keys : key){
            System.out.print(map.get(keys) + " ");
        }

        System.err.println(map.containsValue("dua"));

        //list bisa dipakai pake idx, klo set tddk bs
        //containskey utk ngambil keynya
    }
}
