package interfaceExercise;

public interface Countable {
    default void printInfo(){
        System.out.println("Countable print");
    }
}
