import java.awt.*;
import java.awt.event.*;

public class eventLister extends Frame implements MouseListener, KeyListener {
    private Label label;

    public eventLister() {
        super("Event Handler Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new Label("No events yet");
        add(label);

        addMouseListener(this);
        addKeyListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new eventLister();
    }
}