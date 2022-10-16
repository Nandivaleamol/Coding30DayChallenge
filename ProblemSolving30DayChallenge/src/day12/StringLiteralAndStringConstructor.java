package day12;

/*
    Question 2:
    String comparison using literals and new String constructor.

 */

public class StringLiteralAndStringConstructor {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "Abc";
        String str3 = new String("Abc");
        String str4 = new String("abc");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equalsIgnoreCase(str4)); // true
    }
}
