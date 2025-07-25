public class MyClass {
    private String privateField = "Private Value";
    public int publicField = 100;
    public String name="CAMS";
    public MyClass() {
    }

    public MyClass(String message) {
        this.privateField = message;
    }
   
    public void publicMethod() {
        System.out.println("Public method called.");
    }

    public void privateMethod(String param) {
        System.out.println("Private method called with: " + param);
    }
}
