package day14;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {18,10,19,99};
        int[] arr2= new int[arr1.length];

        for (int i=0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }
        // original array retrieving
        System.out.println("Original Array retrieving: ");
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        // copy array retrieving
        System.out.println("Copy Array retrieving: ");
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("Original Array with stream api");
        Arrays.stream(arr1).forEach(n-> System.out.print(" "+n));
    }
}
