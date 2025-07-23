package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {

        HashSet<Integer> list=new HashSet<>();
        list.add(456);
        list.add(456);
        list.add(987);
        list.add(345);
        list.add(4546);
        list.add(223);
        list.add(445);
        System.out.println(list);
        //ways to iterate the collection
        //1. basic for loop 2. for each 3. Iterator 4. stream api
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.);
//        }
        for (Integer  i:list){
            System.out.println(i);
        }

//        Iterator<Integer> itr=list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        list.stream().forEach(e-> System.out.println(e));
    }
}
