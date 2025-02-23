import java.util.Scanner;

public class mileToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles: ");
        int enteredMiles = Integer.valueOf(scanner.nextLine());

        double convertMileToKilometer = enteredMiles * 1.6;
        double roundedValue = Math.round(convertMileToKilometer * 10.0) / 10.0;

        System.out.println(enteredMiles + " miles is " + roundedValue + " kilometers");

    }
}