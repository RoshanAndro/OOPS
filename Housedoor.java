import java.awt.*;
import java.awt.event.*;

public class Housedoor extends Frame implements MouseListener, MouseMotionListener {

    Color br = new Color(0, 0, 255);

    public Housedoor() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
        setSize(new Dimension(500, 500)); 
        setTitle("Housedoor");
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        br = new Color(255, 0, 0);
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150); 

        
        g.setColor(Color.RED);
        int[] xPoints = {100, 200, 300}; 
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        
        g.setColor(br);
        g.fillRect(180, 280, 40, 70); 

        
        g.setColor(Color.WHITE);
        g.fillRect(120, 230, 50, 40);  

        g.setColor(Color.WHITE);
        g.fillRect(230, 230, 50, 40);
    }

    public static void main(String[] args) {
        new Housedoor();
    }

    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
