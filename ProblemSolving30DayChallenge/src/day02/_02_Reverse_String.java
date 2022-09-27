package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_Reverse_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String str = br.readLine();

        // using str.toCharArray() method
        char[] chArr = str.toCharArray();
        int l = chArr.length-1;
        for (int i=l; i>=0; i--){
            System.out.print(chArr[i]);
        }
        System.out.println();

        // using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        // using StringBuilder
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);
    }
}
