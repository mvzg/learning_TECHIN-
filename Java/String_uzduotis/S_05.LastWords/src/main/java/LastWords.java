
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int lastSpaceInText = input.lastIndexOf(" "); // suranda paskutini tarpa sakinyje

            if (lastSpaceInText == -1) { // jeigu nera tarpu ir tik vienas zodis isspausdins viena zodi, if spaceAfterFirst word is false
                System.out.println(input);
            } else {
                System.out.println(input.substring(lastSpaceInText + 1)); //paimti viska kas liko po paskutinio tarpo (paskutinis zodis)
            }
        }
    }

}