public class Bird extends GameObject {

    private int velocity;

    public Bird(int x, int y, int velocity) {
        super(x, y);  
        this.velocity = velocity;
    }

    public int getVelocity() {
        return this.velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public void move() {
        this.setY(this.getY() - this.velocity);
    }

    @Override
    public String toString() {
        return "Bird - " + super.toString() + 
               " - Velocity: " + this.velocity;
    }
}
