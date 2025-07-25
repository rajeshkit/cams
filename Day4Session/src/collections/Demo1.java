package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map map;
        Post p1=new Post(200,"Welcome",LocalDateTime.now());
        Post p2=new Post(234,"congradulations",LocalDateTime.now());
        Post p3=new Post(676,"all the best",LocalDateTime.now());
        ArrayList<Post> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
           Post post= list.get(i);
            System.out.println(post.getId());
            System.out.println(post.getMsg());
            System.out.println(post.getWhen());
        }

        for(Post post:list){
            System.out.println(post.getId());
            System.out.println(post.getMsg());
            System.out.println(post.getWhen());
        }

        list.forEach(e-> System.out.println(e));

        Iterator<Post> itr =list.iterator();
        while(itr.hasNext()){
            Post post=itr.next();
            System.out.println(post.getId());
            System.out.println(post.getMsg());
            System.out.println(post.getWhen());
        }
    }
}
