package day11;

import java.util.Scanner;

public class LinearSearchAlgorithm01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("Enter search key");
        int key = scanner.nextInt();
        int search = linearSearchAlgo(inputArray, key);
        if (search!=-1)
            System.out.println(key + " found at index "+search);
        else
            System.out.println(key+" not found in inputArray");
    }
    public static int linearSearchAlgo(int[] arr, int key){
        for (int i=0; i<arr.length; i++){
            if (key==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
