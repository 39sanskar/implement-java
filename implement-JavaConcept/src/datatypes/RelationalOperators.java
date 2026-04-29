package datatypes;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println("===== Relational Operators Examples =====");

        /*
         * Definition:
         * Relational operators are used to compare two values.
         * They always return a boolean result: true or false.
         */

        int age = 18;
        int votingAge = 18;

        int salary = 25000;
        int requiredSalary = 30000;

        int marks = 75;
        int passMarks = 40;

        // 1. Equal to (==)
        // Definition: Checks if two values are equal.
        // Real-world: Check if user's age is exactly equal to voting age.
        System.out.println("age == votingAge : " + (age == votingAge)); // true

        // 2. Not equal to (!=)
        // Definition: Checks if two values are NOT equal.
        // Real-world: Check if salary is different from required salary.
        System.out.println("salary != requiredSalary : " + (salary != requiredSalary)); // true

        // 3. Greater than (>)
        // Definition: Checks if left value is greater than right value.
        // Real-world: Check if salary is greater than required salary for a job.
        System.out.println("salary > requiredSalary : " + (salary > requiredSalary)); // false

        // 4. Less than (<)
        // Definition: Checks if left value is smaller than right value.
        // Real-world: Check if marks are less than passing marks.
        System.out.println("marks < passMarks : " + (marks < passMarks)); // false

        // 5. Greater than or equal to (>=)
        // Definition: Checks if left value is greater than or equal to right value.
        // Real-world: Check if age is eligible for voting (18 or above).
        System.out.println("age >= votingAge : " + (age >= votingAge)); // true

        // 6. Less than or equal to (<=)
        // Definition: Checks if left value is less than or equal to right value.
        // Real-world: Check if marks are less than or equal to maximum marks.
        int maxMarks = 100;
        System.out.println("marks <= maxMarks : " + (marks <= maxMarks)); // true


        System.out.println("===== Additional Relational Operators Example =====");

        int a = 10;
        int b = 20;

        // Equal to (==)
        System.out.println("a == b : " + (a == b)); // false

        // Not equal to (!=)
        System.out.println("a != b : " + (a != b)); // true

        // Greater than (>)
        System.out.println("a > b : " + (a > b)); // false

        // Less than (<)
        System.out.println("a < b : " + (a < b)); // true

        // Greater than or equal to (>=)
        System.out.println("a >= b : " + (a >= b)); // false

        // Less than or equal to (<=)
        System.out.println("a <= b : " + (a <= b)); // true

        // Additional Examples
        int x = 15;
        int y = 15;

        System.out.println("\n===== Some Other Examples =====");

        System.out.println("x == y : " + (x == y)); // true
        System.out.println("x != y : " + (x != y)); // false
        System.out.println("x >= y : " + (x >= y)); // true
        System.out.println("x <= y : " + (x <= y)); // true

        System.out.println("\n===== End of Program =====");

    }
}