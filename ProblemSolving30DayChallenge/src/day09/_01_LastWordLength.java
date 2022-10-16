package day09;

public class _01_LastWordLength {
    public static void main(String[] args) {

        String str = "amol is a good boy";
        str = str.trim();
        int count = 0;

        for (int i=str.length()-1; i>=0; i--){
            if (str.charAt(i) !=' '){
                count++;
            }else{
                break;
            }
        }
        System.out.println("count : "+count);
    }
}
