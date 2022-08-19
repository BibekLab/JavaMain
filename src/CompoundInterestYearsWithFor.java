public class CompoundInterestYearsWithFor {
     public static int yearCal(double start, double end, double interest){
         double sum;
         int count =0;
         if (start > 0 && end > 0 && end >= start){
             for (double i = start; i <= end ; i++){
                 sum = i + (i*(interest/100));
                 i=sum;
                 count++;
             }
         } else return -1;
         return count;
     }

    public static void main(String[] args) {
        int years = yearCal(100,200,10);
        System.out.println(years);
    }

}
