package collections;

import java.time.LocalDateTime;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("***************List implmenetation***************");
        ArrayList<Integer> list=new ArrayList();
        list.add(467);
        list.add(null);
        list.add(458);
        list.add(898);
        list.add(456);
        list.add(458);
        list.add(null);
        list.add(458);
        list.add(887);
        System.out.println(list);

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(467);
        linkedList.add(458);
        linkedList.add(898);
        linkedList.add(456);
        linkedList.add(887);
        System.out.println(linkedList);

        Vector<Integer> vector=new Vector<>();
        vector.add(467);
        vector.add(458);
        vector.add(898);
        vector.add(456);
        vector.add(887);
        System.out.println(vector);
        System.out.println("***************Set implmenetation***************");
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(467);
        hashSet.add(458);
        hashSet.add(898);
        hashSet.add(456);
        hashSet.add(887);
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet=new  LinkedHashSet<>();
        linkedHashSet.add(467);
        linkedHashSet.add(458);
        linkedHashSet.add(898);
        linkedHashSet.add(456);
        linkedHashSet.add(887);
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet=new  TreeSet<>();
        treeSet.add(467);
        treeSet.add(458);
        treeSet.add(898);
        treeSet.add(456);
        treeSet.add(887);
        System.out.println(treeSet);

//        Post p1=new Post();
//        p1.setId(3456);p1.setMsg("dfdfd");p1.setWhen(LocalDateTime.now());
//        Post p2=new Post();
//        p2.setId(3236);p2.setMsg("ghjhg");p2.setWhen(LocalDateTime.now());
//        Post p3=new Post();
//        p3.setId(3236);p3.setMsg("ghjhg");p3.setWhen(LocalDateTime.now());
//        ArrayList<Post> list1 = new ArrayList<>();
//        list1.add(p1);
//        list1.add(p2);
//        list1.add(p3);
//        System.out.println(list1.toString());

//
//        int[] list=new int[5];
//        list[0]=456;
//        list[1]=876;
//        list[2]=987;
//        list[3]=233;
//        String[] cities=new String[4];
//        cities[0]="Chennai";
//        cities[1]="madurai";
//        cities[3]="pune";
//        Post p1=new Post();
//        p1.setId(3456);p1.setMsg("dfdfd");p1.setWhen(LocalDateTime.now());
//        Post p2=new Post();
//        p2.setId(3236);p2.setMsg("ghjhg");p2.setWhen(LocalDateTime.now());
//        Post p3=new Post();
//        p3.setId(3236);p3.setMsg("ghjhg");p3.setWhen(LocalDateTime.now());
//        Post[] postlist=new Post[3];
//        postlist[0]=p1;
//        postlist[1]=p2;
//        postlist[2]=p3;
    }
}

