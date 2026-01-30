import java.awt.Color;
import java.awt.Graphics;

public class Pipe extends Movable {
    public Pipe(int x, int y, int h) { super(x, y, 50, h, -5); }

    @Override
    public void update() { x += velocity; } // Chạy sang trái

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height); // Vẽ ống màu xanh
    }
}
