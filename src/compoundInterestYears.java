public class compoundInterestYears {


    public int Interest() {
        int starting_amount =100;
        int final_amount =200;
        double total;
        int years = 0;
        do {
            total = starting_amount + (starting_amount*0.10);
            starting_amount =(int) total;
            System.out.println(total);
            years++;
        } while (total <= final_amount) ;
        return years;
    }

    public static void main(String[] args) {
        compoundInterestYears numYear = new compoundInterestYears();
        System.out.println("Numbers of years required is " + numYear.Interest());
    }

}
