
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here...

        int sum = 0;
        int numberCount = 0;
        double averageOfNumbers = 0;
        int numberCountEven = 0;
        int numberCountOdd = 0;

        while (true) {
            System.out.println("Give numbers:");
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Thx! Bye! ");
                break;
            } else if (number > 0) {
                sum = sum + number;
                numberCount++;
                if (number % 2 == 0) {
                    numberCountEven++;
                } else if (number % 2 != 0) {
                    numberCountOdd++;
                }
            }
        }

        if (numberCount > 0) {
            averageOfNumbers = (double) sum / numberCount;
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + numberCount);
            System.out.println("Average: "+ averageOfNumbers);
            System.out.println("Even: "+ numberCountEven);
            System.out.println("Odd: "+ numberCountOdd);
        }

    }
}
