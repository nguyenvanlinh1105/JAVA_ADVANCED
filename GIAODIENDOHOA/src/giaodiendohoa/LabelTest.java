/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaodiendohoa;

import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author HP
 */
public class LabelTest extends JFrame{
    private JLabel label1, label2, label3;
    public LabelTest(){
        setSize(600,500);
        setTitle("Testing JLabel");
        Container container = getContentPane();// lấy nội dung ở pane 
        container.setLayout(new FlowLayout());
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        container.add(label1);
        Icon bug = new ImageIcon ("C:\\Users\\HP\\Downloads\\bug.png");
        
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT );
        label2.setToolTipText("This is label 2");
        container.add(label2);
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);// xets theo chieu ngang 
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);// xet theo chieu doc
        label3.setToolTipText("This is label3");
        container.add(label3);
        this.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LabelTest();
    }

    
}
