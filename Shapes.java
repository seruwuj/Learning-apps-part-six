import javax.swing.*;
import java.awt.*;

public class Shapes {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TunaShapes s = new TunaShapes();
        s.setBackground(Color.WHITE);
        f.add(s);
        f.setSize(500,270);
        f.setVisible(true);
    }
    
}
