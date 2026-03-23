public class Pipe extends GameObject {

    private int speed;

    public Pipe(int x, int y, int speed) {
        super(x, y);
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        this.setX(this.getX() - this.speed);
    }

    @Override
    public String toString() {
        return "Pipe - " + super.toString() + 
               " - Speed: " + this.speed;
    }
}
