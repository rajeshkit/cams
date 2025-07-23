package collectiondemo;

import java.util.HashSet;
import java.util.Vector;

public class SetDemo1 {
    public static void main(String[] args) {

        HashSet<Customer> list=new HashSet<>();
        Customer c1=new Customer(200,"abc","abc@gmail.com","45433");
        Customer c2=new Customer(201,"bcd","bcd@gmail.com","22222");
        Customer c3=new Customer(150,"def","def@gmail.com","66666");
        Customer c4=new Customer(150,"def","def@gmail.com","66666");
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        list.add(c2);
        list.add(c3);
        list.add(c1);
        list.add(c4);
        for(Customer c:list){
            System.out.println(c.toString());
        }


    }
}
