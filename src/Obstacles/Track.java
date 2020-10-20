package Obstacles;

public class Track extends Obstacle {
    private int distance;

    public int getDistance() {
        return distance;
    }

    public Track(int distance) {
        this.distance = Math.max(distance, 0);
    }
}
