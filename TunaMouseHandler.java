import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TunaMouseHandler extends JFrame {
    private JPanel mousepanel; // This is the empty space we shall use to test mouse events
    private JLabel statusbar; // This is the bottom bar which will display the mouse events

    public TunaMouseHandler() {
        super("THE TITLE");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event) {
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusbar.setText("You pressed down the mouse");
        }

        public void mouseReleased(MouseEvent event) {
            statusbar.setText("You released the mouse");
        }

        public void mouseEntered(MouseEvent event) {
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.RED);
        }

        public void mouseExited(MouseEvent event) {
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }

        // these are mouse motion events
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("You are dragging the mouse");
        }

        public void mouseMoved(MouseEvent event) {
            statusbar.setText("You moved the mouse");
        }
    }
}