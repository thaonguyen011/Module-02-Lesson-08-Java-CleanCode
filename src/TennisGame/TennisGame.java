package TennisGame;

public class TennisGame {
    private static String getScoreDraw(int playerScore) {
        return switch (playerScore) {
            case 0 -> "Love-all";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getScoreWin(int player1Score, int player2Score) {
        int minusScore = player1Score - player2Score;
        String score;

        if (minusScore == 1) score = "Advantage player1";
        else if (minusScore == -1) score = "Advantage player2";
        else if (minusScore >= 2) score = "Win for player1";
        else score = "Win for player2";

        return score;
    }

    private static String getScorePlayer (int playerScore) {
        return switch (playerScore) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "";
        };
    }


    public static String getScore(int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        if (player1Score == player2Score) score = new StringBuilder(getScoreDraw(player1Score));
        else if (player1Score >= 4 || player2Score >= 4) score = new StringBuilder(getScoreWin(player1Score, player2Score));
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) score = new StringBuilder(getScorePlayer(player1Score));
                else score.append(" - ").append(getScorePlayer(player2Score));
            }
        }
        return score.toString();
    }
}
