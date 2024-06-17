import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TunaRadioButtons extends JFrame {

    private JTextField tf; // tf is text font
    private Font pf;       // pf is plain text
    private Font bf;       // bf is bold font
    private Font itf;      // itf is italic font
    private Font bif;      // bif is bold & italic font
    private JRadioButton pb; // pb is Plain Button
    private JRadioButton bb; // bb is bold button
    private JRadioButton ib; // ib is italic button
    private JRadioButton bib; // bib is bold & italic button
    private ButtonGroup group; // helps to switch on button at a time

    public TunaRadioButtons() {
        super("THE TITLE");
        setLayout(new FlowLayout());

        tf = new JTextField("James is awesome and hot", 25);
        add(tf);

        pb = new JRadioButton("Plain", true);
        bb = new JRadioButton("Bold", false);
        ib = new JRadioButton("Italic", false);
        bib = new JRadioButton("Bold & Italic", false);

        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);

        // Wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }

    private class HandlerClass implements ItemListener {
        private Font font;

        // The font object gets variable font
        public HandlerClass(Font f) {
            font = f;
        }

        // Sets the font to the font object that was passed in
        @Override
        public void itemStateChanged(ItemEvent event) {
            tf.setFont(font);
        }
    }
}