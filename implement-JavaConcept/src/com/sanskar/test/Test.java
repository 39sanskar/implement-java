package com.sanskar.test;

public class Test {
    public static void main(String[] strings) {
        System.out.println("Hello Humans!");
        if (strings.length >= 2) {
            System.out.println(strings[0]);
            System.out.println(strings[1]);
        } else {
            System.out.println("Please provide 2 arguments");
        }
    }
}


// compile => javac -d out src/com/sanskar/test/Test.java

// cd out
// java com.sanskar.test.Test mongo cat
