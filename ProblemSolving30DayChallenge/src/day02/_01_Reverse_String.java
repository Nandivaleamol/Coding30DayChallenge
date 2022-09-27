package day02;
import java.util.Scanner;

public class _01_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string word : ");
        String str = sc.nextLine();

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
