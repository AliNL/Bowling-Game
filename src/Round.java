import java.util.ArrayList;
import java.util.List;

class Round {
    private String status;
    private List<Ball> balls = new ArrayList<Ball>();

    Round(String status) {
        this.status = status;
        for (char ballStatus : status.toCharArray()) {
            this.balls.add(new Ball(ballStatus));
        }
        if (isSpare()) {
            balls.get(1).setScore(10 - balls.get(0).getScore());
        }
    }

    List<Ball> getBalls() {
        return balls;
    }

    boolean isStrike() {
        return status.equals("X");
    }

    boolean isSpare() {
        return status.endsWith("/");
    }

    int getScore() {
        int score = 0;
        for (Ball ball : balls) {
            score += ball.getScore();
        }
        return score;
    }

    Ball getLastBall() {
        int index = balls.size() - 1;
        return balls.get(index);
    }
}
