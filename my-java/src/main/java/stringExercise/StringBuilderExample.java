package stringExercise;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Jarvis");
        StringBuilder str2 = new StringBuilder(" Jarvis vins");
        boolean compareString = str1.equals(str2);

        System.out.println(compareString);

        StringBuilder concate = str1.append(str2);

        System.out.println(concate);

        StringBuilder reverseString = str1.reverse();

        System.out.println(reverseString);

        System.out.println(str1);
        System.out.println(str2);
    }
}
