import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TunaFlowLayout extends JFrame {
    
    private JButton lb; // lb stands for left button
    private JButton cb; // cb stands for center button
    private JButton rb; // rb stands for right button
    private FlowLayout layout;
    private Container container;

    public TunaFlowLayout(){
        super("the title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // left button stuff here
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(container);
            }
        });

        // center button stuff here
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(container);
            }
        }
        );
    }

        // right button stuff here
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(container);
            }
          }
        );
    }



