public class PerfectNumber {
     public static boolean isPerfectNumber(int number){
         int sum =number;
         if(number < 1){
             return false;
         }
         else {
             for (int i=1; i < number; i ++){
                 if (number % i == 0){
                     sum -= i;
                 }
             }
             return (sum == 0);
         }
     }

    public static void main(String[] args) {
        boolean result= isPerfectNumber(6); // true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(result);
        result=isPerfectNumber(28);//true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(result);
        result=isPerfectNumber(5); //false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(result);
        result=isPerfectNumber(-1); //false since the number is < 1
        System.out.println(result);
    }
}
