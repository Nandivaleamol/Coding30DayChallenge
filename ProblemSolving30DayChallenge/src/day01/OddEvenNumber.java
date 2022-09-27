package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Write a program in Java to check if a number is even or odd in Java?
 */

public class OddEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number here : ");
        int n =Integer.parseInt(br.readLine()) ;

        if (n%2==0)
            System.out.println(n+" is Even number");
        else if (n%2!=0)
            System.out.println(n+ " is Odd number");
        else
            System.out.println("Invalid input");
    }
}
