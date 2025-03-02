
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(list.size() - 1)); //suskaiciuoja kiek yra elementu ir -1 kad paimti paskutini indeksta, nes bus indekso skaicius visada maziau -1 nei bendras elementu ilgis

    }
}
