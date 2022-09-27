package day06;

public class _01_Remove_Special_Char {
    public static void main(String[] args) {
        String str = "@$*J!AV&A@";
        String plain = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plain);
    }
}
