/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

/**
 *
 * @author HP
 */
public class test extends JFrame implements MouseListener{
    private Button btnDemo;
    private JTextField jtext;
    public test(){
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        btnDemo= new Button("Mouse Event");
//        btnDemo.setBounds(0, 0, 50, 50);
        this.add(btnDemo, BorderLayout.NORTH);
//        jtext = new JTextField();
//        this.add(jtext);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        this.add(jtext);
        this.jtext.setText("Tôi là Linh Nguyễn");
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        test t2= new test();
    }
}
