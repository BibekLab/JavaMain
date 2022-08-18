public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber >= 13 && firstNumber <=19){
            return true;
        } else if (secondNumber >= 13 && secondNumber <=19){
            return true;
        } else return thirdNumber >= 13 && thirdNumber <= 19;
    }

    public static boolean isTeen(int firstNumber){
        return (firstNumber >= 13 && firstNumber <= 19);
    }

    public static void main(String[] args) {
       boolean value= hasTeen(9, 99, 19); // should return true since 19 is in range 13 - 19
        System.out.println(value);
        value=hasTeen(23, 15, 42);  //should return true since 15 is in range 13 - 19
        System.out.println(value);
        value=hasTeen(22, 23, 34); // should return false since numbers 22, 23, 34 are not in range 13-19
        System.out.println(value);
        value=isTeen(9);  //should return false since 9 is in not range 13 - 19
        System.out.println(value);
        value=isTeen(13);  //should return true since 13 is in range 13 - 19
        System.out.println(value);
    }
}
