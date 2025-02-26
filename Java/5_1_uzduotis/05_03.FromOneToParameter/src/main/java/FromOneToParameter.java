

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }

    public static void printUntilNumber(int number) {
        for (int print = 1; print <= number; print++) {
            System.out.println(print);
        }

    }
}
