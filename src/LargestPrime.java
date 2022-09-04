public class LargestPrime {
    public static int getLargestPrime(int number) {
        int copyNum = number;
        int i;
        if (number < 0 || number == 0 || number == 1) {
            return -1;
        } else {
            for (i = 2; i <= copyNum; i++) {
                if (copyNum%i == 0){
                    //System.out.println(copyNum);
                    copyNum /=  i;
                    //System.out.println(i);
                    i--;
                }
            }
            return i;
        }
    }

    public static void main(String[] args) {
        int result= getLargestPrime(15);
        System.out.println(result);

    }
}
