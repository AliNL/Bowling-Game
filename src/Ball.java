import static java.lang.Character.isDigit;

class Ball {
    private int score = 0;

    Ball(char status) {
        if (isDigit(status)) {
            setScore((int) status - '0');
        } else if (status == 'X') {
            setScore(10);
        }
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }
}
