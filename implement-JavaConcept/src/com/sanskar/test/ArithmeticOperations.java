package com.sanskar.test;

// Arithmetic Operators in Java (All Cases + Rules)
public class ArithmeticOperations {
    public static void main(String[] args) {

        System.out.println("Arithmetic Operations in Java\n");

        /*
         * Arithmetic Operators:
         * +  → Addition
         * -  → Subtraction
         * *  → Multiplication
         * /  → Division
         * %  → Modulus (remainder)
         */

        // -------------------- Addition (+) --------------------
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));  // 30

        // Mixed type addition (int + double → double)
        double c = a + 11.5;
        System.out.println("Mixed Addition: " + c);  // 21.5


        // -------------------- Subtraction (-) --------------------
        int salary = 1000;
        int deduction = 500;
        int remaining = salary - deduction;
        System.out.println("Subtraction: " + remaining); // 500


        // -------------------- Multiplication (*) --------------------
        int x = 5;
        int y = 6;
        System.out.println("Multiplication: " + (x * y)); // 30

        // ⚠️ Overflow example
        long big = 438347634;
        long resultOverflow = big * 24223;
        System.out.println("Multiplication (may overflow): " + resultOverflow); // Multiplication (may overflow): 10618094738382


        // -------------------- Division (/) --------------------
        int p = 10;
        int q = 3;

        // Integer division (fraction is removed)
        int intDivision = p / q;
        System.out.println("Integer Division: " + intDivision); // 3

        // Floating division
        float floatDivision = 10.0f / q;
        System.out.println("Float Division: " + floatDivision); // 3.3333333

        double doubleDivision = 10.0 / q;
        System.out.println("Double Division: " + doubleDivision); // 3.3333...


        // -------------------- Modulus (%) --------------------
        int m = 45;
        int n = 2;
        System.out.println("Modulus: " + (m % n)); // 1

        // Even/Odd check using modulus
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        // -------------------- Type Promotion Rules --------------------
        /*
         * 1. Smaller types (byte, short, char) are promoted to int
         * 2. If one operand is double → result is double
         * 3. If one operand is float → result is float
         * 4. If one operand is long → result is long
         * 5. Otherwise → result is int
         */

        float f1 = 12.2f;
        long l1 = 23723;
        float mixedResult = f1 + l1; // long → float
        System.out.println("Type Promotion: " + mixedResult);  // 23735.2


        // -------------------- Division by Zero --------------------
        /*
         * Integer division by zero → Runtime Error (ArithmeticException)
         * Floating-point division by zero → Infinity or NaN
         */

        // int z = 10 / 0; // ❌ Runtime error

        double inf = 10.0 / 0;
        System.out.println("Double / 0: " + inf); // Infinity

        double nan = 0.0 / 0;
        System.out.println("0.0 / 0: " + nan); // NaN


        // -------------------- Operator Precedence --------------------
        /*
         * Highest → Lowest:
         * 1. ()  (parentheses)
         * 2. *, /, %
         * 3. +, -
         */

        int solution1 = 5 + 3 * 2;      // 5 + 6 = 11
        int solution2 = (5 + 3) * 2;    // 8 * 2 = 16

        System.out.println("Without parentheses: " + solution1);
        System.out.println("With parentheses: " + solution2);


        // -------------------- Unary Operators --------------------
        int k = 5;

        System.out.println("Unary +: " + (+k)); // 5
        System.out.println("Unary -: " + (-k)); // -5

        // Increment / Decrement
        int i = 10;

        System.out.println("Post-increment: " + (i++)); // 10
        System.out.println("After post-increment: " + i); // 11

        System.out.println("Pre-increment: " + (++i)); // 12

        System.out.println("Post-decrement: " + (i--)); // 12
        System.out.println("Pre-decrement: " + (--i)); // 10


        // -------------------- Real-world Example --------------------
        int monthlySalary = 20000;
        int expenses = 8000;
        int savingsPerMonth = monthlySalary - expenses;
        int yearlySavings = savingsPerMonth * 12;

        System.out.println("Yearly Savings: " + yearlySavings);
    }
}


