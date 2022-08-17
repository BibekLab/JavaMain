public class methodChallenge {

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println("Player " + playerName + " managed to get no " +
                playerPosition + " position on the leaderboard");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        }
        else if(playerScore >= 500 ) {
            return 2;
        }
        else if(playerScore >= 100 ) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("ABC", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("BCD", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("KLY", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("XYZ", highScorePosition);
    }

}
