import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // 1. Getting a Class object
            Class<?> myClassObj = MyClass.class; // Or Class.forName("MyClass");

            System.out.println("Class Name: " + myClassObj.getName());
            System.out.println("Is Interface: " + myClassObj.isInterface());
            System.out.println("Modifiers: " + Modifier.toString(myClassObj.getModifiers()));

            // 2. Accessing Constructors
            Constructor[] constructors=  myClassObj.getConstructors();
            for (Constructor constructor:constructors){
                System.out.println(constructor.getName());
                System.out.println(constructor.getModifiers());
                System.out.println(constructor.getParameterCount());
            }
            Field[] fields=myClassObj.getFields();
            for(Field f:fields){
                System.out.println(f.getName());
                System.out.println(f.getType());
            }
            Constructor<?> constructor = myClassObj.getConstructor(String.class);
            MyClass instance = (MyClass) constructor.newInstance("Hello Reflection!");
//            System.out.println("Instance created with constructor: " + instance.publicField);
//
//            // 3. Accessing Fields
//            Field publicField = myClassObj.getField("publicField");
//            System.out.println("Public Field Value: " + publicField.get(instance));
//            publicField.set(instance, 200);
//            System.out.println("Updated Public Field Value: " + publicField.get(instance));
//
//            Field privateField = myClassObj.getDeclaredField("privateField");
//            privateField.setAccessible(true); // Allow access to private field
//            System.out.println("Private Field Value: " + privateField.get(instance));
//            privateField.set(instance, "New Private Value");
//            System.out.println("Updated Private Field Value: " + privateField.get(instance));
//
            // 4. Accessing Methods
            Method publicMethod = myClassObj.getMethod("publicMethod");
            publicMethod.invoke(instance);

            Method privateMethod = myClassObj.getDeclaredMethod("privateMethod", String.class);
            privateMethod.setAccessible(true); // Allow access to private method
            privateMethod.invoke(instance, "Invoked via Reflection");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
