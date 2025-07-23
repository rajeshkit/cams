package collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(12345,"Chennai");
        hashMap.put(34474,"Mumbai");
        hashMap.put(74848,"Bangalore");
        System.out.println(hashMap.entrySet());
        for(Map.Entry<Integer,String> e:hashMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("*******************");
        for (Integer key:hashMap.keySet()){
            System.out.println(key+"   "+hashMap.get(key));
        }
        System.out.println("*******************");
        for(String s:hashMap.values()){
            System.out.println(s);
        }
    }
}
