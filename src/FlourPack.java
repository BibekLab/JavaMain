public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigWeight = bigCount * 5;
//        int smallWeight = smallCount * 1;
//        int sum = bigWeight + smallWeight;
        //System.out.println("Reminder is: " + sum % goal);
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if ((bigWeight >= goal && bigWeight % goal == 0) || (bigWeight >= goal && goal % 5 <= smallCount)) {
//            System.out.println("Big Weight is: "+bigWeight);
//            System.out.println("Sum is: "+sum);
//            System.out.println("In First if Else");
            return true;
        } else if (smallCount >= goal) {
//            System.out.println("Big Weight is: "+bigWeight);
//            System.out.println("Sum is: "+sum);
//            System.out.println("In second if Else");
            return true;
        } else {
//            System.out.println("Big Weight is: "+bigWeight);
//            System.out.println("Sum is: "+sum);
//            System.out.println("In third Else");
            return ((bigWeight + smallCount) >= goal) && ((goal % bigWeight <= smallCount));

        }
    }

    public static void main(String[] args) {
        boolean result=canPack (1, 0, 4);//false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println(result+"\n");
//        result=canPack (1, 0, 5); // true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//        System.out.println(result);
//        result=canPack (0, 5, 4); // true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//        System.out.println(result);
//        result=canPack (2, 2, 11); // true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
//        System.out.println(result);
//        result=canPack (-3, 2, 12); // false
//        System.out.println(result);

        result=canPack (2, 1, 5); // true
        System.out.println(result + "\n");

        result=canPack (2, 2, 12); // true
        System.out.println(result + "\n");
    }
}
