package Section6;
import java.util.Arrays;
import java.util.List;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int temp = reverse(number);
        List<String> list = Arrays.asList("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        for (int i = 0; i < getDigitCount(reverse(number)); i++) {
            System.out.println(list.get(temp % 10));
            temp /= 10;
        }
        int dif = getDigitCount(number) - getDigitCount(reverse(number));
        if (dif != 0) {
            for (int i = 0; i < dif; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        StringBuilder temp = new StringBuilder(String.valueOf(Math.abs(number)));
        temp.reverse();
        return number > 0 ? Integer.parseInt(String.valueOf(temp)) : -Integer.parseInt(String.valueOf(temp));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(Math.abs(number)).length();
    }
}
