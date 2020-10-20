package Competitors;

import Obstacles.Obstacle;

public interface ICompetitor {

    void run();

    void jump();

    boolean doAction(Obstacle obstacle);

}
