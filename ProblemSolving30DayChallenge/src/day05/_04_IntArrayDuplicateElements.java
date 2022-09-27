package day05;

import java.util.ArrayList;

public class _04_IntArrayDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {18, 10, 19, 99, 18, 10, 3, 7, 20, 19, 1, 99};

//         finding duplicate element in array using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
