import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoStreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(343,565,878,232,341,111,78,566);
        Predicate<Integer> p=integer->integer%2==0;
        Consumer<Integer> c= integer->System.out.println(integer);
        Comparator<Integer> com=
                (o1,o2)-> o1.intValue()-o2.intValue();


        list.stream()  //stream1 - 8 integer both even or odd
                .filter(integer->integer%2==0) //stream2 - even number
                .sorted((o1,o2)-> o1.intValue()-o2.intValue()) //stream 3 - sorted even numbers
                .forEach(e-> System.out.println(e));
    }
}
