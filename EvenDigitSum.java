package Section6;
public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int temp;
        int sum = 0;
        while (number != 0) {
            temp = number % 10;
            sum += (temp % 2 == 0) ? temp : 0;
            number /= 10;
        }
        return sum;
    }
}

