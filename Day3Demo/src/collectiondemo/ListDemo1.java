package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<Customer> list=new ArrayList<>();
        Customer c1=new Customer(200,"abc","abc@gmail.com","45433");
        Customer c2=new Customer(201,"bcd","bcd@gmail.com","22222");
        Customer c3=new Customer(150,"def","def@gmail.com","66666");
        list.add(c2);
        list.add(c3);
        list.add(c1);
        System.out.println(list);
        Collections.sort(list,new CustomerIdComparator());
        System.out.println(list);
        Collections.sort(list,new CustomerEmailComparator());
        System.out.println(list);
        Collections.sort(list,new CustomerPhoneComparator());
        System.out.println(list);

//       for(Customer c:list){
//           System.out.println(c.toString());
//       }


    }
}
