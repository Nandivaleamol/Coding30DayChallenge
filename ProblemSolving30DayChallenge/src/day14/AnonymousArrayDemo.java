package day14;

public class AnonymousArrayDemo {
    public static void main(String[] args) {

        anoArray(new int[]{10,20,30,40,50});
    }
    static void anoArray(int[] arr){
        int total = 0;
        for (int i=0; i<arr.length; i++){
            total = total+arr[i];
        }
        System.out.println(total);
    }
}
