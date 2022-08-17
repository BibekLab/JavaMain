public class methodPractice {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("The Final score is " +  finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void main(String[] args) {
        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("The 1st Final Score is " +  finalScore);
        finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The 2nd Final Score is " + finalScore);
    }

}
