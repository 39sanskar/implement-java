package datatypes;

// Understanding String Data Types, Heap Storage, and String Pool
public class Test {
    public static void main(String[] args) {
        Student student = new Student();  // using new keyword to create a Object inside memory.
        student.name = "Aman";
        student.address = "India";
        student.standard = 4;
        student.rollNumber = 20;
        System.out.println(student.name);

        String a = new String("Ram");  //  here using new keyword create Object and provide a location in heap memory.
        String b = new String("Ram");  //  here using new keyword create Object and provide a location in heap memory.
        System.out.println(a == b); // false (basically a and b are the memory address in the Heap)

        String c = "Ram";
        String d = "Ram";
        System.out.println(c == d); // true


        String x = "Ajay";  // here memory location is allocated, store in the String Pool and that reference is goes to x.
        String p = new String("Ajay");
        String q = new String(x);
        String r = "Ajay";
        String s = "Ajay";
        System.out.println(p == q); // false (here memory location of p and q is different)
        System.out.println(r == s); // true  (here memory location of the r and s is same)

        // In the above example  x, c and d  will point to the memory location of Ajay store in string Pool.
        // a and b  will point to the memory location of Ajay stored in Heap (because we mention new)
    }
}


/*

- When a Java program runs, the Operating System (OS) allocates memory to the JVM (Java Virtual Machine).
- This memory is divided into different parts, and one important part is Heap Memory.
- Heap Memory Definition:
- Heap memory is the area of memory used by the JVM to store objects and instance variables during program execution.

- The operating system provides memory to the JVM, and heap memory is used to store objects created in a Java program.

*/
