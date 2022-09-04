public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = 1;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
    }

    public static void main(String[] args) {
        int result = getGreatestCommonDivisor(25, 15); //should return 5 since both can be divided by 5 without a remainder
        System.out.println(result);
        result = getGreatestCommonDivisor(12, 30); //should return 6 since both can be divided by 6 without a remainder
        System.out.println(result);
        result = getGreatestCommonDivisor(9, 18); //should return -1 since the first parameter is < 10
        System.out.println(result);
        result = getGreatestCommonDivisor(81, 153); //should return 9 since both can be divided by 9
        System.out.println(result);
    }
}


