
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String givenString = scan.nextLine();

        System.out.println("Give an integer: ");
        int givenInteger = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double: ");
        double givenDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean: ");
        boolean givenBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "+givenString);
        System.out.println("You gave the integer "+givenInteger);
        System.out.println("You gave the double "+givenDouble);
        System.out.println("You gave the boolean "+givenBoolean);

    }
}
