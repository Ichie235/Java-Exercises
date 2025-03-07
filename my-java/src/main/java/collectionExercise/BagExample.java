package collectionExercise;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("lipstick");
        stringBag.addItem("purse");
        stringBag.addItem("money");
        stringBag.removeItem("purse");
    }
}
