import java.util.ArrayList;
import java.util.List;

class Game {
    private String input;
    private List<Round> rounds = new ArrayList<Round>();
    private List<Ball> balls = new ArrayList<Ball>();

    Game(String input) {
        this.input = input;
        setRounds();
        setBalls();
    }

    int getScore() {
        int sum = 0, roundScore;
        int ballIndex;
        for (int i = 0; i < 10; i++) {
            Round round = rounds.get(i);
            roundScore = round.getScore();
            ballIndex = balls.indexOf(round.getLastBall());
            if (round.isStrike()) {
                roundScore += balls.get(ballIndex + 1).getScore();
                roundScore += balls.get(ballIndex + 2).getScore();
            } else if (round.isSpare()) {
                roundScore += balls.get(ballIndex + 1).getScore();
            }
            sum += roundScore;
        }
        return sum;
    }

    private void setRounds() {
        String[] eachRound = input.split("[|]+");
        for (String roundStatus : eachRound) {
            rounds.add(new Round(roundStatus));
        }
    }

    private void setBalls() {
        for (Round round : rounds) {
            balls.addAll(round.getBalls());
        }
    }
}
