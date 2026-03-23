import java.util.ArrayList;

public class GameManager {
    private ArrayList<GameObject> objects;
    private Score gameScore;

    public GameManager() {
        objects = new ArrayList<>();
        gameScore = new Score();
    }

    public void addObject(GameObject obj) {
        objects.add(obj);
    }

    public void updateGame() {
        System.out.println("--- Updating Game State ---");
        for (GameObject obj : objects) {
            obj.move(); 
            System.out.println(obj); 
        }
        gameScore.increment(); 
        System.out.println(gameScore);
    }
}
