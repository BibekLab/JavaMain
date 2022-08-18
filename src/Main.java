import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        SpeedConverter.printConversion(1.5);
//        SpeedConverter.printConversion(10.25);
//        SpeedConverter.printConversion(75.114);
//        SpeedConverter.printConversion(0);
//        SpeedConverter.printConversion(-10);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
//        boolean checkReturn= BarkingDog.shouldWakeUp(true, 1);
//        System.out.println(checkReturn);
//        checkReturn=BarkingDog.shouldWakeUp(false, 2);
//        System.out.println(checkReturn);
//        checkReturn=BarkingDog.shouldWakeUp(true, 8);
//        System.out.println(checkReturn);
//        checkReturn=BarkingDog.shouldWakeUp(true, -1);
//        System.out.println(checkReturn);
//        boolean checkReturn=LeapYear.isLeapYear(1924);
//        System.out.println(checkReturn);
//        checkReturn=LeapYear.isLeapYear(1855);
//        System.out.println(checkReturn);
//        checkReturn=LeapYear.isLeapYear(1800);
//        System.out.println(checkReturn);
//        checkReturn=LeapYear.isLeapYear(1600);
//        System.out.println(checkReturn);
//        checkReturn=LeapYear.isLeapYear(2017);
//        System.out.println(checkReturn);
//        checkReturn=LeapYear.isLeapYear(2000);
//        System.out.println(checkReturn);
//        double x = AreaCalculator.area(-1.00,4.0);
//        if(x < 0 ) System.out.println("Invalid Value");
//        else System.out.println("The area is "+ x);
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);  // should print "525600 min = 1 y and 0 d"
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);  // should print "561600 min = 1 y and 25 d"
//        MinutesToYearsDaysCalculator.printYearsAndDays(0);
        IntEqualityPrinter.printEqual(1, 1, 1); //should print text All numbers are equal
        IntEqualityPrinter.printEqual(1, 1, 2); //should print text Neither all are equal or different
        IntEqualityPrinter.printEqual(-1, -1, -1);// should print text Invalid Value
        IntEqualityPrinter.printEqual(1, 2, 3); //should print text All numbers are different
        IntEqualityPrinter.printEqual(1, 2, 1); //should print text Neither all are equal or different


    }
}
