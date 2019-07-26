package com.suikajy.toolpro.tool;

public class ByteArray2String {

    public static void main(String[] args) {
        byte[] byteArr = {112, 108, 117, 103, 95, 103, 109, 48, 51};
        System.out.println(new String(byteArr));
        System.out.println("asdf".substring(0, 1));
        System.out.println(String2ByteArray.class.getCanonicalName());
        System.out.println((50 & 0x20) >> 5);
    }
}
