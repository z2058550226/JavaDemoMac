package com.suikajy.toolpro;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static byte[] dcc = {104, 55, 88, 109, 78, 111, 99, 79, 50, 102, 55, 107, 76,
            107, 79, 52, 57, 50, 99, 105, 113, 53, 52, 67, 79, 100, 82, 90, 112, 103, 113, 118};

    private static final String key = "h7XmNocO2f7kLkO492ciq54COdRZpgqv";
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(Main.class.getName());
        Method test = Main.class.getMethod("test");
        test.invoke(null);
        System.out.println(new String(dcc).equals(key));

    }

    public static void test(){
        System.out.println("test reflection");
    }
}
