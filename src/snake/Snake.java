package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Snake implements ActionListener {

    public JFrame jframe;
    public static Snake snake;
    public RenderPanel renderPanel;
    public Timer timer = new Timer(20, this);

    public ArrayList<Point> snakeParts = new ArrayList<Point>();

    public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;
    public int ticks = 0, direction = DOWN;
    Dimension dim;

    public Point head, cherry;

    public Snake() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe = new JFrame("Snake");
        jframe.setVisible(true);
        jframe.setSize(500, 500);
        //TODO Don't call fields of a class
        jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getWidth() - 2);
        jframe.add(renderPanel = new RenderPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        head = new Point(0,0);
        cherry = new Point(dim.width / SCALE, dim.height);
        timer.start();
    }

    public void updateSnake(){

    }

    public static void main(String[] args) {
        Snake snake = new Snake();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderPanel.repaint();
        ticks++;
        if (ticks % 10 == 0 && head != null){
            if (direction == UP){
                snakeParts.add(new Point(head.x, head.y - 1));
            }
            if (direction == DOWN){
                snakeParts.add(new Point(head.x, head.y + 1));
            }
            if (direction == LEFT){
                snakeParts.add(new Point(head.x - 1, head.y));
            }
            if (direction == RIGHT){
                snakeParts.add(new Point(head.x + 1, head.y));
            }
            if (cherry != null){
                if(head.x == cherry.x && head.y == cherry.y){
                    score ++;
                    cherry.setLocation(dim.width / SCALE, dim);
                }
            }
        }
    }
}
