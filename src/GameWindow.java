
public class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("Flappy Bird Java");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
