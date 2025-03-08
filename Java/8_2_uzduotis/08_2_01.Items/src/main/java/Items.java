
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // skaito vardus, kol empty vardas irasomas
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            // prideda new item i list
            Item item = new Item(name);
            items.add(item);
        }

        System.out.println();

        // for ciklas atspausdina visus items on the list
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println(item);
        }

    }
}
