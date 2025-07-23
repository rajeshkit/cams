package iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:/test.txt");
        int data=0;
        while((data=fis.read())!=-1){
        }

        String msg="this afternoon trainees are feeling sleepy";
        FileOutputStream fos=new FileOutputStream("E:/output.txt");
        fos.write(msg.getBytes());

    }
}
