import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // skaito vardus, kol empty vardas irasomas
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            // Convert the input string to an integer
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            // Create a new Book object with title, pages and publication year
            Book bookTyped = new Book(title, pages, publicationYear);

            // Add the program to our ArrayList
            books.add(bookTyped);
        }

        // Ask what to be printed
        System.out.print("What information will be printed? ");
        String whatToPrint = scanner.nextLine();

        System.out.println();

        if (whatToPrint.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);  // Book - referina i Book klase, book naujas variable loopui,
                // books - array list virsuje, get(i) - metodas array listui paimti objekta is jo
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (whatToPrint.equals("name")) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println(book.getTitle());
            }
        }

    }
}
