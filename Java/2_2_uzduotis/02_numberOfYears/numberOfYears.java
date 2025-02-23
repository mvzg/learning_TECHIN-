import java.util.Scanner;

public class numberOfYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int enteredMinutes = Integer.parseInt(scanner.nextLine());

        int minutesInYear = 525600;
        int minutesInDay = 1440;

        int years = enteredMinutes / minutesInYear;
        int remainingMinutes = enteredMinutes % minutesInYear;

        int days = remainingMinutes / minutesInDay;

        System.out.println(enteredMinutes + " is aproximately " + years + " years and " + days + " days");

    }
}