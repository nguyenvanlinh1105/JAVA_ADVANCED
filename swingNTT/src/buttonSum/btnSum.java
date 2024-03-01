/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttonSum;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class btnSum extends JFrame implements ActionListener{
    Label labeln1 , labeln2 , labelsum, numsum;
    TextField numb1, numb2 ;
    Button btnSum , btnExit;
    public btnSum(){
        this.setSize(600,600);
        this.setTitle("Sum two number");
        this.setLayout(new GridLayout(4,1));
        labeln1= new Label("Enter first number");
        numb1 = new TextField();
        numb1.setBounds(50 , 80, 100,30);
        labeln2= new Label("Enter second number");
        numb2 = new TextField();
        numb2.setBounds(50 , 80, 100,30);
        labelsum= new Label("This SUM is");
        numsum = new Label("");
        
        btnSum = new Button("SUM");
        btnSum.setBounds(100, 150,50,30);
        btnSum.addActionListener(this);
        btnExit = new Button ("Exit");
        btnExit.addActionListener(this);
        btnExit.setBounds(200,250,50,30);
        Panel pn1 = new Panel();
        pn1.setLayout(new GridLayout(1, 2));
        Panel pn2 = new Panel();
        pn2.setLayout(new GridLayout(1, 2));
        Panel pn3 = new Panel();
        pn3.setLayout(new GridLayout(1, 2)); // Chia panel thành 1 hàng, 2 cột
        Panel pn4 = new Panel();
        pn4.setLayout(new GridLayout(1, 2));
        pn1.add(labeln1);
        pn1.add(numb1);
        pn2.add(labeln2);
        pn2.add(numb2);
        pn3.add(labelsum);
        pn3.add(numsum);
        pn4.add(btnSum);
        pn4.add(btnExit);
        this.add(pn1);
        this.add(pn2);
        this.add(pn3);
        this.add(pn4);
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing( WindowEvent e){
                System.exit(0);
            }
        });
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if(str.equals("SUM")){
            int firstNum =Integer.parseInt(this.numb1.getText());
            int secondNum =Integer.parseInt(this.numb2.getText());
            int result = firstNum + secondNum;
            this.numsum.setText(String.valueOf(result));
        }
        if(str.equals("Exit")){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        btnSum sum = new btnSum();
        sum.setBounds(10,10,400, 200);
    }
    
}
