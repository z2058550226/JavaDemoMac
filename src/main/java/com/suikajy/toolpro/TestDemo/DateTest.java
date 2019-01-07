package com.suikajy.toolpro.TestDemo;

import java.util.Date;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        Type type = Type.valueOf("IMGd®");
        System.out.println(type);
    }

    public enum Type{
        img,IMG
    }
}
