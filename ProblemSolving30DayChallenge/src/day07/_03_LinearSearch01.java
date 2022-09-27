package day07;

public class _03_LinearSearch01 {

    static int search(int n, int arr[]){
        int i;
        for (i=0; i<arr.length; i++){
            if (arr[i]==n){
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,11,6,7,8,10,23,18};
        System.out.println(search(10,arr));
    }
}
