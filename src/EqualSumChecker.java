public class EqualSumChecker {
    public static boolean hasEqualSum(int firstParameter, int secondParameter, int thirdParameter){
        return ((firstParameter+secondParameter) == thirdParameter);
    }

    public static void main(String[] args) {
        boolean value=hasEqualSum(1, 1, 1);  //should return false since 1 + 1 is not equal to 1
        System.out.println(value);
        value=hasEqualSum(1, 1, 2);  //should return true since 1 + 1 is equal to 2
        System.out.println(value);
        value=hasEqualSum(1, -1, 0);  //should return true since 1 + (-1) is 1 - 1 and is equal to 0
        System.out.println(value);
    }
}
