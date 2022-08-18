public class overloadingChallenge {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 ) && (inches <= 12)){
            return ((feet * 12) * 2.54) + (inches * 2.54);
        }
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            return calcFeetAndInchesToCentimeters(inches /12, inches % 12 );
        }
            return -1;
    }

    public static void main(String[] args) {
        double feet =10;
        double inches = 15;
        double centimeter = calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeter < 0){
            System.out.println("Invalid Parameters");
        }else {
        System.out.println(feet + " feet and " + inches + " inches in centimeter is " + centimeter);}
        inches = 50;
        centimeter = calcFeetAndInchesToCentimeters(inches);
        if (centimeter < 0){
            System.out.println("Invalid Parameters");
        }else {
            System.out.println(inches + " inches in centimeter is " + centimeter);
        }
    }


}
