import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo<T> {
    T k;
    public Demo(){

    }
    public Demo(T k) {
        this.k = k;
    }
    public void dispay(T k){
        Function f;
        System.out.println(k);
    }

    public static void main(String[] args) {
        Demo<String> d1=new Demo<>();

    }
}
