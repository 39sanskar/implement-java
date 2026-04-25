package com.sanskar.test;

public class CompoundAssignment {
    public static void main(String[] args) {

        int a = 10;

        // Addition
        a += 5;   // a = a + 5 → 15
        System.out.println("a += 5 → " + a);  // 15

        // Subtraction
        a -= 3;   // a = a - 3 → 12
        System.out.println("a -= 3 → " + a);  // 12

        // Multiplication
        a *= 2;   // a = a * 2 → 24
        System.out.println("a *= 2 → " + a);  // 24

        // Division
        a /= 4;   // a = a / 4 → 6
        System.out.println("a /= 4 → " + a);  // 6

        // Modulus
        a %= 5;   // a = a % 5 → 1
        System.out.println("a %= 5 → " + a);  // 1
    }
}

// Compound operators automatically handle type casting

