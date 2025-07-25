package collections;

import java.time.LocalDateTime;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
//        LinkedHashMap<Integer,String> hashMap=new LinkedHashMap();
//        hashMap.put(12345,"Chennai");
//        hashMap.put(45674,"Bangalore");
//        hashMap.put(null,"jdfj");
//        hashMap.put(77664,"Mumbai");
//        hashMap.put(45674,"Bangalore1");
//        hashMap.put(76767,"Delhi");
//        hashMap.put(45674,"Bangalore2");
//        System.out.println(hashMap);
        Post p1=new Post(200,"Welcome", LocalDateTime.now());
        Post p2=new Post(234,"congradulations",LocalDateTime.now());
        Post p3=new Post(676,"all the best",LocalDateTime.now());
        HashMap<Integer,Post> hashMap1=new HashMap<>();
        hashMap1.put(34567,p1);
        hashMap1.put(56785,p2);
        hashMap1.put(67676,p3);
//        System.out.println(hashMap1.entrySet());
//        System.out.println(hashMap1.keySet());
//        System.out.println(hashMap1.values());
        for(Map.Entry<Integer,Post>  e:hashMap1.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("************************");
        for(Integer key:hashMap1.keySet()){
            System.out.println(key);
            System.out.println(hashMap1.get(key));
        }
        System.out.println("************************");
        for(Post p:hashMap1.values()){
            System.out.println(p);
        }
    }
}
