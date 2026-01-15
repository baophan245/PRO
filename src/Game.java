
public class Game {
    private Bird bird;
    private ArrayList<Pipe> pipes;
    private int score;
    private boolean isGameOver;

    public Game() {
        bird = new Bird(50, 200);
        pipes = new ArrayList<>();
        score = 0;
        isGameOver = false;
    }

    public void update() {
        bird.applyGravity();
        for (Pipe pipe : pipes) {
            pipe.moveLeft();
            if (pipe.checkCollision(bird)) {
                isGameOver = true;
            }
        }
    }

    public void restart() {
        bird = new Bird(50, 200);
        pipes.clear();
        score = 0;
        isGameOver = false;
    }
}
