package Obstacles;

public class Wall extends Obstacle {
    private float height;

    public float getHeight() {
        return height;
    }

    public Wall(float height) {
        this.height = Math.max(height, 0);
    }
}
