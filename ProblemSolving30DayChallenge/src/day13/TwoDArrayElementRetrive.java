package day13;

public class TwoDArrayElementRetrive {
    public static void main(String[] args) {
//        int [] [] a = new int[3][2];
        int [][] a={{10,20,30},
                {40,50},
                {60,70,80}};

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
