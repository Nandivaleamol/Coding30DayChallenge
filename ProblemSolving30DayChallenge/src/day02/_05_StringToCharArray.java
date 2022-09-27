package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_StringToCharArray {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String word:");
        String str = read.readLine();

        str.replace(" ", "");
        char [] chars = str.toCharArray();
        for (int i=0; i<chars.length; i++){
            System.out.print(chars[i]+" ");
        }
    }
}
