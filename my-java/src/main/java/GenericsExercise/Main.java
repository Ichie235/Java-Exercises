package GenericsExercise;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<>();
        boxInteger.setContent(34);

        Box<String> boxString = new Box<>();
        boxString.setContent("Boxing day");
    }
}
