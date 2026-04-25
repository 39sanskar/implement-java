package com.sanskar.test;

// Naming Conventions in Java
public class NamingConvention {
    public static void main(String[] args) {

        System.out.println("Java Naming Conventions\n");

        /*
         * Rules for Naming Variables in Java:
         * 1. Java is case-sensitive (name ≠ Name)
         * 2. Allowed characters: letters (a-z, A-Z), digits (0-9), '_' and '$'
         * 3. Must start with a letter, '_' or '$' (cannot start with a digit)
         * 4. Cannot use Java reserved keywords (int, class, public, etc.)
         * 5. Should follow camelCase naming convention for variables
         */

        // Valid variable names
        String myFullName = "Sanskar Mishra";
        int age = 21;
        double accountBalance = 10500.75;
        boolean isLoggedIn = true;

        System.out.println("Name: " + myFullName);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + accountBalance);
        System.out.println("Logged In: " + isLoggedIn);

        // Invalid variable names (examples)
        // int 1age = 20;        // cannot start with a digit
        // String my-name = ""; // '-' not allowed
        // int class = 10;      // keyword not allowed

        // Valid but not recommended
        int _count = 10;     // allowed but avoid starting with '_'
        int $price = 500;    // allowed but avoid using '$'

        System.out.println("\n_count: " + _count);
        System.out.println("$price: " + $price);

        /*
         * Naming Conventions (Best Practices):
         * - Variables → camelCase (myName, totalMarks)
         * - Classes → PascalCase (NamingConvention, StudentDetails)
         * - Constants → UPPER_CASE (MAX_VALUE, PI)
         */

        final double PI = 3.14159;
        System.out.println("\nConstant PI: " + PI);

        // Example using meaningful variable names
        int numberOfStudents = 50;
        double averageMarks = 82.5;

        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Average Marks: " + averageMarks);
    }
}


/*
- Camel case is a naming convention in which multi-word identifiers are written without spaces,
 with the first word in lowercase and subsequent words starting with uppercase letters.
*/
