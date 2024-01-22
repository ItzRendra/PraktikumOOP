/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP2023;

/**
 *
 * @author Claude.ai
 */
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextDisplay {

    private JTextField textField;
    private JLabel label;
    
    public TextDisplay() {
        // Create the text field and label
        textField = new JTextField(10); 
        label = new JLabel("Text will display here");
        
        // Add a key listener to the text field
        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                label.setText(textField.getText()); //intine nomer 5 neng kene | bla.getText() >> njipuk nilai bla, bli.setText >> ngganti text
            }
        });
        
        // Create frame and add components
        JFrame frame = new JFrame("Display Text");
        frame.add(textField);
        frame.add(label);
        frame.setSize(250, 100);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TextDisplay();
    }
}
