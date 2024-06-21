package org.dikshit.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {
    public static void main(String[] args) {
//        MyClass obj = new MyClass();
        Class<?> clss = null;
        try {
            clss = Class.forName("org.dikshit.reflection");
            Constructor<?> con = clss.getDeclaredConstructor();
            con.setAccessible(true);
            MyClass newInstance = (MyClass)con.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }


}
class MyClass{

   private MyClass() {
        System.out.println("MyClass object created!");
    }

}