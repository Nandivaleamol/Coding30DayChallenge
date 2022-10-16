package day08;

import java.util.Locale;
import java.util.Scanner;

public class _01_ConvertUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( str.toUpperCase(Locale.ROOT));
    }
}
