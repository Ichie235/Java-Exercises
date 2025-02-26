package methodExercise;

import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        greet(name);

    }
    public static void greet(Scanner nameValue){
        System.out.println("Enter your name so that i can greet you");

        System.out.println( "Hello, "+  nameValue.nextLine() + "!" );
    }
}
