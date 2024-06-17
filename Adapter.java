import javax.swing.JFrame;

public class Adapter {
    public static void main(String[] args) {
        TunaAdapter go = new TunaAdapter();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300,200);
        go.setVisible(true);
    }
    
}

