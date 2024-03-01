/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_laptrinhsukien;

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
    Label status ; 
    Button  button1 = new Button("RED");
    Button button2 = new Button("Green");
    Button button3 = new Button("Blue");
    public laptrinhsukien(){
        this.setTitle("My color");
        this.setLayout(new FlowLayout());
        this.add(button1);
        this.add(button2);
        this.add(button3);
        status = new Label();
        status.setText("Press any button, please!");
        this.add(status);
        button1.addActionListener(new MyListener(status, this));  
        button2.addActionListener(new MyListener(status, this));
        button3.addActionListener(new MyListener(status, this));
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        laptrinhsukien ltsk= new laptrinhsukien();
        ltsk.resize(300,300);
        ltsk.show();
        
    }
}
