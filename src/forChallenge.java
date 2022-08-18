public class forChallenge {

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        else {
            for(int i =2; i <= Math.sqrt(n); i++){
                System.out.println(i);
                //System.out.println(n);
                if(n % i == 0){
                    return false;
                }

            }
        }
        return true;
    }

//    public static void primeCount(int n, int m){
//
//            }



    public static void main(String[] args) {
        int count = 0;
        int n = 5;
        int m = 15;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a Prime Number");
                count++;
                if (count == 3) {
                    System.out.println("Exiting for Loop");
                    break;
                }
                //primeCount(2,10);
                //isPrime(15);
            }
        }
    }
}
