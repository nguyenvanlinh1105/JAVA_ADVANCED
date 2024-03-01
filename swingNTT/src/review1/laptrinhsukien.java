/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class laptrinhsukien extends Frame{
    Button button1 = new Button ("RED");
    Button button2 = new Button ("GREEN");
    Button button3 = new Button ("BLUE");
    Label status ;
    public laptrinhsukien(){
        this.setTitle("My color");
        this.setLocationRelativeTo(null);
        this.setSize(600,500);
        this.setLayout(new FlowLayout());
        this.add(button1);
        this.add(button2);
        this.add(button3);
        status = new Label();
        this.status.setText("Press any button, please!");
        this.add(status);
        button1.addActionListener(new MyListener(status, this));
        button2.addActionListener(new MyListener(status, this));
        button3.addActionListener(new MyListener(status, this));

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new laptrinhsukien();
    }
}
