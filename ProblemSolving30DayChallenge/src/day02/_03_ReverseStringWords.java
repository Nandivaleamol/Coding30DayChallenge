package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_ReverseStringWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string sentence :");
        String str = br.readLine();

        String sArr[] = str.split(" ");
        for (int i=sArr.length-1; i>=0; i--){
            System.out.print(sArr[i]+" ");

            int a[] = {4,54,65,};

        }
    }
}
