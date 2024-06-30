package org.dikshit.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInfo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Entity e = new Entity(10, "id");
        Class<? extends Entity> clss = e.getClass();

        Method[] methods = clss.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("\n----Get only  methods defined in the class--------");

        Method[] declaredMethods = clss.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }

        Method method = clss.getDeclaredMethod("setVal", int.class);

        method.setAccessible(true);
        method.invoke(e, 15);

        Method method2 = clss.getMethod("getVal", null);
        System.out.println(method2.invoke(e, null));
    }
}
