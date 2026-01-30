import javax.swing.*;
import java.awt.event.*;

public class GameWindow extends JFrame {
    Game game = new Game();

    public GameWindow() {
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) game.bird.fly();
            }
        });
        
        // Vòng lặp game dùng Timer
        new Timer(20, e -> {
            game.update();
            repaint();
        }).start();
    }

    public void paint(java.awt.Graphics g) {
        g.clearRect(0, 0, 500, 600);
        game.bird.draw(g);
        for (Pipe p : game.pipes) p.draw(g);
    }

    public static void main(String[] args) {
        new GameWindow().setVisible(true);
    }
}
