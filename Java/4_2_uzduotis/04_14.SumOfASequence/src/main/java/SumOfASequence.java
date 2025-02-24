
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = scanner.nextInt();
        int i = 0;
        int sum = 0;

        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum is "+ sum);

    }
}
