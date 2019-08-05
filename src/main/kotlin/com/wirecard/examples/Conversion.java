package com.wirecard.examples;

import java.time.LocalTime;

//add code from example 6
class Conversion {
    private static final LocalTime validDayMin = LocalTime.of(11, 30);
    private static final LocalTime validDayMax = LocalTime.of(13, 30);

    public static boolean isLunchTime(LocalTime time) {
      return (time.compareTo(validDayMin) >= 0 && time.compareTo(validDayMax) <=0);
    }

    public static String numberType(Object number) {
       if (number instanceof Integer
            || number instanceof Long
            || number instanceof Byte) {
           return "Integer";
       }

       if (number instanceof Float
            || number instanceof Double) {
           return "Floating Point";
       }

       return "Not a number";
    }

    public static void main(String[] args) {
        System.out.println(isLunchTime(LocalTime.of(11, 29)));
        System.out.println(isLunchTime(LocalTime.of(11, 30)));
        System.out.println(isLunchTime(LocalTime.of(11, 31)));
        System.out.println(isLunchTime(LocalTime.of(13, 30)));
        System.out.println(isLunchTime(LocalTime.of(13, 31)));

        System.out.println(numberType(1.0F));
        System.out.println(numberType(1.0D));
        System.out.println(numberType(1));
        System.out.println(numberType(1L));
        System.out.println(numberType((byte)1));
        System.out.println(numberType("Hello"));
    }

}
