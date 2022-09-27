package day01;

public class ReverseStringWord {

    static void reverseWord(String s){

        String sArr[] =s.split(". ");
        for (int i= sArr.length-1; i>=0; i--){
            System.out.print(sArr[i]+".");
        }
    }
    public static void main(String[] args) {

        String s = "i. like. java. program";
        reverseWord(s);
    }
}
