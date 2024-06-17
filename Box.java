
    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Box extends JFrame{
    private JComboBox<String> box;
    private JLabel picture;

    // Create arrays
    private static String[] filename = {"b.png", "x.png"};
    private Icon[] pics = {
        new ImageIcon(getClass().getResource(filename[0])),
        new ImageIcon(getClass().getResource(filename[1]))
    };

    // Constructor
    public Box(){
        super("THE TITLE");
        setLayout(new FlowLayout());

        box = new JComboBox<>(filename);

        box.addItemListener(
            new ItemListener() {
                public void itemStateChanged(ItemEvent event){
                    if(event.getStateChange() == ItemEvent.SELECTED)
                        picture.setIcon(pics[box.getSelectedIndex()]);
                }
            }
        );

        add(box);
        picture = new JLabel(pics[0]);
        add(picture);

        // Set default close operation and size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame in the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TunaComboBox();
            }
        });
    }
}