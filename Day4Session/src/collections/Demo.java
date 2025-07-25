package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(467);
        list.add(456);
        list.add(458);
        list.add(null);
        list.add(458);
        list.add(887);
        System.out.println("**********Basic for loop***********");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("**********Advanced for loop" +
                "for each loop***********");
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("**********java 8 stream api forEach()***********");
        list.forEach(e-> System.out.println(e));
        System.out.println("**********Iterable***********");
        Iterator<Integer> itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
