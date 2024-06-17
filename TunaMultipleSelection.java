import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TunaMultipleSelection {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] foods ={"Cakes","Sumbusas","Cassava","Yams","Irish"};

    public TunaMultipleSelection(){
        super("TITLE");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist = setVisibleRowCount(3); //how many items we need to display out of the five items in the food array
        leftlist = setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Move -->");
        movebutton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    rightlist.setListData(leftlist.getSelectedValues());
                }
            }
        );
        add(movebutton);
        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightli.setSelectionMode(List.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
    
}
