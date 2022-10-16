package day10;

public class CountSpecialCharInString {
    public static void main(String[] args) {
        String s = "Java@ Pro#og$ra@m";
        String specialCharacterRemoved="";

        int count =0;
        for (int i=0; i<s.length(); i++){
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                count++;
            }else{
                specialCharacterRemoved = specialCharacterRemoved + s.charAt(i);
            }
        }
        if (count==0){
            System.out.println("There is no special characters");
        }else{
            System.out.println("Special Characters found : "+count);
        }
        System.out.println("After removing special chars : "+specialCharacterRemoved);
    }
}
