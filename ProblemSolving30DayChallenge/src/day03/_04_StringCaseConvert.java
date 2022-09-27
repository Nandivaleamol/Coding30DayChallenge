package day03;

import java.util.Scanner;

public class _04_StringCaseConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        // lowercase
        System.out.println(str.toLowerCase());

        // uppercase
        System.out.println(str.toUpperCase());

    }
}
