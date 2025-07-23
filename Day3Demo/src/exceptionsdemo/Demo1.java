package exceptionsdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
    public static void display() throws FileNotFoundException {
        System.out.println("line 3");
        FileReader fr=new FileReader("F:/data.txt");

        System.out.println("line 4");
    }
    public static void show() throws FileNotFoundException {
        System.out.println("line 2");
        Demo1.display();
        System.out.println("line 5");
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("line 1");
        Demo1.show();
        System.out.println("line 6");
    }
}
