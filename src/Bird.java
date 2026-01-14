public class Bird {
    private int x, y;
    private int velocity;

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
        this.velocity = 0;
    }

    public void flyUp() {
        velocity = -15;
    }

    public void applyGravity() {
        velocity += 2;
        y += velocity;
    }

    public int getY() { return y; }

    @Override
    public String toString() {
        return "Bird at (" + x + "," + y + ")";
    }
}
