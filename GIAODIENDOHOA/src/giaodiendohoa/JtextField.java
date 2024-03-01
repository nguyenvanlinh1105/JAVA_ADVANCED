/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodiendohoa;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class JtextField extends JFrame implements ActionListener{
    private JTextField textField1, textField2, textField3;
    private JPasswordField passwordField;
    public JtextField(){
        super("Testing JTextField and JPasswordField");
        Container container  = getContentPane();
        container.setLayout (new FlowLayout());
        textField1 = new JTextField(10);
        container.add(textField1);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
