public class sumDigits {

    public static int sumOfDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                int reminder = number % 10;
                sum += reminder;
                number = number / 10;
                //System.out.println(sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int data = 35;
        int result = sumOfDigits(data);
        if (result == -1) {
            System.out.println(data);
        } else {
            System.out.println(result);
        }
    }

}

