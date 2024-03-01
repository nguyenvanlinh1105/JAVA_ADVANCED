/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class border extends JFrame{
    public border(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("border");
        
        BorderLayout bd= new BorderLayout(50,50);
        this.setLayout(bd);
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        this.add(btn1, BorderLayout.CENTER);
        this.add(btn2, BorderLayout.WEST);
        this.add(btn3, BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new border();
    }
}
