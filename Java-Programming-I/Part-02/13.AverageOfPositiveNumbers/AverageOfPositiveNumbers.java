
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivesSum = 0;
        int positivesCount = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            positivesCount++;
            positivesSum += number;
        }

        if (positivesCount > 0) {
            double positivesAvg = 1.0 * positivesSum / positivesCount;
            System.out.println(positivesAvg);
        } else {
            System.out.println("Cannot calculate the average");
        }

        scanner.close();
    }
}
