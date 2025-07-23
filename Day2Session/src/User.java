public class User {
    int id=300; // instance varibale
    String name="CAMS";
    static String location="Chennai";
    public static void main(String[] args) {
        int k=10;
        Facebook f=new Facebook();

        //f.id=-34567;
        f.setId(-3455);
       // f.username="-dff@jdhf";
        f.setUsername("@@@##");
       // f.password= "";
        f.setPassword("%%%%%");
        System.out.println(f.getId());
        System.out.println(f.getUsername());
        System.out.println(f.getPassword());

//        f.display();

    }
}
