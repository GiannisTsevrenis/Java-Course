package Section9;
import java.util.*;

public class SortedArray {
    public static int[] getIntegers(int size) {
        int[] tempArray = new int[size];
        int cc = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            tempArray[cc] = scanner.nextInt();
            cc++;
        } while (cc != size);
        System.out.println(Arrays.toString(tempArray));
        return tempArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] tempArr = Arrays.copyOf(array, array.length);
        Arrays.sort(tempArr);
        int temp;
        for (int i = 0; i < tempArr.length / 2; i++) {
            temp = tempArr[i];
            tempArr[i] = tempArr[tempArr.length - i - 1];
            tempArr[tempArr.length - i - 1] = temp;
        }
        return tempArr;
    }
}


