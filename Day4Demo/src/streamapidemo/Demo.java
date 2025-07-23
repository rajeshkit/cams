package streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        List<Integer> list=Arrays.asList(4567,5678,8777,8764,3456,34,54,232,55);

        List<Integer> answerList=list.stream()
                .filter(e-> e>5000)
                .sorted()
                .collect(Collectors.toList());

        List<Product> productList=new ArrayList<>();
        productList.add(new Product(124,"Laptop","Electronics",4565));
        productList.add(new Product(125,"Clothes","Apprarel",3456));
        productList.add(new Product(127,"Mobile","Electronics",98765));
        productList.add(new Product(111,"Water bottle","Utility",33444));
        productList.add(new Product(113,"wallet","Appearel",45555));
        Optional<Product> optional =productList.stream()
                .filter(e->e.getProductCatagory()!="Electronics")
                .sorted((e1,e2)->e1.getProductId()-e2.getProductId())
                .min((o1, o2) -> Math.toIntExact(o1.getCost() - o2.getCost()));
        if(optional.isPresent()){
            System.out.println(optional.get());
        }else{
            System.out.println("product is not available");
        }
    }
}
