
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        String username1 = "alex";
        String username2 = "emma";

        String password1 = "sunshine";
        String password2 = "haskell";

        if ((username.equals(username1) && password.equals(password1)) || (username.equals(username2) && password.equals(password2))) {
            System.out.println("You have successfully logged in!!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
