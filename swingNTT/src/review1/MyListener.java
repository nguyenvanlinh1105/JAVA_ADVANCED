/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class MyListener implements ActionListener{
    Label status;
    Component compo;
    public MyListener (Label status,laptrinhsukien compo){
        this.status = status;
        this.compo= compo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof Button){
            Button temp = (Button)e.getSource();
            this.status.setText("You have selected: "+temp.getLabel());
            if(temp.getLabel().equalsIgnoreCase("RED")){
                compo.setBackground(Color.red);
                
            }
            if(temp.getLabel().equalsIgnoreCase("GREEN")){
                compo.setBackground(Color.green);
            }
            if(temp.getLabel().equalsIgnoreCase("BLUE")){
                compo.setBackground(Color.blue);
            }
        }
    }
    
}
