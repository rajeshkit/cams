import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public <T> void printArray(T[] a){
        for(T value:a){
            System.out.println(value);
        }
    }

    public <T,U> void print(T t1,U t2){
        System.out.println(t1);
        System.out.println(t2);
    }

    public static void main(String[] args) {
        Main m=new Main();

        Collection<String> d=new ArrayList();
        d=new Vector();
        d=new LinkedList();

        d=new HashSet();
        d=new LinkedHashSet();
        d=new TreeSet();


//        m.print(23);//Integer
//        m.print(45.5);//Float
//        m.print("TCS");//String
    }

}