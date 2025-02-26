package stringExercise;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "hello java";
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string value to compare: ");
        String str2 = scanner.nextLine();
        boolean compareString = str1.equals(str2);
        System.out.println(compareString);
    }
}
