package day03;

import java.util.Scanner;
/* star pattern:
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 */
public class _03_StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();

        int count =0;

        for (int i=1; i<=n; i++){
            count++;
            for (int j=1; j<=n; j++){
                count ++;
                   System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
