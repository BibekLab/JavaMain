public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return year % 4 == 0;
        }
        return false;
    }
}