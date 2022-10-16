package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _02_NthOdNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n value:");
        int n = Integer.parseInt(bf.readLine()) ;

        int count=0;
        for (int i=1; i<=n; i++){

            if (i%2!=0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Count "+count);
    }
}
