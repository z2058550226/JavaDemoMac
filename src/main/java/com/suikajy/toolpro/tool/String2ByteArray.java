package com.suikajy.toolpro.tool;

import java.util.Scanner;

public class String2ByteArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the string to convert");
        String inString = input.nextLine();
        byte[] bytes = inString.getBytes();

        if (bytes.length == 0) {
            System.out.println("no input");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(bytes[0]);
            for (int i = 1; i < bytes.length; i++) {
                sb.append(", ").append(bytes[i]);
            }
            sb.append("}");
            System.out.println(sb.toString());
        }
    }

}
