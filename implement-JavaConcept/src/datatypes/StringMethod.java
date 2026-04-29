package datatypes;

// String => it is immutable.
public class StringMethod {
    public static void main(String[] args) {

        System.out.println("===== String Methods Demo =====");

        // 1. String Pool Example => A special memory area in heap where Java stores string literals to save memory by reusing objects.
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2); // true (same reference from pool)
        System.out.println(s1 == s3); // false (different object)
        System.out.println();


        // 2. length() =>  Returns the total number of characters present in the string.
        // charAt() => Returns the character at the specified index (position) in the string. Index starts from 0.
        String name = "Aman";
        int length = name.length();
        System.out.println(length); // 4
        System.out.println(name.charAt(length - 1)); // n
        System.out.println();

        // Returns the char value at the specified index. An index ranges from 0 to length() - 1.
        // The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        //If the char value specified by the index is a surrogate, the surrogate value is returned.



        // 3. equals() =>  Compares two strings and returns true if both strings have the same content (case-sensitive).
        // equalsIgnoreCase() => Compares two strings and returns true if they are equal ignoring case (uppercase/lowercase).
        String first = "Akshit Sharma";
        String second = "Akshit sharma";

        System.out.println(first.equals(second)); // false
        System.out.println(first.equalsIgnoreCase(second)); // true
        System.out.println();


        // 4. compareTo(String str) => Compares two strings lexicographically (dictionary order) based on Unicode values.
        // Returns 0 → if equal, Returns positive → if current string is greater, Returns negative → if current string is smaller
        // compareToIgnoreCase() => Same as compareTo() but ignores case differences.
        String str1 = "remote";
        String str2 = "car";

        System.out.println(str1.compareTo(str2)); // 15 (positive)
        System.out.println(str2.compareTo(str2)); // 0
        System.out.println(str2.compareTo(str1)); // -15 (negative)

        String a = "referf";
        String b = "REFERF";

        System.out.println(a.compareTo(b)); // 32 (case-sensitive)
        System.out.println(a.compareToIgnoreCase(b)); // 0
        System.out.println();


        // 5. substring(int beginIndex) / substring(int beginIndex, int endIndex) => Returns a part of the string from the given index.
        String name1 = "Amar Pandit";
        System.out.println(name1.substring(5));      // Pandit
        System.out.println(name1.substring(5, 11));  // Pandit
        System.out.println();


        // 6. subSequence(int start, int end) => Returns a sequence of characters from the string (similar to substring) but returns a CharSequence.
        String notebook = "Social Science";
        System.out.println(notebook.subSequence(2, 10)); // cial Sci
        System.out.println();


        // 7. trim() => Removes leading and trailing spaces from the string.
        String startupName = "   Panchal And Sons   ";
        System.out.println(startupName.trim()); // Panchal And Sons
        System.out.println();


        // 8. replace(CharSequence old, CharSequence new) => Replaces all occurrences of a specified substring or character with a new value.
        String clientName = "Ajay Upadhayay";
        String newName = clientName.replace("Upadhayay", "Mishra");
        System.out.println(newName); // Ajay Mishra
        System.out.println();


        // 9. contains(CharSequence str) => Checks whether the string contains the given sequence of characters.
        //Returns true or false.
        String title = "Coding Hub";
        System.out.println(title.contains("Hub")); // true
        System.out.println(title.contains("Java")); // false
        System.out.println();


        // 10. startsWith(String prefix) => Checks if the string begins with the specified prefix.
        // endsWith(String suffix) => Checks if the string ends with the specified suffix.
        System.out.println(title.startsWith("Co")); // true
        System.out.println(title.endsWith("Hub"));  // true
        System.out.println();


        // 11. isEmpty() =>  Returns true if the string length is 0 (empty string).
        // isBlank() => Returns true if the string contains only whitespace (spaces, tabs, etc.).
        String str = "";
        System.out.println(str.isEmpty()); // true

        String str3 = "   ";
        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank()); // true
        System.out.println();


        // 12. indexOf(String str / char ch) => Returns the index of the first occurrence of a character or substring.
        // lastIndexOf(String str / char ch) => Returns the index of the last occurrence of a character or substring.
        String complement = "Nice Looks";
        System.out.println(complement.indexOf("e"));  // 3 (first occurrence)
        System.out.println(complement.lastIndexOf("s"));  // 9 (last occurrence)
        System.out.println();


        // 13. String.format(String format, Object... args) => Returns a formatted string using specified format specifiers like %s, %d, etc.
        String formattedStr = String.format(
                "My name is %s and I am %d years old.", "Aman", 25);
        System.out.println(formattedStr);

        System.out.println("\n===== End =====");
    }
}

