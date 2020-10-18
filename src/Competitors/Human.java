package Competitors;

import Obstacles.Track;
import Obstacles.Wall;

public class Human implements ICompetitor {

    private String name;
    private final int maxDistance = 42000;
    private final float maxHeight = 1.5f;

    public String getName() {
        return name;
    }

    public int getMasDistance() {
        return maxDistance;
    }

    public float getMaxHeight() {
        return maxHeight;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s the human ran %s meters.\n", name, maxDistance);
    }

    @Override
    public void jump() {
        System.out.printf("%s the human jumped %s meters.\n", name, maxHeight);
    }

    @Override
    public boolean runThrough(Track track) {
        if (track.getDistance() <= maxDistance) {
            System.out.printf("%s the human ran a %s meters long track.\n", name, track.getDistance());
            return true;
        }
        System.out.printf("%s the human couldn't run a %s meters long track.\n", name, track.getDistance());
        return false;
    }

    @Override
    public boolean jumpOver(Wall wall) {
        if (wall.getHeight() <= maxHeight) {
            System.out.printf("%s the human jumped over a %s meters height wall.\n", name, wall.getHeight());
            return true;
        }
        System.out.printf("%s the human couldn't jump over a %s meters height wall.\n", name, wall.getHeight());
        return false;
    }
}
