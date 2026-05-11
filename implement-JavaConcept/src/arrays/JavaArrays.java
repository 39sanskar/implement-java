package arrays;

// Arrays => collection of the similar kind of data.
public class JavaArrays {
    public static void main(String[] args) {

        // ------------------ 1D ARRAY BASICS ------------------

        // Declaration & Initialization
        int[] arr = new int[10];  // Creates an array of size 10 initialized with zeros. memory allocate for an array in a heap
        arr[3] = 45;
        arr[7] = 89;

        System.out.println("Traversing array using for-loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // Direct initialization
        int[] arr1 = {1, 2, 3, 4};
       //  System.out.println(arr1); // [I@27716f4  { hash-code is the unique identifier of the object }

        System.out.println("\nUsing enhanced for-each loop:");

        // for-each loop is specially work in arrays ( collection of the data )
        for (int i: arr1){
            System.out.println(i);
        }

        // ------------------ SEARCHING IN ARRAY ------------------

        int[] arr2 = { 1, 4, 2, 55, 7, -2};
        System.out.println("\nSearching for element '55':");
        boolean found = false;
        for (int val: arr2) {
            if (val == 55) {
                System.out.println("Element found!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }

        // ------------------ FIND MAX ELEMENT ------------------

        int[] arr3 = new int[5];
        arr3[0] = 2;
        arr3[1] = 12;
        arr3[2] = 4322;
        arr3[3] = -32;
        arr3[4] = 22;

        int res = Integer.MIN_VALUE;  // negative infinity (Store negative infinity because it is smallest number)

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > res) {
                res = arr3[i];
            }
        }

        System.out.println(res);  // 4322


        // ------------------ REVERSE ARRAY ------------------

        int[] arr4 = {1, 3, 43, 4, 345, 53, 5, 4};
        System.out.println("\nReversed array:");
        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();


        // ------------------ SUM OF ARRAY ELEMENTS ------------------

        int[] arr5 = { -2, 4, 55, -4, 11, -55, -11, 2};
        int sum = 0;  //  Initialize the sum equal to zero

        for (int num : arr5) {
            sum += num;
        }
        System.out.println("\nSum of all elements: " + sum);


        // --------- 2D Array ---------------

        int[][] arr6 = new int[3][3]; // basically it will create a matrix for 3X3

        // Fixed-size 2D array (Matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nPrinting 2D Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }


        // ------------------ CHARACTER 2D ARRAY ------------------

        char[][] charArr = new char[3][2];
        charArr[0][0] = 'a';
        charArr[0][1] = 'b';
        charArr[1][0] = 'c';
        charArr[1][1] = 'd';
        charArr[2][0] = 'e';
        charArr[2][1] = 'f';

        System.out.println("\nCharacter 2D Array:");
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                System.out.print(charArr[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array => Array of different length arrays.

        // ------------------ JAGGED ARRAY EXAMPLE ------------------

        // A jagged array has rows with varying lengths
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5, 6},
                {7},
                {8, 9, 10}
        };

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}




/*
* Heap Memory:
*
*  +---+---+---+---+---+
*  | 0 | 0 | 0 | 0 | 0 |     <== Array object (of 5 integers) in heap memory
*  +---+---+---+---+---+
*  ^
*  |
*
*  Stack Memory:
*
*  arr (reference variable) which is store (starting address) in the stack part of the memory.
*
* */


/*

Concept	               Description
Array Declaration	   int[] arr = new int[size];
Initialization	       Can be done at declaration or later
Traversal	           Using traditional for loops or enhanced for-each loop
Searching	           Loop through elements and compare values
Finding Max Element	   Compare current max with every element
Reverse Traversal	   Start from last index (length - 1) down to 0
Summation	           Initialize variable to 0, add up all elements
2D Arrays	           Matrix-like structure accessed via [row][col]
Jagged Arrays	       Rows can have different column sizes

 */
