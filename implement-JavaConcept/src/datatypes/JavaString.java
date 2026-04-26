package datatypes;

// Understanding String Data Types, Heap Memory, and String Pool

public class JavaString {
    public static void main(String[] args) {

        // ==================================================
        // Object Creation (Stored in Heap Memory)
        // ==================================================
        Student student = new Student();  // Object created in Heap Memory
        student.name = "Aman";
        student.address = "India";
        student.standard = 4;
        student.rollNumber = 20;

        System.out.println("Student Name: " + student.name);

        // ==================================================
        // String using 'new' keyword (Heap Memory)
        // ==================================================
        String a = new String("Ram");  // Creates object in Heap
        String b = new String("Ram");  // Creates another object in Heap

        System.out.println("\nUsing new keyword:");
        System.out.println(a == b); // false (different memory locations)


        // ==================================================
        // String Literals (String Pool)
        // ==================================================
        String c = "Ram";
        String d = "Ram";

        System.out.println("\nUsing String Literal:");
        System.out.println(c == d); // true (same reference from String Pool)


        // ==================================================
        // Mixed Example (Heap vs String Pool)
        // ==================================================
        String x = "Ajay";                 // Stored in String Pool
        String p = new String("Ajay");     // New object in Heap
        String q = new String(x);          // New object in Heap
        String r = "Ajay";                 // Same reference from String Pool
        String s = "Ajay";                 // Same reference from String Pool

        System.out.println("\nMixed Example:");
        System.out.println(p == q); // false (different Heap objects)
        System.out.println(r == s); // true (same String Pool reference)


        // ==================================================
        // Important Concept: == vs equals()
        // ==================================================
        System.out.println("\nComparison using equals():");
        System.out.println(a.equals(b)); // true (values are same)
        System.out.println(p.equals(q)); // true (values are same)
    }
}


/*

==================================================
JVM Memory Concept (Simple Explanation)
==================================================

1. When a Java program runs, the Operating System (OS)
   allocates memory to the JVM (Java Virtual Machine).

2. JVM divides memory into different parts:
   - Heap Memory
   - Stack Memory
   - Method Area (includes String Pool)

3. Heap Memory:
   - Used to store objects and instance variables.
   - Example: new Student(), new String()

4. Stack Memory:
   - Stores reference variables and method calls.
   - Example: reference 'student', 'a', 'b'

5. String Pool:
   - Special area inside Heap/Method Area.
   - Stores unique string literals.
   - Avoids duplicate objects to save memory.

==================================================
Key Points:
==================================================

- "new" keyword → always creates a new object in Heap
- String literal ("Ram") → stored in String Pool
- == → compares memory addresses
- equals() → compares actual values

==================================================
*/
