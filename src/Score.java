public class Score {
    private int currentScore;
    private static int highScore = 0;

    public Score() {
        this.currentScore = 0;
    }

    public void increment() {
        this.currentScore++;
        if (this.currentScore > highScore) {
            highScore = this.currentScore;
        }
    }

    @Override
    public String toString() {
        return "Current Score: " + currentScore + " | High Score: " + highScore;
    }
}
