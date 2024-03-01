/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouseTracker;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author HP
 */
public class mouseTracker extends Frame implements MouseListener,MouseMotionListener{
    private Label statusBar;
    public mouseTracker(){
        super("Demonstrating Mouse Events");
        statusBar = new Label();
        this.add(statusBar,BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(275,100);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        String str_bt = new String ();
        int count = e.getClickCount();
        int mousebutton = e.getButton();
        if(mousebutton ==MouseEvent.BUTTON1) str_bt = "left mouse button";
        if(mousebutton == MouseEvent.BUTTON2) str_bt ="middle mousebutton";
        if(mousebutton == MouseEvent.BUTTON3) str_bt = "right mouse button";
        statusBar.setText(str_bt+"click at("+e.getX()+","+e.getY()+")"+count+"lan");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        statusBar.setText("Pressed at["+e.getX()+","+getY()+"]");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        statusBar.setText("Released at["+e.getX()+","+e.getY()+"]");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusBar.setText("Mouse in window");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusBar.setText("Mouse outside window");
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        statusBar.setText("Dragged at["+e.getX()+","+e.getY()+"]");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        statusBar.setText("Moved at["+e.getX()+","+e.getY()+"]");
    }


    
    public static void main(String[] args) {
        new mouseTracker();
    }
}
