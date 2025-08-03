//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Emi{
    float calculateEmi(int amount,float roi,int tenure);
}

interface NameConversion{
    String capitalLetter(String name);
}
interface Calculator{
    int add(int a,int b);
}
public class Main  {
    public static void main(String[] args) {
        Calculator c= (a,b)->a+b;
        int total=c.add(345,545);
        System.out.println(total);

        NameConversion nameConversion=(name) -> name.toUpperCase();
        String result=nameConversion.capitalLetter("chennai");
        System.out.println(result);
    }


}