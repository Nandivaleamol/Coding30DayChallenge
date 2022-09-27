package day04;

import java.util.Scanner;

public class _01_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth row: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
