public class loopChallenge {

    public static boolean isEvenNumber(int number){
        return (number %2 == 0);
    }

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count =0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("NUmber is " + number);
            count++;
            if (count == 5){
                System.out.println("\nFound 5 numbers, exiting the loop");
                break;
            }

        }


    }
}
