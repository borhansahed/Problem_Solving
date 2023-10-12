package Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//
//        map.put("A", 1);
//        map.put("B", 1);
//        map.put("C", 1);
//        map.put("D", 1);
//        map.put("E", 1);
//
//        for(var e : map.entrySet()){
//            System.out.println(e.getKey() + " " +  e.getValue() +  " " + e.hashCode());
//        }
//
//        System.out.println(map.hashCode());

        MyHashMap map = new MyHashMap();
        System.out.println((int)1e7+7);
        System.out.println(map.size());
        map.put(1, 10);
        map.put(1, 10);
        map.put(1, 20);
        map.put(2,10);
        map.display();

    }
}
