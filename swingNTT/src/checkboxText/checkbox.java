/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkboxText;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class checkbox extends JFrame implements  ItemListener{
    TextArea txtArea = new TextArea(5,80);
    Checkbox checkBox1 = new Checkbox("The First");
    Checkbox checkBox2 = new Checkbox("The Second");
    Checkbox checkBox3 = new Checkbox("Reset Checkbox");
    public checkbox(){
        this.setTitle("My check Demo");
        this.setLayout(new BorderLayout(10,10));
        this.add(txtArea, BorderLayout.CENTER);
        Panel panel= new Panel ();
        panel.setLayout(new FlowLayout());
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        this.add(panel, BorderLayout.SOUTH);
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
        
        this.setVisible(true);
        
    }
    


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            String str = (String) e.getItem();
            if(str.equals("The First")){
                txtArea.append("You checked: "+str+"\n");
            }
            if(str.equals("The Second")){
                txtArea.append("You checked: "+str+"\n");
            }
            if(str.equals("Reset Checkbox")){
                txtArea.append("You checked: "+str+"\n");
            }
        }
        if(e.getStateChange()==ItemEvent.DESELECTED){// check hành động bỏ check của người dùng 
            txtArea.append("You have just unchecked \n");
        }
    }
    public static void main(String[] args) {
        checkbox ck  = new checkbox();
        ck.setSize(400, 500);
    }
}
