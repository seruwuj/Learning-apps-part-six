import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class TunaBackgroundColor extends JFrame{

    private JList list;
    private static String [] colornames ={"black","blue","red","white"};
    private static Color[] colors= {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};//colors which the computer understands
    
    public TunaBackgroundColor(){
        super("title");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(List));

    }
    
}
