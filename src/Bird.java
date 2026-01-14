package com.nhomxx.entities;

public class Bird {
    private int x, y;
    private int velocity;

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
        this.velocity = 0;
    }

    public void flyUp() {
        velocity = -15; // bay lên khi nhấn SPACE
    }

    public void applyGravity() {
        velocity += 2; // trọng lực kéo xuống
        y += velocity;
    }

    public int getY() { return y; }

    @Override
    public String toString() {
        return "Bird at (" + x + "," + y + ")";
    }
}
