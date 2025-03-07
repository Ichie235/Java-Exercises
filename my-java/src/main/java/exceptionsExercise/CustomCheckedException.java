package exceptionsExercise;

public class CustomCheckedException {
    public  void validateAge(int age)throws InvalidAgeException{
        if(age < 0 || age > 120){
            throw new InvalidAgeException("Incorrect age bracket");

        }
    }

    public static void main(String[] args) {
        try{
            CustomCheckedException validateAgeException = new CustomCheckedException();

            validateAgeException.validateAge(130);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
