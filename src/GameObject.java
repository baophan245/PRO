import java.awt.Graphics;

public abstract class GameObject {
    protected int x, y, width, height;

    public GameObject(int x, int y, int w, int h) {
        this.x = x; this.y = y; this.width = w; this.height = h;
    }

    public abstract void update();
    public abstract void draw(Graphics g);
}
