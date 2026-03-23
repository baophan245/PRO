public abstract class GameObject {

    private int x;
    private int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   
    public abstract void move();

    @Override
    public String toString() {
        return "Position: " + this.x + ", " + this.y;
    }
}
