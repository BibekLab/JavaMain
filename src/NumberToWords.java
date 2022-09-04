public class NumberToWords {

    public static int reverse(int number) {
        int reversed = 0, digit;
        if (number == 0) {
            return 0;
        } else {
            while (number != 0) {
                digit = number % 10;
                reversed = (reversed * 10) + digit;
                number = number / 10;
            }
            return reversed;
        }
    }

    public static void numberToWords(int number) {
        int digit;
        int digitCount, reverseDigitCount;
        digitCount = getDigitCount(number);
        reverseDigitCount = getDigitCount(reverse(number));
        //System.out.println(digitCount);
        //System.out.println(reverseDigitCount);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            if (digitCount == reverseDigitCount) {
                number = reverse(number);
                while (number > 0) {
                    digit = (number) % 10;
                    switch (digit) {
                        case (1):
                            System.out.print("One"+" ");
                            break;
                        case (2):
                            System.out.print("Two"+" ");
                            break;
                        case (3):
                            System.out.print("Three"+" ");
                            break;
                        case (4):
                            System.out.print("Four"+" ");
                            break;
                        case (5):
                            System.out.print("Five"+" ");
                            break;
                        case (6):
                            System.out.print("Six"+" ");
                            break;
                        case (7):
                            System.out.print("Seven"+" ");
                            break;
                        case (8):
                            System.out.print("Eight"+" ");
                            break;
                        case (9):
                            System.out.print("Nine"+" ");
                            break;
                        default:
                            System.out.print("Zero"+" ");
                    } //switch ending
                    number /= 10;
                } //while ending
            } else if (digitCount > reverseDigitCount) {
                int reversedNumber=reverse(number);
                while (reversedNumber > 0) {
                    digit = (reversedNumber) % 10;
                    switch (digit) {
                        case (1):
                            System.out.print("One"+" ");
                            break;
                        case (2):
                            System.out.print("Two"+" ");
                            break;
                        case (3):
                            System.out.print("Three"+" ");
                            break;
                        case (4):
                            System.out.print("Four"+" ");
                            break;
                        case (5):
                            System.out.print("Five"+" ");
                            break;
                        case (6):
                            System.out.print("Six"+" ");
                            break;
                        case (7):
                            System.out.print("Seven"+" ");
                            break;
                        case (8):
                            System.out.print("Eight"+" ");
                            break;
                        case (9):
                            System.out.print("Nine"+" ");
                            break;
                        default:
                            System.out.print("Zero"+" ");
                    } //switch ending
                    reversedNumber /= 10;
                } //while ending
                for (int i = 1; i <= (digitCount-reverseDigitCount); i++) {
                System.out.print("Zero"+" ");
                }
            }
        }//else ending
    }


        public static int getDigitCount ( int number){
            int count = 0;
            if (number < 0) {
                return -1;
            } else if (number == 0) {
                return 1;
            } else {
                while (number > 0) {
                    number /= 10;
                    count++;
                }
                return count;
            }
        }

        public static void main (String[]args){
//            numberToWords(1); //should print "One Two Three".
//            numberToWords(1010);// should print "One Zero One Zero".
            numberToWords(1000); //should print "One Zero Zero Zero".
//            numberToWords(-12); //should print "Invalid Value" since the parameter is negative.
        }
    }
