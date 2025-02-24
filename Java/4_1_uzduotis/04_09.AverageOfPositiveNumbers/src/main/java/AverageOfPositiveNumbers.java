
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberCount = 0;
        double averageOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                numberCount++;
            }
        }

        if (numberCount > 0) {
            averageOfNumbers = (double) sum / numberCount;
            System.out.println("Average of the numbers: "+ averageOfNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
