import java.awt.Graphics;

public abstract class Movable extends GameObject {
    protected int velocity;

    public Movable(int x, int y, int w, int h, int v) {
        super(x, y, w, h);
        this.velocity = v;
    }
}
