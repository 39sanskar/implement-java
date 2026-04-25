package com.sanskar.test;

public class NarrowConversion {
    public static void main(String[] args) {
        System.out.println("This is NarrowConversion!. In this conversion data loss is possible");

        double doubleValue = 123.456;
        float floatValue = (float) doubleValue; // Narrowing conversion from double to float
        long longValue = (long) floatValue;  // Narrowing conversion from float to long
        int intValue = (int) longValue; // Narrowing conversion from long to int

        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);


        long a = Long.MAX_VALUE; // 01111111  11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a); // 9223372036854775807
        int b  = (int) a;  // 11111111 11111111 11111111 11111111
        System.out.println(b); // -1


        // Print the Binary of the Number
        System.out.println(Integer.toBinaryString(233233)); // 111000111100010001
        System.out.println(Integer.toBinaryString(-1));  // 11111111111111111111111111111111
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));  // 111111111111111111111111111111111111111111111111111111111111111


    }
}


