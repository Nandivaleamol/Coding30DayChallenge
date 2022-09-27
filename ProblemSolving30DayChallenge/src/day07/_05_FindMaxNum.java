package day07;

public class _05_FindMaxNum {

    public static int maxNum(int arr[]){
        int max=arr[0];
        for (int i : arr){
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,10,5,6,7,9};
        System.out.println(maxNum(arr));
    }
}
