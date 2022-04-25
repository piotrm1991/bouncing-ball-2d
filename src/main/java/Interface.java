import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface() {
        this.setSize(840,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setTitle("Bouncing Ball");
        this.add(new Core());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Interface();
    }
}
