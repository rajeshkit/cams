package collections;

import sortingcollection.PostDateTimeComparator;
import sortingcollection.PostIdComparator;
import sortingcollection.PostMessageComparator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
//       HashSet<Integer> list=new HashSet<>();
//        list.add(567);
//        list.add(678);
//        list.add(987);
//        list.add(342);
//        list.add(233);
//        System.out.println(list);
//        TreeSet<Integer> treeSet=new TreeSet(list);
//        System.out.println(treeSet);
        Post p1=new Post(200,"Welcome", LocalDateTime.now());
        Post p2=new Post(234,"congradulations",LocalDateTime.now());
        Post p3=new Post(676,"all the best",LocalDateTime.now());
        TreeSet<Post> list1=new TreeSet<>(new PostDateTimeComparator());
        list1.add(p3);
        list1.add(p1);
        list1.add(p2);
        for (Post p:list1){
            System.out.println(p);
        }
    }
}
