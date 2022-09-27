package day02;

public class _04_SearchElementInArray {
    public static void main(String[] args) {
        int arr[] ={12,4,54,65,34,18,10,19};

        int i=0;
        int element= 18;
        int l = arr.length;
        for (i=0; i<l; i++){
            if (arr[i]==element){
                System.out.println(i);
                return;
            }
        }
    }
}
