public class positiveNegativeZero {

    public static void checkNumber(int number){
        System.out.println( (number > 0)? "Positive": (number < 0)? "Negative": "zero"  );

    }
    public static void main(String[] args) {
        checkNumber(15);
        checkNumber(-50);
        checkNumber(0);
    }
}
