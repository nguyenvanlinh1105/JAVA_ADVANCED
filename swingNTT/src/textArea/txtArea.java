/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textArea;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class txtArea extends Frame implements ActionListener{
    TextArea txt1 , txt2;
    Button btnCopy;
    public txtArea(){
        txt1 = new TextArea("Sample", 5, 20);
        txt2 = new TextArea (5,20);
        btnCopy= new Button("Copy>>>>");
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        btnCopy.addActionListener(this);
        add(txt1);
        add(btnCopy);
        add(txt2);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        txt2.append(txt1.getText());
    }
    public static void main(String[] args) {
        txtArea txt = new txtArea();
        txt.setSize(500,400);
        txt.show();
    }
}
