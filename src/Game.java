import java.util.ArrayList;

public class Game {
    public Bird bird = new Bird(50, 250);
    public ArrayList<Pipe> pipes = new ArrayList<>();
    public boolean over = false;

    public Game() {
        pipes.add(new Pipe(400, 0, 150)); // Ống trên
        pipes.add(new Pipe(400, 300, 300)); // Ống dưới
    }

    public void update() {
        if (over) return;
        bird.update();
        for (Pipe p : pipes) p.update();
        if (bird.y > 600 || bird.y < 0) over = true; // Rơi khỏi màn hình là thua
    }
}
