import java.sql.SQLOutput;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//@FunctionalInterface
//public interface Function<Character, Integer> {
//    Integer apply(Character t);
//}
public class Demo {
    public static void main(String[] args) {
        Function<Character,Integer> function=character ->character.hashCode();
       int result3= function.apply('r');
        System.out.println(result3);


        Supplier<String> supplier=()->"Welcome";
        String result2 = supplier.get();
        System.out.println(result2);



        Predicate<String> predicate=s->"Chennai".equals(s);
        boolean result1=predicate.test("Chennai");
        System.out.println(result1);


        Comparable<Integer> com=o-> {
                Integer i=1000;
                return i.intValue()-o.intValue();
            };
        int result=com.compareTo(1000);
        System.out.println(result);

        Runnable r=()->System.out.println("task: "+Thread.currentThread().getName());
        Thread t1=new Thread(r);
        t1.start();
        Thread t2=new Thread(r);
        t2.start();


    }
}
