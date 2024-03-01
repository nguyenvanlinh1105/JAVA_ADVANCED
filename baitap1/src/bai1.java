
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class bai1 extends JFrame{
    private Button btnVN ;
    private Button btnEL ;
    private Label lbelMess;
    public bai1(){
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Xin chao");
        
        this.btnVN = new Button("Việt Nam");
        this.btnEL = new Button("English");
        this.lbelMess= new Label();
        this.lbelMess.setPreferredSize(new Dimension(200,10));
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,200));
        this.add(btnVN);
        this.add(btnEL);
        this.add(lbelMess);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        btnVN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lbelMess.setText("XIN CHÀO VIỆT NAM");
            }
            
        });
         btnEL.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lbelMess.setText("XIN CHÀO ENGLAND");
            }
            
        });
    }
    public static void main(String[] args) {
        new bai1();
    }
}
