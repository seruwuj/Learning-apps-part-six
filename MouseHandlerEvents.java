import javax.swing.JFrame;

public class MouseHandlerEvents {
    public static void main(String[] args) {
        
        TunaMouseHandler go = new TunaMouseHandler();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300,200);
        go.setVisible(true);
    }
    
}
