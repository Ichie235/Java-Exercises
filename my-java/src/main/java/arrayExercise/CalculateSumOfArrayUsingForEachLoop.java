package arrayExercise;

public class CalculateSumOfArrayUsingForEachLoop {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        int initializer = 0;
        for (int number : arrayOfNumbers) {
            initializer += number;
            System.out.println("Sum of array:" + initializer);
}
    }
}
