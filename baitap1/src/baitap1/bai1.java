/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class bai1 extends JFrame {
    JPanel panel = new JPanel();
    private Label lbelMess;
    private Button btnVN, btnEL; 
    public  bai1() {
        this.setTitle("My intro");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        Font font = new Font("Time new Romans",Font.BOLD, 20);
        // set layout
        FlowLayout FlowLayout2 = new FlowLayout(FlowLayout.CENTER,100, 200);

        this.setLayout(FlowLayout2);
        JButton jButton1= new JButton("1");
    
        lbelMess= new Label();
        this.lbelMess.setPreferredSize(new Dimension(100,10));
        this.setFont(font);
        btnVN  = new Button("Việt Nam");
        btnVN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lbelMess.setText("XIn chao Viet Nam");
            }
        });
        btnEL  = new Button("Inh lịt");
        this.add(btnEL);
        btnEL.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lbelMess.setText("XIn chao English");
            }
            
            
        });
        this.panel.setLayout(new BorderLayout());
        this.panel.add(btnVN, BorderLayout.NORTH);
        this.panel.add(btnEL,BorderLayout.CENTER);
        this.add(panel);
        this.add(lbelMess);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        bai1 intro = new bai1();
//        new intro();
    }

    void actionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

