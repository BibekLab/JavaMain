public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature >= 25 && temperature <= 45);
        }
        return (temperature >= 25 && temperature <= 35);
    }

    public static void main(String[] args) {
        boolean x= isCatPlaying(true, 10); //should return false since temperature is not in range 25 - 45
        System.out.println(x);
        x=isCatPlaying(false, 36); //should return false since temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(x);
        x=isCatPlaying(false, 35); //should return true since temperature is in range 25 - 35
        System.out.println(x);
        x=isCatPlaying(true, 45); //should return true since temperature is in range 25 - 45
        System.out.println(x);
    }
}
