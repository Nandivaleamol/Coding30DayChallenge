package day03;

import java.util.Scanner;
/*
 star pattern : n=5
    * * * * *
    * * * *
    * * *
    * *
    *
 */
public class _02_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        // printing n rows
        for (int i=n; i>0; i--){
            // inner loop for printing stars
            for (int j=i; j>0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
