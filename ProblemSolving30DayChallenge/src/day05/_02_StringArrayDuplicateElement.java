package day05;

public class _02_StringArrayDuplicateElement {
    public static void main(String[] args) {
        String strArr[] = {"Amol", "Rohan", "Sagar", "Amol", "Vikas", "Rohan"};

        // To fing duplicate String element in array
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    System.out.println(strArr[j]);
                }
            }
        }

    }
}
