public class SharedDigit {

    public static boolean hasSharedDigit(int firstNUmber, int secondNumber){
        int fnFirstDigit, fnSecondDigit, snFirstDigit, snSecondDigit;
        if ( (firstNUmber < 10 || firstNUmber >99) || (secondNumber <10 || secondNumber >99) ){
            return false;
        }
        else {
                fnSecondDigit = firstNUmber % 10;
                fnFirstDigit = firstNUmber /10;
                snSecondDigit = secondNumber %10;
                snFirstDigit = secondNumber /10;
                return  ((fnFirstDigit == snSecondDigit || fnFirstDigit == snFirstDigit) || (fnSecondDigit==snFirstDigit || fnSecondDigit == snSecondDigit));
            }
        }


    public static void main(String[] args) {
        boolean result= hasSharedDigit(12, 23);// → should return true since the digit 2 appears in both
        System.out.println(result);
        result= hasSharedDigit(9, 99);// → should return false since 9 is not within the range of 10-99
        System.out.println(result);
        result= hasSharedDigit(15, 55); //→ should return true since the digit 5 appears in both
        System.out.println(result);
    }

    }


