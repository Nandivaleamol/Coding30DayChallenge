package day03;

import java.util.Scanner;


/*
Star pattern:
 *
 **
 ***
 ****
 *****
 */

public class _01_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
