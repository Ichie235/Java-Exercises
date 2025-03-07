package exceptionsExercise;

public class ThrowingExceptions {
    public void validateNumber(int value){
        if(value < 0 ){
            throw new IllegalArgumentException("Number must be positive number.");
        }
    }
}
