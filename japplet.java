import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class japplet extends JApplet {
    private JLabel iconLabel;
    private JTextField textField;
    private JButton button;
    private JComboBox<String> comboBox;

    public void init() {
        // Create a content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // Create an icon
        ImageIcon icon = new ImageIcon("path/to/icon.png");
        iconLabel = new JLabel(icon);
        contentPane.add(iconLabel);

        // Create a label
        JLabel textLabel = new JLabel("Enter some text:");
        contentPane.add(textLabel);

        // Create a text field
        textField = new JTextField(20);
        contentPane.add(textField);

        // Create a button
        button = new JButton("Click me");
        button.addActionListener(new ButtonClickListener());
        contentPane.add(button);

        // Create a combo box
        String[] options = {"Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox<>(options);
        comboBox.addActionListener(new ComboBoxListener());
        contentPane.add(comboBox);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            JOptionPane.showMessageDialog(null, "You entered: " + text);
        }
    }

    private class ComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String selectedOption = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(null, "You selected: " + selectedOption);
        }
    }
} {
    
}
