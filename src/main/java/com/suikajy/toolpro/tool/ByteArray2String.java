package com.suikajy.toolpro.tool;

import com.suikajy.toolpro.tool.String2ByteArray;

public class ByteArray2String {

    public static void main(String[] args) {
        byte[] byteArr = new byte[]{99, 104, 97, 110, 110, 101, 108};
        System.out.println(new String(byteArr));
        System.out.println("asdf".substring(0,1));
        System.out.println(String2ByteArray.class.getCanonicalName());

    }
}
