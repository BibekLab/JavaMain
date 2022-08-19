public class switchPractice {

    public static void main(String[] args) {
        char charValue = 'G';

//        switch (charValue) {
//            case 'A': System.out.println("Value was A");
//            break;
//            case 'B': System.out.println("The value was B");
//            break;
//            case 'C': System.out.println("The value was C");
//            break;
//            case 'D': System.out.println("The value was D");
//            break;
//            case 'E': System.out.println("The value was E");
//            break;
//            default: System.out.println("A, B, C, D or E are not found");
//            break;

        switch (charValue) {
            case 'A' -> System.out.println("Value was A");
            case 'B' -> System.out.println("The value was B");
            case 'C' -> System.out.println("The value was C");
            case 'D' -> System.out.println("The value was D");
            case 'E' -> System.out.println("The value was E");
            default -> System.out.println("A, B, C, D or E are not found");

        }

    }
}

