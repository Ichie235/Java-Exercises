package exceptionsExercise;

public class HandlingExceptions {
    public static void main(String[] args) {
        try{
          ThrowingExceptions throwException = new ThrowingExceptions();
          throwException.validateNumber(-36);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
