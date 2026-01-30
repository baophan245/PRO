public class Bird extends GameObject {
    private int velocity;

    public Bird(int x, int y) {
        super(x, y); 
        this.velocity = 0;
    }

    public void flyUp() {
        velocity = -15;
    }

    @Override
    public void update() { 
        velocity += 2; 
        y += velocity;
    }

    public int getY() { return y; }

    @Override
    public String toString() {
        return "Bird at (" + x + ", " + y + ")";
    }
}
