package fileExercise;

public class TestWriting {
    public static void main(String[] args) {
        String file = "my_text.txt";
        String[] nameValues = {"ada","obi", "eze", "sam"};
        WriteToFile.writeNames(file,nameValues);
    }
}
