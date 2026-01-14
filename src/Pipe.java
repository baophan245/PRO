import java.util.Random;

public class Pipe {
    private int x;
    private int gapY;
    private int gapHeight;
    private static final int WIDTH = 50;

    public Pipe(int startX, int gapHeight) {
        this.x = startX;
        this.gapHeight = gapHeight;
        this.gapY = new Random().nextInt(200) + 100;
    }

    public void moveLeft() {
        x -= 5;
    }

    public boolean checkCollision(Bird bird) {
        int birdY = bird.getY();
        return (birdY < gapY || birdY > gapY + gapHeight) && x < 100 && x + WIDTH > 50;
    }

    public int getX() { return x; }
}
