package day05;

import java.util.Scanner;

public class _01_StringDuplicatesChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        String s = str.replace(" ","");
        char chArr[] = s.toCharArray();

        for (int i=0; i< chArr.length-1; i++){
            for (int j=i+1; j< chArr.length; j++){
                if (chArr[i] == chArr[j]){
                    System.out.print(chArr[j]+" ");
                }
            }
        }
    }
}
