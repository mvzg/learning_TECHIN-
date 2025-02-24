
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else {
                sum = sum + number;
                numberCount++;
            }
        }
        System.out.println("Number of numbers: "+ numberCount);
        System.out.println("Sum of the numbers: "+ sum);

    }
}
