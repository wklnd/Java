import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnotToKphGUI {

    public static void main(String[] args) {
        // Create and set up the frame
        JFrame frame = new JFrame("Knot to Km/h Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();

        // Create a text field
        JTextField knotTextField = new JTextField(10);

        // Create a button
        JButton convertButton = new JButton("Convert");

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");

        // Add components to the panel
        panel.add(new JLabel("Enter Speed in Knots: "));
        panel.add(knotTextField);
        panel.add(convertButton);
        panel.add(resultLabel);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double knots = Double.parseDouble(knotTextField.getText());
                    double kmph = knots * 1.852;
                    resultLabel.setText(knots + " knop är " +   + kmph + " km/h");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Set the content pane of the frame
        frame.setContentPane(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
