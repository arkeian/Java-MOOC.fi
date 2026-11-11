
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());

        System.out.print("Number " + number + " is ");
        if (number % 2 == 0) {
            System.out.println("even.");
        } else {
            System.out.println("odd.");
        }

        scan.close();
    }
}
