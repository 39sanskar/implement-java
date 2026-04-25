package com.sanskar.test;

// DataTypes
// Widening and Narrowing Conversion
public class Conversion {
    public static void main(String[] args) {
        System.out.println("Hello Humans!");

        // Widening Conversion (Implicit / Automatic)
        // Smaller data type → Larger data type (no casting required)

        int a = 10;        // 4 bytes
        long b = a;        // int → long (8 bytes)
        float c = a;       // int → float (may lose precision for large values)
        double d = a;      // int → double

        System.out.println(a);  // 10
        System.out.println(b);  // 10
        System.out.println(c);  // 10.0
        System.out.println(d);  // 10.0

        // Narrowing Conversion (Explicit Casting)
        // Larger data type → Smaller data type (data loss possible)

        float f = 1.7f;
        int g = (int) f;  // fractional part is truncated (not rounded)

        System.out.println(g);  // 1


        // Example of Widening Conversion Chain

        byte byteValue = 10;         // 1 byte
        short shortValue = byteValue; // byte → short (2 bytes)
        int intValue = shortValue;   // short → int (4 bytes)
        long longValue = intValue;   // int → long (8 bytes)
        float floatValue = longValue; // long → float (may lose precision)
        double doubleValue = floatValue; // float → double

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // Precision Loss Example

        int big = 1234567890;
        float approx = big;  // may lose precision

        System.out.println("Original int: " + big);
        System.out.println("Converted to float: " + approx);
    }
}