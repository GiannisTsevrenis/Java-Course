package Section6;
public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        if ((x % 10 == y % 10) || (x % 10 == y / 10 % 10)) {
            return true;
        } else return (x / 10 % 10 == y % 10) || (x / 10 % 10 == y / 10 % 10);
    }
}
