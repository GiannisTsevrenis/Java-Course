package Section6;
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int num = Math.abs(number);
        StringBuilder sbr = new StringBuilder(String.valueOf(num)).reverse();
        return String.valueOf(num).equals(sbr.toString());
    }
}

