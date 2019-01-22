package com.suikajy.toolpro.tool;

public class ByteArray2String {

    public static void main(String[] args) {
        byte[] byteArr = {109, 105, 115, 116, 102, 95, 97, 112, 107, 49, 57, 48, 49, 49, 54};
        System.out.println(new String(byteArr));
        System.out.println("asdf".substring(0,1));
        System.out.println(String2ByteArray.class.getCanonicalName());

    }
}
