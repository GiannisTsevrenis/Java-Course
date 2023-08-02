package Section6;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            String nextEntry = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextEntry);
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                if (count == 0) {
                    System.out.println("SUM = " + 0 + " AVG = " + 0);
                } else {
                    System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
                }
                break;
            }
        }
    }
}
