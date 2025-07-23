package iodemo;

import collectiondemo.Customer;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fis=new FileReader("E:/test.txt");
        int data=0;
        while((data=fis.read())!=-1){
            System.out.print((char)data);
        }
        fis.close();
        String msg="this afternoon trainees are feeling sleepy";
        FileWriter fos=new FileWriter("E:/output1.txt");
        fos.write(msg);
        fos.flush();
        fos.close();


    }
}
