package day07;

public class _04_ReverseString {

    static void reverse(String str){

        // custom reverse
        char charArr[] = str.toCharArray();
        for (int i=charArr.length-1; i>=0; i--){
            System.out.println(charArr[i]);
        }

        // using StringBuilder pre defined reverse() method
        StringBuilder builder = new StringBuilder(str);
//        String s = builder.reverse().toString();
        builder.reverse();
        System.out.println(builder);

        // using StringBuffer pre defined reverse() method
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);

    }
    public static void main(String[] args) {
        reverse("Amol");
    }

}
