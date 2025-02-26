

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        for (int print = number; print >= 1; print--) {
            System.out.println(print);
        }
    }

}
