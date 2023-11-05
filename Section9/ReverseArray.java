package Section9;
import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] tempArr) {
        System.out.println("Array = " + Arrays.toString(tempArr));
        int temp;
        for (int i = 0; i < tempArr.length / 2; i++) {
            temp = tempArr[i];
            tempArr[i] = tempArr[tempArr.length - i - 1];
            tempArr[tempArr.length - i - 1] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(tempArr));
    }
}