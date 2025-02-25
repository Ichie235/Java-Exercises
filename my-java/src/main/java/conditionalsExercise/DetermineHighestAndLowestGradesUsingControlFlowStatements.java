package conditionalsExercise;

public class DetermineHighestAndLowestGradesUsingControlFlowStatements {
    public static void main(String[] args) {
        int[] grades = {75,45,89,23,47,82,35,99,34};
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade: grades){
            if(grade > highest) {
                highest = grade;
            }
            if(grade< lowest){
                lowest = grade;
            }
            System.out.println(lowest);
        }

    }
}
