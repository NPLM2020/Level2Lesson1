package Competitors;

import Obstacles.Obstacle;
import Obstacles.Track;
import Obstacles.Wall;

public class Robot implements ICompetitor {

    private String name;
    private final int maxDistance = 10000;
    private final int maxHeight = 2;

    public String getName() {
        return name;
    }

    public int getMasDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s the robot ran %s meters.\n", name, maxDistance);
    }

    @Override
    public void jump() {
        System.out.printf("%s the robot jumped %s meters.\n", name, maxHeight);
    }

    @Override
    public boolean doAction(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            return jumpOver((Wall) obstacle);
        } else if (obstacle instanceof Track) {
            return runThrough((Track) obstacle);
        }
        return false;
    }

    private boolean runThrough(Track track) {
        if (track.getDistance() <= maxDistance) {
            System.out.printf("%s the robot ran a %s meters long track.\n", name, track.getDistance());
            return true;
        }
        System.out.printf("%s the robot couldn't run a %s meters long track.\n", name, track.getDistance());
        return false;
    }

    private boolean jumpOver(Wall wall) {
        if (wall.getHeight() <= maxHeight) {
            System.out.printf("%s the robot jumped over a %s meters height wall.\n", name, wall.getHeight());
            return true;
        }
        System.out.printf("%s the robot couldn't jump over a %s meters height wall.\n", name, wall.getHeight());
        return false;
    }
}
