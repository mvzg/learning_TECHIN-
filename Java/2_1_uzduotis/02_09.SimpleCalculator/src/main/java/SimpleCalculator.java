
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        int sumOfNumbers = firstNumber + secondNumber;
        int deductionOfNumbers = firstNumber - secondNumber;
        int multiplicationOfNumbers = firstNumber * secondNumber;
        double divisionOfNumbers = (double) firstNumber / secondNumber;

        System.out.println(firstNumber+" + "+secondNumber+" = "+sumOfNumbers);
        System.out.println(firstNumber+" - "+secondNumber+" = "+deductionOfNumbers);
        System.out.println(firstNumber+" * "+secondNumber+" = "+multiplicationOfNumbers);
        System.out.println(firstNumber+" / "+secondNumber+" = "+divisionOfNumbers);

    }
}
