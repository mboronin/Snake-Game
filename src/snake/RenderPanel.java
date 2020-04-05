package snake;
import javax.swing.*;
import java.awt.*;


public class RenderPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,300,700);
        super.paintComponent(g);
    }
}
