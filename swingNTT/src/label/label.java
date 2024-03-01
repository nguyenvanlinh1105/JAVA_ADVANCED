
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class label extends Frame{
    private Label label ;
    public label(){
        setSize(400,400);
        Font fonr = new Font("Courier", Font.BOLD,20);
        label = new Label("Thử nghiệm với JLabel");
        label.setFont(fonr);
        add(label);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
       new label();
    }
}
