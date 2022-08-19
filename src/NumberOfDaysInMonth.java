public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 100 == 0) {
            return (year % 400 == 0);
        }
            return (year % 4 == 0);
        }

    public static int getDaysInMonth(int month, int year) {
        boolean leapYear = isLeapYear(year);
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            boolean longerMonths = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
            if (leapYear) {
                if (longerMonths) {
                    return 31;
                } else if (month == 2) {
                    return 29;
                } else {
                    return 30;
                }
            } else {
                if (longerMonths) {
                    return 31;
                } else if (month == 2) {
                    return 28;
                } else {
                    return 30;
                }
            }
        }
    }



    public static void main(String[] args) {
        boolean value = isLeapYear(9000);
        //int days = getDaysInMonth(2, 2020);
        System.out.println(value);


    }
}
