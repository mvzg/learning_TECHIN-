
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // skaito vardus, kol empty vardas irasomas
        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            //Sukurti objekta
            PersonalInformation allInfo = new PersonalInformation(firstName, lastName, identificationNumber);
            infoCollection.add(allInfo);

            }

        System.out.println();

        for (int i = 0; i < infoCollection.size(); i++) {
            PersonalInformation info = infoCollection.get(i);
            System.out.println(info.getFirstName() + " " + info.getLastName());

        }

    }
}
