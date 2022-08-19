public class Sum3and5Challenge {

    public static void main(String[] args) {
        int sum =0;
        int count=0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0){
                if (i % 5 == 0){
                   sum += i;
                   System.out.println("\nThe number divided by 3 & 5 is: "+i);
                   System.out.println("Total sum is: " + sum);
                   count ++;
                   if (count == 5){
                       break;
                }
            }

            }
        }
    }
}
