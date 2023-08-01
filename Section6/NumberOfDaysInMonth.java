package Section5;
import java.util.Arrays;
import java.util.List;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        List<Integer> m31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> m30 = Arrays.asList(4, 6, 9, 11);
        if (m31.contains(month)) {
            return 31;
        } else if (m30.contains(month)) {
            return 30;
        } else {
            return isLeapYear(year) ? 29 : 28;
        }
    }
}

