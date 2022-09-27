package day07;

public class _02_SumMultiOf3_5 {

    public static int sum(Integer n){
        int s1 = 0;
        for (int i=1; i<=n; i++){
            if (i%3==0 || i%5==0){
                s1 = s1+i;
            }
        }
        return s1;
    }
    public static void main(String[] args) {

        System.out.println(sum(6));
    }
}
