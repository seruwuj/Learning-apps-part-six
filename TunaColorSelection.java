import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TunaColorSelection extends JFrame{

    private JList<String> colorList;
    private static String[] colornames = {"black", "Yellow", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.YELLOW, Color.RED, Color.WHITE}; 

    public TunaColorSelection(){
        super("THE TITLE");
        setLayout(new FlowLayout());

        colorList = new JList<>(colornames);
        colorList.setVisibleRowCount(4);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorList));

        colorList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
            }
        });
    }
}
