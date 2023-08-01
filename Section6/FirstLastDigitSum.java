package Section6;
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        String str = String.valueOf(number);
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        return Character.getNumericValue(first) + Character.getNumericValue(last);
    }
}
