package sortingcollection;

import collections.Post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(567);
//        list.add(678);
//        list.add(987);
//        list.add(342);
//        list.add(233);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        Post p1=new Post(200,"Welcome",LocalDateTime.now());
        Post p2=new Post(234,"congradulations",LocalDateTime.now());
        Post p3=new Post(676,"all the best",LocalDateTime.now());
        ArrayList<Post> list1=new ArrayList<>();
        list1.add(p3);
        list1.add(p1);
        list1.add(p2);
        System.out.println(list1);
        System.out.println("Sort by id");
        Collections.sort(list1,new PostIdComparator());
        System.out.println(list1);
        System.out.println("Sort by message");
        Collections.sort(list1,new PostMessageComparator());
        System.out.println(list1);
        System.out.println("Sort by post date and time");
        Collections.sort(list1,new PostDateTimeComparator());
        System.out.println(list1);
    }
}
