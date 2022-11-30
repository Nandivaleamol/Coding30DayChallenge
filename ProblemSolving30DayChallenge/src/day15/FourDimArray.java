package day15;

import java.util.Arrays;
import java.util.List;

public class FourDimArray {
    public static void main(String[] args) {
        int [][][][] arr = {{{{10,20},{30,40,50}},
                {{60,70,80},{90,100}},
                {{5,10,15,20},{25,30,35,40}} }};

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                for (int k=0; k<arr[i][j].length; k++){
                    for (int l=0; l<arr[i][j][k].length; l++){
                        System.out.print(arr[i][j][k][l]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
