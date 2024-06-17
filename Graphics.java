import javax.swing.*;

public class Graphics {
    public static void main(String[] args) {
         
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TunaRectangle R = new TunaRectangle();
        f.add(R);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
