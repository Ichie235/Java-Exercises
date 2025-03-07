package interfaceExercise;

@FunctionalInterface
public interface NumberOperator {
    //Functional interfaces are interfaces that have only one abstract method .
    // The can have static , default methods and objects etc. but abstract method must be one

    int operate(int a, int b);
}
