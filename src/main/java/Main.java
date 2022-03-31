import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,300);

/*
        JPanel panel = new JPanel(new MigLayout());
        JLabel firstNameLabel = new JLabel("First Name");
        TextField firstNameTextField = new TextField();
        firstNameTextField.setSize(100,50);
        JLabel lastNameLabel = new JLabel("Last Name");
        TextField lastNameTextField = new TextField();
        JLabel addressLabel = new JLabel("Address");
        TextField addressTextField = new TextField();

        panel.add(firstNameLabel);
        panel.add(firstNameTextField);
        panel.add(lastNameLabel,       "gap unrelated");
        panel.add(lastNameTextField,   "wrap");
        panel.add(addressLabel);
        panel.add(addressTextField,    "span, grow");
*/
        JPanel panel = new JPanel(new MigLayout());
        JLabel comp1 = new JLabel("comp1");
        JLabel comp2 = new JLabel("comp2");
        JLabel comp3 = new JLabel("comp3");
        JLabel comp4 = new JLabel("comp4");
        JLabel comp5 = new JLabel("comp5");
        JLabel comp6 = new JLabel("comp6");
        JLabel comp7 = new JLabel("comp7");

/*        panel.add(comp1);
        panel.add(comp2);
        panel.add(comp3, "wrap"); // переводим на следующую строку
        panel.add(comp4, "wrap");*/

        panel.add(comp1);
        panel.add(comp2, "span 2 2"); // The component will span 2x2 cells.
        panel.add(comp3, "wrap"); // Wrap to next row
        panel.add(comp4);
        panel.add(comp5, "wrap"); // Note that it "jumps over" the occupied cells.
        panel.add(comp6, "split 2");
        panel.add(comp7);


        frame.add(panel);
        frame.setVisible(true);
    }
}
