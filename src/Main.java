import Competitors.Cat;
import Competitors.Human;
import Competitors.ICompetitor;
import Competitors.Robot;
import Obstacles.Obstacle;
import Obstacles.Track;
import Obstacles.Wall;

public class Main {

    public static void main(String[] args) {

        ICompetitor[] competitors = new ICompetitor[] {
                new Cat("Oliver"),
                new Human("Jhon Doe"),
                new Robot("R2D2")
        };

        Obstacle[] obstacleCourse = new Obstacle[] {
                new Track(100),
                new Wall(1),
                new Track(55),
                new Wall(1.5f),
                new Track(1000),
                new Track(14000),
                new Wall(2)
        };

        for (ICompetitor competitor:
             competitors) {
            for (Obstacle obstacle:
                 obstacleCourse) {
                if (!competitor.doAction(obstacle)) break;
            }
            System.out.println();
        }

    }
}
