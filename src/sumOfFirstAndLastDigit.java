public class sumOfFirstAndLastDigit {

    public static int  sumFirstAndLastDigit(int number){
        int firstDigit = 0, lastDigit = 0, sum=0;
        if (number < 0){
            return -1;
        } else if (number > 0 && number < 10) {
            return  number + number;
        } else {
            lastDigit = number % 10;
            while(number >= 10){
                firstDigit= number / 10;
                number =firstDigit;
            }
            sum = lastDigit + firstDigit;
            return sum;
        }

    }

    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(105);
        //System.out.println(result);

        result=sumFirstAndLastDigit(252); //→ should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(result);
        result=sumFirstAndLastDigit(257); //→ should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(result);
        result=sumFirstAndLastDigit(0); //→ should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(result);
        result=sumFirstAndLastDigit(5); //→ should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(result);
        result=sumFirstAndLastDigit(-10); //→ should return -1,
        System.out.println(result);
    }
}
