import java.util.Random;

public class Pipe extends GameObject {
    private int gapHeight;
    private static final int WIDTH = 50;

    public Pipe(int startX, int gapHeight) {
        
        super(startX, new Random().nextInt(200) + 100);
        this.gapHeight = gapHeight;
    }

    @Override
    public void update() { 
        x -= 5; 
    }

    public boolean checkCollision(Bird bird) {
        int birdY = bird.getY();
     
        return (birdY < y || birdY > y + gapHeight) && x < 100 && x + WIDTH > 50;
    }

    public int getX() { return x; }
}
