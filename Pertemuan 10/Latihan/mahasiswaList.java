package Latihan;

import java.util.*;

public class mahasiswaList {
    public static void main(String[] args){
        Map <String, String> map = new HashMap<>();
        map.put("24060","helga");

        map.forEach((nim, nama) -> System.out.println(nim + " " + nama));
        map.keySet().forEach((nim) -> System.out.println(nim + " " +map.get(nim)));
        
    }
}
