public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        int fnRightDigit, snRightDigit, tnRightDigit;
        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber <10 || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber >1000)) {
            return false;
        }
        else {
            fnRightDigit = firstNumber % 10;
            snRightDigit = secondNumber % 10;
            tnRightDigit = thirdNumber % 10;
            return ((fnRightDigit==snRightDigit) || (fnRightDigit == tnRightDigit) || (snRightDigit == tnRightDigit));
        }
    }
    public static boolean isValid(int number){
        return (number >=10 && number <= 1000);
    }

    public static void main(String[] args) {
        boolean  result = hasSameLastDigit (41, 22, 71);// → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(result);
        result=hasSameLastDigit (23, 32, 42); //→ should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(result);
        result=hasSameLastDigit (9, 99, 999); //→ should return false since 9 is not within the range
        System.out.println(result+"\n");

        result=isValid(10);// → should return true since 10 is within the range of 10-1000
        System.out.println(result);
        result=isValid(468); //→ should return true since 468 is within the range of 10-1000
        System.out.println(result);
        result=isValid(1051); //→ should return false since 1051 is not within the range of 10-1000
        System.out.println(result);
    }
}
