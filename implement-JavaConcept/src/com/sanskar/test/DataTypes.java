package com.sanskar.test;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello Humans!");
        // store integral numbers => byte, sort, int long
        byte age = 127;
        short age1 = 32767;
        int age2 = 2147483647;
        // By default, integer literals in Java are of type int.
        // If the value is too large to fit in int, you must suffix it with 'L' to make it long.
        long age3 = 9223372036854775807L;  // Use uppercase L (recommended):

        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);


        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE); // Byte: -128 to 127
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE); // Short: -32768 to 32767
        System.out.println("Integer: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE); // Integer: -2147483648 to 2147483647
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE); // Long: -9223372036854775808 to 9223372036854775807


        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Long.MIN_VALUE); // -9223372036854775808
        System.out.println(Long.MAX_VALUE);  // 9223372036854775807



        // Store Decimal Numbers => float, double

        // By default, decimal numbers in Java are of type double.

        float mySalary = 1000.11112311212121f;
        double yourSalary = 1000.11112311212121;
        System.out.println(mySalary);
        System.out.println(yourSalary);

        // Float range
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("Float Minimum Value: " + floatMin); // 1.4E-45
        System.out.println("Float Maximum Value: " + floatMax); // 3.4028235E38

        // Double Range
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Double Minimum Value: " + doubleMin); // 4.9E-324
        System.out.println("Double Maximum Value: " + doubleMax); // 1.7976931348623157E308


        // Characters => car keyword is used to store the Single characters symbols or numbers.

        // A char in Java can store only a single character, not multiple characters.
        // Each character corresponds to a numerical value.
        char initial = 'a';
        System.out.println(initial);

        // char name = 'na';  // not allow because it will only store the single character not the multiple characters.

        char number = '5';
        System.out.println(number);

        // Typecasting
        char last = 'A';
        System.out.println( (int) last);  // store as the binary of the 65 in the memory

        System.out.println((int) Character.MIN_VALUE);  // 0
        System.out.println((int) Character.MAX_VALUE);  // 65535 different characters value was assigned

        System.out.println((char) 10084); // ❤

        // Example
        char heartSymbol = (char) 10084;
        System.out.println(heartSymbol);  // ❤

        char hindiChar = 2309;
        System.out.println(hindiChar); // अ

        char snowflake = '\u2764';  // unicode representation
        System.out.println(snowflake);

        // Decimal => 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // Hex Decimal => 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E and F.

        char rightSymbol = '\u27A4';
        System.out.println(rightSymbol);  // ➤


        // Print ASCII Value
        for (int i = 0; i <= 127; i++) {
            System.out.println((char) i);
        }

        // Boolean => Store the boolean value (True / False)
        boolean isEligible = false;
        System.out.println(isEligible);

    }

}


/*

Concept (important for interviews)

| Type  | Size    | Range                      |
| ----- | ------- | -------------------------- |
| byte  | 1 byte  | -128 to 127                |
| short | 2 bytes | -32,768 to 32,767          |
| int   | 4 bytes | ~ -2 billion to +2 billion |
| long  | 8 bytes | very large (~10&sup1;&#x2078;)         |


Precision = how many digits are accurate

| Type     | Precision                |
| -------- | ------------------------ |
| `float`  | ~6 to 7 decimal digits   |
| `double` | ~15 to 16 decimal digits |


*/