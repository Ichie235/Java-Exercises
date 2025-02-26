package stringExercise;

public class Immutability {
    public static void main(String[] args) {
        String str = "hello java";
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase of =>: "+ uppercase);
        System.out.println("=>: "+ str);
    }
}
