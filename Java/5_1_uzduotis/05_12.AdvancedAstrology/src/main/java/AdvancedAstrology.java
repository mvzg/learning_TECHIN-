
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars = "";

        for (int i = 1; i <= number; i++) {
            stars = stars + "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        String spaces = "";

        for (int i = 1; i <= number; i++) {
            spaces = spaces + " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {

        for (int i = 1; i <= height; i++) {
            int spaces = height -i;
            int stars = 2 * i -1;

            printSpaces(spaces);
            printStars(stars);
        }

        for (int i = 1; i <= 2; i++) {
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
