public class Customer {
    //variables
    String name; //instance member variable
    int phone;//instance member variable
    static String email;//static member variable
    static String bankName;// static member variable

    void doTransaction(){ //instance member variable
        int k=10; // local variable
        System.out.println(name);
        System.out.println(phone);
        System.out.println("do transaction method");
        System.out.println(Customer.bankName);
    }
    void changeProfile(){ //instance member variable
        System.out.println("change profile method");
    }
    static void displayProfile(){

    }
    public static void main(String[] args) {//member variable
        Customer customer=new Customer();//40404040
        customer.name="abc";
        customer.phone=1234;
        System.out.println(customer.name);
        System.out.println(customer.phone);
        Customer customer1=new Customer();
        customer1.name="bcd";
        customer1.phone=4567;
        System.out.println(customer1.name);
        System.out.println(customer1.phone);
        Customer.email="icici@gmail.com";
        Customer.bankName="icici";
        System.out.println(Customer.bankName);
        System.out.println(Customer.email);
        Customer customer2=new Customer();
        customer1.doTransaction();
        customer1.changeProfile();
    }

}
