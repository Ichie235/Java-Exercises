package stringExercise;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello, world";
        System.out.println("Length of =>: "+ str1.length());
        System.out.println("Uppercase of =>: "+ str1.toUpperCase());
        System.out.println("Lowercase of =>: "+ str1.toLowerCase());
        System.out.println("Substring of =>: "+ str1.substring(7,12));
        System.out.println("Substring of =>: "+ str1.replace("world","java"));
    }
}
