package Section5;
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        return summer? (temperature <= 45 && temperature >=25) : (temperature <= 35 && temperature >=25);
    }
}
