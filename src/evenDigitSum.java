public class evenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0,digit = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                digit = number % 10;
                if ( digit % 2 == 0){
                    sum += digit;
                }
                number = number /10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int result=getEvenDigitSum(123456789);// → should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(result);
        result=getEvenDigitSum(252); //→ should return 4 since 2 + 2 = 4
        System.out.println(result);
        result=getEvenDigitSum(-22); //→ should return -1 since the number is negative
        System.out.println(result);
        result=getEvenDigitSum(2000); //→ should return 2
        System.out.println(result);
    }
}
