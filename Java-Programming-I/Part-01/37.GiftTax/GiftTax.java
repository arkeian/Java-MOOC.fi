
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scan.nextLine());

        double tax = 0;
        if (value >= 1_000_000) {
            tax = (142_100 + (value - 1_000_000) * 0.17);
        } else if (value >= 200_000) {
            tax = (22_100 + (value - 200_000) * 0.15);
        } else if (value >= 55_000) {
            tax = (4_700 + (value - 55_000) * 0.12);
        } else if (value >= 25_000) {
            tax = (1_700 + (value - 25_000) * 0.1);
        } else if (value >= 5_000) {
            tax = (100 + (value - 5_000) * 0.08);
        }

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }

        scan.close();
    }
}
