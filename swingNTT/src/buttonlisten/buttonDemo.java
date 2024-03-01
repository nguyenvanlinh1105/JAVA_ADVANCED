/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttonlisten;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class buttonDemo extends Frame implements ActionListener{
    Label label = new Label("Pressed to button pls!");
    Button btnYes, btnNo, btnMaybe;
    String message="";
    public buttonDemo(String msg){
        this.setSize(600, 500);
        this.setTitle(msg);
        this.setLayout(new FlowLayout());
        btnYes = new Button("YES");
        btnNo = new Button("NO");
        btnMaybe = new Button("MAY BE");
        add (btnYes);
        add(btnNo);
        add(btnMaybe);
        add(label);
        btnYes.addActionListener(this);
        btnNo.addActionListener(this);
        btnMaybe.addActionListener(this);
        
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String str  = e.getActionCommand();
    if(str.equals("YES")){
        this.label.setText("You pressed YES button");
    }
    if(str.equals("NO")){
        this.label.setText("You pressed NO button");
    }
    if(str.equals("MAY BE")){
        this.label.setText("You pressed MAY BE button");
    }
}

    public static void main(String[] args) {
        buttonDemo btnDm = new buttonDemo("Linh nguyen");
        btnDm.show();
    }
    
}
