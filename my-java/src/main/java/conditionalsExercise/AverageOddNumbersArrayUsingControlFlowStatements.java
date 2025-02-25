package conditionalsExercise;

public class AverageOddNumbersArrayUsingControlFlowStatements {
    public static void main(String[] args) {
      int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
      int sum = 0;
      int count =0;
      float average;
      for (int number: numbers){
          if(number%2 != 0){
              sum += number;
              count ++;
          }
      }
      average = (float) sum / count;
        System.out.println("This is the average of odd numbers: "+ average);
    }
}
