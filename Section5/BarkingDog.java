package Section5;
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return (barking) && (hourOfDay == 23 || hourOfDay < 8);
    }
}
