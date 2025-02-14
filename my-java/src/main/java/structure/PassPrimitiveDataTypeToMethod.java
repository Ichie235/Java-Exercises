package structure;

public class PassPrimitiveDataTypeToMethod {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value of x before: " + x);
        modifyNumber(x);
        System.out.println("Value of x after: " + x);
    }

    public static void modifyNumber(int x) {
        x = x * 6;
    }
}
