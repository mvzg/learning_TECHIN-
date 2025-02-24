
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int number = scanner.nextInt();

        int sum = 1;
        int i = 1;

        while (i <= number) {
            sum = sum * i;
            i++;
        }
        System.out.println("Factorial: "+ sum);

    }
}
