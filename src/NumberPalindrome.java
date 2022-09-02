import org.w3c.dom.ls.LSOutput;

public class NumberPalindrome {
     private static boolean isPalindrome(int number){
         int reminder,sum =0, comparator;
         comparator =number;
         while (number != 0) {
             reminder = number % 10;
             number =number/10;
             sum=(sum*10)+reminder;
             }
         return comparator == sum;

         }

    public static void main(String[] args) {
        int number = 115;
        boolean result = isPalindrome(number);
        //System.out.println(result); //false
        result=isPalindrome(-1221);// → should return true
        System.out.println(result);
        result=isPalindrome(707);// → should return true
        System.out.println(result);
        result=isPalindrome(11212);// → should return false because reverse is 21211
        System.out.println(result);
//        if (result){
//            System.out.println("It is a Palindrome number");
//        } else {
//            System.out.println("It is not a Palindrome number");
//        }

    }
     }

