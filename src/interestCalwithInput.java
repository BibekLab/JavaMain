
import java.util.Scanner;

public class interestCalwithInput {


    public double Interest(double starting_money, double final_money, float interest_rate ) {
        double total=0;
        float years = 0;
        System.out.println("Starting money is: " + starting_money);
        System.out.println("Final money is: " + final_money);
        System.out.println("InterestRate is: " + interest_rate);
        do {
            total = starting_money + (starting_money*interest_rate);
            starting_money = total;
            System.out.println(total);
            years++;
        } while (total <= final_money) ;


        return years;

    }


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter starting Money: ");
            double starting_money = input.nextDouble();
            System.out.println("Enter required Money: ");
            double final_money = input.nextDouble();
            System.out.println("Enter interest rate in decimal ");
            float interest_rate= input.nextFloat();
            interestCalwithInput numYear = new interestCalwithInput();
            System.out.println("Numbers of years required is " + numYear.Interest(starting_money,final_money, interest_rate ));
        }
    }

}
