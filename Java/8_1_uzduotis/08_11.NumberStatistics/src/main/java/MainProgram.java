
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        //Pirma suma is Statistics class
        Statistics statistics = new Statistics(); // reikia kad veiktu metodai is Statistics class

        //Suma even skaiciams, reikia pritaikyti addNumber metoda even skaiciams
        Statistics evenStats = new Statistics();

        //Suma odd skaiciams, reikia pritaikyti addNumber metoda odd skaiciams
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            statistics.addNumber(input); // call'inu metoda

            if(input % 2 == 0) {
                evenStats.addNumber(input);
            } else {
                oddStats.addNumber(input);
            }
        }
        System.out.println("");
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}


