package Section5;
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        return String.valueOf(x).substring(0,5).equals(String.valueOf(y).substring(0,5));

    }
}
