/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grid;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class grid extends JFrame{
    public grid(){
        this.setTitle("Grid");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        
        GridLayout gr = new GridLayout(3,1);
        this.setLayout(gr);
        Button btn = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        
        this.add(btn);
        this.add(btn2);
        this.add(btn3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new grid();
    }
}
