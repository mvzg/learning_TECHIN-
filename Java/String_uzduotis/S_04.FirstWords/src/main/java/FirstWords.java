
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int spaceAfterFirstWord = input.indexOf(" ");

            if (spaceAfterFirstWord == -1) { // jeigu nera tarpu ir tik vienas zodis isspausdins viena zodi, if spaceAfterFirst word is false
                System.out.println (input);
            } else { System.out.println (input.substring(0, spaceAfterFirstWord));

            }


        }

    }
}
