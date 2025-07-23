package exceptionsdemo;

public class Demo {
    public static void display() {
        System.out.println("line 3");
        int[] arr={234,76,88};

        System.out.println(arr[10]);
        // throw new ArrayIndexOutOfBoundsException(); // - type, message, project. class,methodname,line no
//            int k = 10 / 0; //line - jvm ArithmeticException
        //throw new ArithmeticException(); - type, message, project. class,methodname,line no
        System.out.println("line 4");
    }
    public static void show() {
        System.out.println("line 2");
        Demo.display();
        System.out.println("line 5");
    }
    public static void main(String[] args)  {
        System.out.println("line 1");
        Demo.show();// will get propogated caller method
        System.out.println("line 6");
    }
}
