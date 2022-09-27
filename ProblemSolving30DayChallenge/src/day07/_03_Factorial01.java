package day07;

public class _03_Factorial01 {

    static int fact(int n){

        int factorial = 1;
        if (n<1){
            return 1;
        }
        for (int i=1; i<=n; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
