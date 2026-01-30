import java.awt.Color;
import java.awt.Graphics;

public class Bird extends Movable {
    public Bird(int x, int y) { super(x, y, 30, 30, 0); }

    public void fly() { velocity = -15; } // Nhảy lên

    @Override
    public void update() {
        velocity += 1; // Trọng lực
        y += velocity;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height); // Vẽ con chim hình tròn màu đỏ
    }
}
