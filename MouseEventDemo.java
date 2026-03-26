import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {

    int mx = 0, my = 0;
    String msg = "";

    public MouseEventDemo() {
        setTitle("Mouse Events Demo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Handling Mouse Events", 50, 50);
        g.drawString(msg, mx, my);
    }

    public void mouseClicked(MouseEvent e) {
        mx = 50; my = 100;
        msg = "Mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        mx = 60; my = 120;
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mx = 60; my = 120;
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mx = 70; my = 140;
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mx = 70; my = 140;
        msg = "Mouse Exited";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mx = e.getX(); my = e.getY();
        msg = "Mouse Dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        mx = e.getX(); my = e.getY();
        msg = "Mouse Moving";
        repaint();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
