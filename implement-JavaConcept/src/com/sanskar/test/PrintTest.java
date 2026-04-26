package com.sanskar.test;

import java.util.Locale;

public class PrintTest {
    public static void main(String[] args) {

        // ==================================================
        // print(), println(), printf() in Java
        // ==================================================

        // 1. print()
        // Definition: Displays output without moving to the next line.
        System.out.print("Using print(): ");
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println(); // manually move to next line

        // --------------------------------------------------

        // 2. println()
        // Definition: Displays output and moves cursor to the next line.
        System.out.println("\nUsing println():");
        System.out.println("Hello");
        System.out.println("World");

        // Examples with different data types
        System.out.println(1);
        System.out.println('x');
        System.out.println(); // blank line
        System.out.println("Hello");

        // --------------------------------------------------

        // 3. printf()
        // Definition: Displays formatted output using format specifiers.
        System.out.println("\nUsing printf():");

        int a = 1;
        int b = 2;
        String c = "Sum";

        // Without formatting
        System.out.println(c + a + b);           // Sum12
        System.out.println(c + ": " + (a + b));  // Sum: 3

        // With formatting
        System.out.printf("%s of %d & %d: %d%n", c, a, b, a + b);  // Sum of 1 & 2: 3

        // Format specifiers example
        char d = 'd';
        float e = 1.2f;

        System.out.printf("%c %f%n", d, e);   // d 1.200000         default float
        System.out.printf("%c %.1f%n", d, e); // d 1.2              1 decimal place

        // --------------------------------------------------

        // Locale-based formatting example
        double number = 1234567.89;

        System.out.println("\nLocale Formatting:");

        // Default locale
        System.out.printf("Default locale: %,.2f%n", number); // Default locale: 1,234,567.89

        // US locale
        System.out.printf(Locale.US, "US locale: %,.2f%n", number); // US locale: 1,234,567.89

        // German locale
        System.out.printf(Locale.GERMANY, "German locale: %,.2f%n", number); // German locale: 1.234.567,89

        // French locale
        System.out.printf(Locale.FRANCE, "French locale: %,.2f%n", number); // French locale: 1 234 567,89

    }
}


