/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class layout extends JFrame{
    public layout(){
        this.setTitle("Layout");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        
        FlowLayout bl= new FlowLayout(FlowLayout.CENTER, 10, 10);
        FlowLayout bl2= new FlowLayout(FlowLayout.CENTER);
        FlowLayout bl3 = new FlowLayout();
        this.setLayout(bl);
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new layout();
    }
}
