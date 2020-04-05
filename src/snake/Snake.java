package snake;

import javax.swing.*;
import java.awt.*;

public class Snake {

    public JFrame jframe;

    public Snake() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("Snake");
        jframe.setVisible(true);
        jframe.setSize(500, 500);
        //TODO Don't call fields of a class
        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getWidth() - 2);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Snake snake = new Snake();
    }
}
