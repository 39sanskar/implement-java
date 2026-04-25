package com.sanskar.test;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 5;

        // -------------------- Post-Increment --------------------
        System.out.println("Post-Increment:");
        System.out.println(a++); // prints 5, then a becomes 6
        System.out.println(a);   // 6


        // -------------------- Pre-Increment --------------------
        System.out.println("\nPre-Increment:");
        System.out.println(++a); // first becomes 7, then prints 7
        System.out.println(a);   // 7


        // -------------------- Post-Decrement --------------------
        System.out.println("\nPost-Decrement:");
        System.out.println(a--); // prints 7, then a becomes 6
        System.out.println(a);   // 6


        // -------------------- Pre-Decrement --------------------
        System.out.println("\nPre-Decrement:");
        System.out.println(--a); // first becomes 5, then prints 5
        System.out.println(a);   // 5


        // -------------------- Mixed Example --------------------
        int x = 10;

        int result1 = x++;  // assign first, then increment
        System.out.println("\nresult1 (x++): " + result1); // 10
        System.out.println("x after x++: " + x);           // 11

        int result2 = ++x;  // increment first, then assign
        System.out.println("\nresult2 (++x): " + result2); // 12
        System.out.println("x after ++x: " + x);           // 12


        // -------------------- Complex Calculation ---------------

        double w = 1.5, y = 2.5, z = 3.5;
        double complexCalculation = (w + y) * (z - y) / (w + z);
        System.out.println(complexCalculation);  // 0.8

    }
}

