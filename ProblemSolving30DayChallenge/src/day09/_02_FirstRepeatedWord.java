package day09;

public class _02_FirstRepeatedWord {
    public static void main(String[] args) {
        String  str = "ab aba ab ab abcd aba";
        String word[] = str.split("\\s");
        int count = 0;

        for (int i=0; i<word.length; i++){
            count = 1;
            for (int j=i+1; j<word.length; j++){
                if (word[i].equals(word[j])){
                    count = count+1;
                    word[j] = "0";
                }
            }
            if (count >1 && word[i] !="0"){
                System.out.print(word[i]+" ");
            }
        }
    }
}
