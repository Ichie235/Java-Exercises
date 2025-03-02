package interfaceExercise;

public class Rectangle implements Drawable,Countable{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public void printInfo() {
//        Countable.super.printInfo();
        System.out.println("Countable info.");
    }

    public static void main(String[] args) {
        Rectangle printRec = new Rectangle();
        printRec.printInfo();
    }
}
