import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TunaAdapter extends JFrame{
    private String details;
    private JLabel statusbar;

    public TunaAdapter(){
        super("title");

        statusbar = new JLabel("This is default");
        add(statusbar,BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }
    private class Mouseclass extends MouseAdapter {
        public void mouseClicked (MouseEvent event){
            details =String.format("You clicked %d", event.getClickCount());

            if(event.isMetaDown())
              details += "with right mouse button";
            else if (event.isAltDown())
              details += "either center mouse button";
            else
              details += "with left mouse button";

              statusbar.setText(details);
        }
    
        
    }
    }
    

