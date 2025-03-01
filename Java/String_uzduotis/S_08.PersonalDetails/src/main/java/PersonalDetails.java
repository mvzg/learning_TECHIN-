
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestNameLenght = 0;
        String longestName = "";

        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            int commaIndex = input.indexOf(","); // suranda kableli, kad butu galima naudoti indeksa po jo

            if (commaIndex != -1) { // comma Index true, rado kableli
                String ageInAString = input.substring(commaIndex + 1); //randa skaiciu, sekantis po kablelio
                String nameInAstring = input.substring(0,commaIndex);
                int age = Integer.parseInt(ageInAString); // string paverciam integer kad galetu skaiciuot

                sum = sum + age;
                count++;

                if (nameInAstring.length() > longestNameLenght) {
                    longestNameLenght = nameInAstring.length();
                    longestName = nameInAstring;
                }
            }
        }

        double average = (double)sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years : " + average);

    }
}
