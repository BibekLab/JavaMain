public class interestYears {


    public double Interest() {
        int starting_money =100;
        int final_money =200;
        double total=0;
        float years = 0;
        do {
            total = starting_money + (starting_money*0.10);
            starting_money =(int) total;
            System.out.println(total);
            years++;
        } while (total <= final_money) ;
        return years;
    }

    public static void main(String[] args) {
        interestYears numYear = new interestYears();
        System.out.println("Numbers of years required is " + numYear.Interest());
    }

}
