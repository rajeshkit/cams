package generics;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Advertisement {
    public <T> void display(T i){
        System.out.println(i);
        Iterable itr;
        Collection cc;
        List l;
        Set s;
    }

    public static void main(String[] args) {
        Advertisement a=new Advertisement();
        a.display(354);
        a.display(3.6f);
        a.display("welcome");
        a.display(true);
        a.display('f');
    }
}
