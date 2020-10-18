package Competitors;

import Obstacles.Track;
import Obstacles.Wall;

public interface ICompetitor {

    void run();

    void jump();

    boolean runThrough(Track track);

    boolean jumpOver(Wall wall);
}
