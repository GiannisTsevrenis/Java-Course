package Section6;
public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        int largestPrime = -1;
        int i = 2;
        while (i * i <= number) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
            i += 1;
        }
        if (number > 1) {
            largestPrime = number;
        }
        return largestPrime;
    }
}
