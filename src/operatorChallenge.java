public class operatorChallenge {

    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double total = (firstVariable + secondVariable) * 100d;
        System.out.println("Total is " + total);
        double remainder= total % 40;
        boolean x = remainder == 0 ? true : false;
        System.out.println("is no remainder available " + x);
        if(!x) {
            System.out.println("Got some remainder");
        }

    }

}
