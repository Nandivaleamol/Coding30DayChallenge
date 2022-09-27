package day05;

public class _03_StringArraySizeCustom {
    public static void main(String[] args) {

        String strArr[] = {"Amol","Rohan", "Sagar","Pranav","Amol","Sachin"};

        // iterate String array element using forEach loop
        System.out.println("Array elements : ");
        // find manual String array length
        int count = 0;
        for (String s : strArr){
            count++;
            System.out.println(s);
        }
        System.out.println("Size of String array : "+count);

    }
}
