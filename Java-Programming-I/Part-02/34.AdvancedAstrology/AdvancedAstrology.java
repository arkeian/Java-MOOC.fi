
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // int width = 0;
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            // Amount of stars each line: 1, 3, 5, 7, 9, ..., increase by the odds or (2n - 1)
            // width = 2 * i - 1;
            // printStars(width);
            printStars(2 * i - 1);
        }
        // For spaces we take the final width - 3, then divide by 2. OR height - 2.
        // int basePosition = (width - 3) / 2;
        printSpaces(height - 2);
        // printStars(basePosition);
        printStars(3);
        // printStars(basePosition);
        printSpaces(height - 2);
        printStars(3);

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
