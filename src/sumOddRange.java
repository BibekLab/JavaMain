public class sumOddRange {
    public static boolean isOdd(int number){
        if (number > 0){
            return (number % 2 != 0);
        } else return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > 0 && end > 0 && end >= start ) {
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        sum = sum + i;
                        //System.out.println(i);
                    }
                }
            } else return -1;
        return sum;
    }

    public static void main(String[] args) {
        int value= sumOdd(100,100);//0
        System.out.println("Sum of odds in the given range is: " + value);
        value= sumOdd(13,13); //13
        System.out.println("\nSum of odds in the given range is: " + value);
        value=sumOdd(1, 100); //→ should return 2500
        System.out.println("\nSum of odds in the given range is: " + value);
        value=sumOdd(-1, 100); //→ should return -1
        System.out.println("\nSum of odds in the given range is: " + value);
        value=sumOdd(100, -100); //→ should return -1
        System.out.println("\nSum of odds in the given range is: " + value);
        value=sumOdd(100, 1000); //→ should return 247500
        System.out.println("\nSum of odds in the given range is: " + value);
        value=sumOdd(10, 5); //→ should return 247500
        System.out.println("\nSum of odds in the given range is: " + value);
    }
}
