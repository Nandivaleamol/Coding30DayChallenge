package day11;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchAlgo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted Array "+Arrays.toString(array));
        System.out.println("Enter search key ");
        int searchKey = scanner.nextInt();
        int firstIndex = 0;
        int lastIndex = array.length-1;
        int index = binarySearch(array, searchKey,firstIndex, lastIndex);
        if (index!=-1)
            System.out.println(searchKey +" found at index "+index);
        else
            System.out.println(searchKey+" not found in Array");
    }
    public static int binarySearch(int array[], int key,int firstIndex, int lastIndex){
       while (firstIndex<=lastIndex){
           int middleIndex=(firstIndex+lastIndex)/2;
           if (array[middleIndex]==key)
               return middleIndex;
           else if (key<array[middleIndex])
               lastIndex=middleIndex-1;
           else
               firstIndex = middleIndex+1;
       }
        return -1;
    }
}
