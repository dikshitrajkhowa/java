package org.dikshit.reflection;

/**
 * Loading class objects
 */
class MyClass1{

     MyClass1() {
        System.out.println("MyClass1 object created!");
    }

}
public class GetClassObject {

    public static void main(String[] args) throws ClassNotFoundException {

        //forName()
        Class<?> clss1 = Class.forName("java.lang.String");
        Class<?> clss2 = Class.forName("java.lang.String");
        System.out.println(clss1==clss2);

        //ClassName.class
        Class<?> clss3 = int.class;
        Class<?> clss4 = String.class;

        //obj.getClass()
        MyClass1 m = new MyClass1();
        Class<? extends MyClass1> class1 = m.getClass();

        //super class
        Class<?> superclass = class1.getSuperclass();
        //interfaces

        Class<?>[] interfaces = class1.getInterfaces();

        //getName()
        System.out.println(class1.getName());
    }
}
