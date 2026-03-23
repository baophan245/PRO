import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<GameObject> objectList = new ArrayList<>();

        objectList.add(new Bird(100, 200, 5));
        objectList.add(new Pipe(300, 150, 10));
        objectList.add(new Bird(120, 220, 8));
        objectList.add(new Pipe(400, 180, 6));

        System.out.println("=== Before Move ===");
        for (GameObject object : objectList) {
            System.out.println(object);
        }

        System.out.println("=== After Move ===");
        for (GameObject object : objectList) {

            object.move();

            System.out.println(object);
        }
    }
}
