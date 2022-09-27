package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Que. 2. Write a program in Java to find out if a number is prime in Java?
public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number here : ");
        int n = Integer.parseInt(br.readLine());

       for(int i=2; i<n; i++){
           if (n%i==0){
               System.out.println(n+" is not prime number");
               return;
           }else{
               System.out.println(n+" is prime number");
               return;
           }
       }
    }
}
