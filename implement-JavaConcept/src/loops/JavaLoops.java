package loops;

/**
 * A comprehensive guide to different loop structures in Java:
 * - while loop
 * - do-while loop
 * - for loop
 * - Nested loops
 * - Infinite loops
 * - Break and continue statements
 */
public class JavaLoops {

    public static void main(String[] args) {

        // ==================== WHILE LOOP ====================
        /*
         * Definition:
         * The while loop executes a block of code repeatedly as long as a given condition is true.
         *
         * Syntax:
         * while(condition) {
         *     // code to execute
         * }
         */

        System.out.println("=== WHILE LOOP EXAMPLE ===");
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World (" + i + ")");
            i++;
        }

        // ==================== DO-WHILE LOOP ====================
        /*
         * Definition:
         * The do-while loop executes the block once before checking the condition,
         * so it runs at least once even if the condition is false initially.
         *
         * Syntax:
         * do {
         *     // code to execute
         * } while(condition);
         */

        System.out.println("\n=== DO-WHILE LOOP EXAMPLE ===");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // ==================== FOR LOOP ====================
        /*
         * Definition:
         * The for loop provides a compact way to iterate over a range of values.
         *
         * Syntax:
         * for(initialization; condition; increment/decrement) {
         *     // code to execute
         * }
         */

        System.out.println("\n=== FOR LOOP EXAMPLE ===");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Number: " + k);
        }

        // ==================== MULTIPLE CONDITIONS IN FOR LOOP ====================
        // Add Multiple Conditions in a single line of the code.
        System.out.println("\n=== MULTIPLYING BY 10 EACH TIME ===");
        for (int l = 1, m = 1; m <= 7; l *= 10, m++) {
            System.out.println(l);
        }

        // ==================== PRINT TABLE OF 7 ====================
        System.out.println("\n=== TABLE OF 7 ===");
        for (int n = 1; n <= 10; n++) {
            System.out.println(n + " * 7 = " + (n * 7));
        }

        // ==================== SUM OF NATURAL NUMBERS ====================
        System.out.println("\n=== SUM OF FIRST 10 NATURAL NUMBERS ===");
        int sum = 0;
        int p = 1;
        while (p <= 10) {
            sum += p;
            p++;
        }
        System.out.println("Sum = " + sum); // Output: 55

        // ==================== COUNT NUMBER OF DIGITS ====================
        System.out.println("\n=== COUNT DIGITS IN A NUMBER ===");
        int q = 46734633;
        int digitCount = 0;
        int tempQ = q;
        while (tempQ > 0) {
            tempQ /= 10;
            digitCount++;
        }
        System.out.println("Digits in " + q + " = " + digitCount); // Output: 8

        // ==================== FACTORIAL OF A NUMBER ====================
        System.out.println("\n=== FACTORIAL OF 6 ===");
        int r = 6;
        int factorial = 1;
        while (r > 0) {
            factorial *= r;
            r--;
        }
        System.out.println("Factorial = " + factorial); // Output: 720

        // ==================== NESTED LOOPS - RIGHT TRIANGLE PATTERN ====================
        System.out.println("\n=== RIGHT TRIANGLE STAR PATTERN ===");
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ==================== REVERSE TRIANGLE PATTERN ====================
        System.out.println("\n=== REVERSE TRIANGLE PATTERN ===");
        for (int s = 6; s >= 1; s--) {
            for (int t = 1; t <= s; t++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ==================== BREAK STATEMENT ====================
        System.out.println("\n=== USING BREAK TO EXIT LOOP EARLY ===");
        for (int b = 1; b <= 10; b++) {
            if (b == 5) {
                break; // exits loop when b == 5
            }
            System.out.print(b + " ");
        }
        System.out.println(); // New line after output

        // ==================== CONTINUE STATEMENT ====================
        System.out.println("\n=== USING CONTINUE TO SKIP ITERATION ===");
        for (int c = 1; c <= 10; c++) {
            if (c % 2 == 0) {
                continue; // skips even numbers
            }
            System.out.print(c + " ");
        }
        System.out.println();

        // ==================== INFINITE LOOP (commented out to avoid crash) ====================
        /*
        System.out.println("\n=== INFINITE LOOP EXAMPLE ===");
        while(true) {
            System.out.println("This will run forever unless broken manually.");
        }
        */

        // ==================== USEFUL PATTERNS WITH LOOPS ====================

        // Pyramid Pattern
        System.out.println("\n=== PYRAMID PATTERN ===");
        int rows = 5;
        for (int row = 1; row <= rows; row++) {
            // Spaces
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }
            // Stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Number Triangle
        System.out.println("\n=== NUMBER TRIANGLE PATTERN ===");
        for (int numRow = 1; numRow <= 5; numRow++) {
            for (int col = 1; col <= numRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

/*


=== WHILE LOOP EXAMPLE ===
Hello World (0)
Hello World (1)
Hello World (2)
Hello World (3)
Hello World (4)

=== DO-WHILE LOOP EXAMPLE ===
1
2
3
4
5

=== FOR LOOP EXAMPLE ===
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5

=== MULTIPLYING BY 10 EACH TIME ===
1
10
100
1000
10000
100000
1000000

=== TABLE OF 7 ===
1 * 7 = 7
2 * 7 = 14
3 * 7 = 21
4 * 7 = 28
5 * 7 = 35
6 * 7 = 42
7 * 7 = 49
8 * 7 = 56
9 * 7 = 63
10 * 7 = 70

=== SUM OF FIRST 10 NATURAL NUMBERS ===
Sum = 55

=== COUNT DIGITS IN A NUMBER ===
Digits in 46734633 = 8

=== FACTORIAL OF 6 ===
Factorial = 720

=== RIGHT TRIANGLE STAR PATTERN ===
*
* *
* * *
* * * *
* * * * *
* * * * * *

=== REVERSE TRIANGLE PATTERN ===
* * * * * *
* * * * *
* * * *
* * *
* *
*

=== USING BREAK TO EXIT LOOP EARLY ===
1 2 3 4

=== USING CONTINUE TO SKIP ITERATION ===
1 3 5 7 9

=== PYRAMID PATTERN ===
    *
   ***
  *****
 *******
*********

=== NUMBER TRIANGLE PATTERN ===
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
