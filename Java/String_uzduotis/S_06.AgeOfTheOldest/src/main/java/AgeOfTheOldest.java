
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0; //didziausias amzius turi buti maziausias, kad butu galima patikrinti ir sukeisti jei atsiras didesnis

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int commaIndex = input.indexOf(","); // suranda kableli, kad butu galima naudoti indeksa po jo

            if (commaIndex != -1) { // comma Index true, rado kableli
                String ageInAString = input.substring(commaIndex + 1); //randa skaiciu, sekantis po kablelio
                int age = Integer.parseInt(ageInAString); // string paverciam integer kad galetu skaiciuot

            if (age > oldestAge ) {
                oldestAge = age;
            }
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);

        }

    }

