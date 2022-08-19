public class forPractice {
    public static double InterestCal(double initialMoney, double interestRate) {
        return (initialMoney * (interestRate / 100));
    }

    public static void main(String[] args) {
        float initAmount = 10000;
        //double interestRate = 10;
//        for (double i = 2; i <= 8; i++) {
//            System.out.println("For " + initAmount + " amount with " + i + "% interest is " + String.format("%.2f",InterestCal(initAmount, i)));
//        }
        for (double i = 8; i >= 2; i--) {
            System.out.println("For " + initAmount + " amount with " + i + "% interest is " + String.format("%.2f",InterestCal(initAmount, i)));
        }
    }
}
