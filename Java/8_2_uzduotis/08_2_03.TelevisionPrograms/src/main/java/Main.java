import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // skaito vardus, kol empty vardas irasomas
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            // Convert the input string to an integer
            int duration = Integer.valueOf(scanner.nextLine());

            // Create a new TelevisionProgram object with the name and duration
            TelevisionProgram program = new TelevisionProgram(name,duration);

            // Add the program to our ArrayList
            programs.add(program);
        }

        // Ask for the maximum duration to filter programs
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        System.out.println();

        for (int i = 0; i < programs.size(); i++) {
            TelevisionProgram program = programs.get(i);

            if (program.getDuration() <= maxDuration)
            System.out.println(program);

        }

    }
}
