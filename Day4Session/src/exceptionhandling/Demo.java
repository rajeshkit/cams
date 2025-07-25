package exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
   static void display() {
        System.out.println("line 1");
        int k=10/0; // Unchecked Exception
       // FileWriter fr=new FileWriter(""); // check ed
        System.out.println("line 4");

    }
    static void show()  {
        System.out.println("show 1");
        Demo.display();
        System.out.println("show 2");
    }
    static void print()  {
        System.out.println("Print 1");
        Demo.show();
        System.out.println("Print 2");
    }
    public static void main(String[] args)  {
        System.out.println("main 1");
        Demo.print();
        System.out.println("main 2");
    }
}
