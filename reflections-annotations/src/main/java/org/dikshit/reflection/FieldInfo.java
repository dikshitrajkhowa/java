package org.dikshit.reflection;

import java.lang.reflect.Field;

public class FieldInfo {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Entity e = new Entity(10,"id");
        Class<? extends Entity> clss = e.getClass();

        Field[] fields = clss.getFields();

        System.out.println("Non-Declared Fields");
        for (Field field:fields){
            System.out.println(field.getName());
        }

        //non-declared : all the public elements in that class and in its super class
        //declared : all the elements present in that class only.

        Field[] declaredFields = clss.getDeclaredFields();

        System.out.println("\nDeclared Fields");

        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }

        Field field = clss.getField("type");

        Field field2 = clss.getDeclaredField("val");
        field2.setAccessible(true);
        field2.set(e, 19);

        field.set(e, "rollNo.");

        System.out.println("\n"+e.getType()+" : "+e.getVal());
    }
}
