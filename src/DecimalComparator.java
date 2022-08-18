public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){
        int x= (int) (firstParameter * 1000) ;
        int y= (int) (secondParameter * 1000) ;
        System.out.println(x);
        System.out.println(y);
        return ( x == y );
    }

    public static void main(String[] args) {
        boolean value= areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(value);
        value= areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(value);
        value= areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(value);
        value= areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(value);

    }

}
