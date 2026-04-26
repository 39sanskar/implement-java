package com.sanskar.test;

public class BitwiseOperators {
    public static void main(String[] args) {

        System.out.println("Bitwise Operators!");

        // Bitwise Operators:
        // These operators work on binary (bit-level) representation of numbers.

        // --------------------------------------------------
        // 1. AND (&)
        // Definition: Returns 1 only if both bits are 1, otherwise 0
        int a = 5 & 4;
        System.out.println("\nAND (&):");
        System.out.println("5 in binary: " + Integer.toBinaryString(5)); // 101
        System.out.println("4 in binary: " + Integer.toBinaryString(4)); // 100
        System.out.println("5 & 4 = " + a); // 4


        // --------------------------------------------------
        // 2. OR (|)
        // Definition: Returns 1 if at least one bit is 1
        int c = 5 | 7;
        System.out.println("\nOR (|):");
        System.out.println("5 in binary: " + Integer.toBinaryString(5)); // 101
        System.out.println("7 in binary: " + Integer.toBinaryString(7)); // 111
        System.out.println("5 | 7 = " + c); // 7


        // --------------------------------------------------
        // 3. XOR (^)
        // Definition: Returns 1 if both bits are different
        int d = 5 ^ 7;
        System.out.println("\nXOR (^):");
        System.out.println("5 ^ 7 = " + d); // 2


        // --------------------------------------------------
        // 4. NOT (~)
        // Definition: Flips all bits (1 → 0, 0 → 1)
        int e = 5;
        int f = ~e;
        System.out.println("\nNOT (~):");
        System.out.println("5 in binary: " + Integer.toBinaryString(e)); // 101
        System.out.println("~5 = " + f); // -6
        System.out.println("~5 in binary: " + Integer.toBinaryString(f)); // 11111111111111111111111111111010


        // --------------------------------------------------
        // 5. Right Shift (>>)
        // Definition: Shifts bits to the right (divide by 2 for each shift)
        int g = 5;
        int h = g >> 1;
        System.out.println("\nRight Shift (>>):");
        System.out.println("5 in binary: " + Integer.toBinaryString(g)); // 101
        System.out.println("5 >> 1 = " + h); // 2
        System.out.println("Result in binary: " + Integer.toBinaryString(h)); // 10


        // --------------------------------------------------
        // 6. Left Shift (<<)
        // Definition: Shifts bits to the left (multiply by 2 for each shift)
        int i = 5;
        int j = i << 2;
        System.out.println("\nLeft Shift (<<):");
        System.out.println("5 in binary: " + Integer.toBinaryString(i)); // 101
        System.out.println("5 << 2 = " + j); // 20
        System.out.println("Result in binary: " + Integer.toBinaryString(j)); // 10100


        // --------------------------------------------------
        // 7. Unsigned Right Shift (>>>)
        // Definition: Shifts bits to the right and fills 0 from left (ignores sign)
        int x = -5;
        int y = x >>> 1;
        System.out.println("\nUnsigned Right Shift (>>>):");
        System.out.println("-5 in binary: " + Integer.toBinaryString(x)); // 11111111111111111111111111111011
        System.out.println("-5 >>> 1 = " + y); // 2147483645
        System.out.println("Result in binary: " + Integer.toBinaryString(y)); // 1111111111111111111111111111101

    }
}
