import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface Customer{
    public void getCustomerDetails();
}
interface Buyer{
    public void billDetails(Integer billId,String buyerName);
}
interface ECommerce{
    public String productDetails(Integer billId,String buyerName);
}
public class Demo1  {//IS-A inheritance
    public static void main(String[] args) {
        // It is an implementation of one abstract method
        //			from functional interface
       Customer c=() -> System.out.println("customer detaile are here");
       c.getCustomerDetails();
       Buyer b=(billId, buyerName) -> System.out.println(billId+" "+buyerName);
       b.billDetails(345,"Tv");
       ECommerce ec=(e1,e2)->e1+" "+e2;
       String answer=ec.productDetails(1200,"Laptop");
        System.out.println(answer);

//        Runnable r= () -> {
//                for (int i = 0; i <10 ; i++) {
//                    System.out.println(i);
//                }
//            };
//
//        r.run();


         Comparable<Integer> ccc   =o -> 1234-o;
        System.out.println(ccc.compareTo(1234));

        Comparator<Integer> cccc = (e1,e2)-> e1-e2;
        System.out.println(cccc.compare(100,200));
        Predicate<String> pp=e->e.equals("TCS");
        System.out.println(pp.test("TCS"));
        Consumer<Float> ccccc=f-> System.out.println(f);
        ccccc.accept(7.6f);
    }





}
