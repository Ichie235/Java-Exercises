package exceptionsExercise;

public class CheckedVsUnchecked {
    public  void validateString(String value) throws EmptyStringException{
        if(value.isEmpty()){
            throw new EmptyStringException("Cannot have an empty string as value");
        }
    }
}
