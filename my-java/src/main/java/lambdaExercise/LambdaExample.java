package lambdaExercise;

import interfaceExercise.NumberOperator;
import interfaceExercise.StringFormatter;

public class LambdaExample {
    public static void main(String[] args) {
        NumberOperator addition = (a, b) -> a + b;
        int sum = addition.operate(5, 10);
        System.out.println("Sum: " + sum);

        NumberOperator maxNumber = ((a, b) -> (a > b) ? a : b);
        int max =  maxNumber.operate(15,40);
        System.out.println("Max: "+ max);

        StringFormatter formatter = (value -> value.toUpperCase());
        String uppercaseName = formatter.format("ichie");
        System.out.println(uppercaseName);
    }
}
