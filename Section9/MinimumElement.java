package Section9;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        System.out.println(items);
        return items;
    }

    private static int[] readElements(int number) {
        int[] intList = new int[number];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            intList[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(intList));
        return intList;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j <= min) {
                min = j;
            }
        }
        System.out.println(min);
        return min;
    }
}
