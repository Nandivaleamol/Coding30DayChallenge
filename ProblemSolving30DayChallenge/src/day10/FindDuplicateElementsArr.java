package day10;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsArr {
    public static void main(String[] args) {
        int arr1[] = {12,18,10,15,20,25};
        int arr2[] = {11,18,10,16,21,25};
        printInterSection(arr1,arr2);
        printUnion(arr1,arr2);
    }

    // printing common elements
    public static void printUnion(int[] arr1, int[] arr2 ){
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i=0; i< arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union");
        System.out.println(set);
    }


    // printing duplicate elements
    public static void printInterSection(int[] arr1,int[] arr2){
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        System.out.println("Inter Section");
        for (int i=0; i<arr2.length; i++){
           if (set.contains(arr2[i])){
               System.out.println(arr2[i]);
           }
        }
    }
}
