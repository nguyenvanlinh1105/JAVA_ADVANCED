/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkboxMenu;

import java.awt.CheckboxMenuItem;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class checkboxMenu extends Frame implements ActionListener{
    MenuBar mb;
    Menu fm, om, hm;
    Menu opSubm;
    MenuItem exitItem;
    CheckboxMenuItem cb;
    Label label;
    
    public checkboxMenu(){
        this.setTitle("Linh Nguyen");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        Container cp = this;
        cp.setLayout(new FlowLayout());
        mb = new MenuBar();
        setMenuBar(mb);
        // File menu 
        MenuItem mi ;
        fm = new Menu("File");
        fm.add(mi = new MenuItem("Open", new MenuShortcut('O')));
        mi.addActionListener(this);
        fm.addSeparator();
        fm.add(mi = new MenuItem("Save", new MenuShortcut('S')));
        mi.addActionListener(this);
        fm.addSeparator();
        fm.add(mi = new MenuItem("Close", new MenuShortcut('W')));
        mi.addActionListener(this);
        fm.addSeparator();
        fm.add(mi = new MenuItem("Print", new MenuShortcut('P')));
        mi.addActionListener(this);
        fm.addSeparator();
        fm.add(mi = new MenuItem("Exit", new MenuShortcut('Q')));
        mi.addActionListener(this);
        fm.addSeparator();
        mb.add(fm);
        // the options menu 
        om = new Menu("Options");
        cb = new CheckboxMenuItem("AutoSave");
        cb.setState(true);
        cb.addActionListener(this);
        om.add(cb);
        
        opSubm = new Menu("SubOptions");
        opSubm.add(new MenuItem("Alpha"));
        opSubm.add(new MenuItem("Gamma"));
        opSubm.add(new MenuItem("Delta"));
        om.add(opSubm);
        mb.add(om);
        // the help menu 
        hm = new Menu("Help");
        hm.add(mi = new MenuItem("About"));
        mi.addActionListener(this);
        hm.add(mi = new MenuItem("Topics"));
        mi.addActionListener(this);
        mb.add(hm);
        mb.setHelpMenu(hm);
        label = new Label("Menu Demo Window");
        label.setSize(200,15);
        cp.add(label);
              
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Open")) {
            // Xử lý khi chọn Open
        } else if(command.equals("Save")) {
            // Xử lý khi chọn Save
        } else if(command.equals("Close")) {
            // Xử lý khi chọn Close
        } else if(command.equals("Print")) {
            // Xử lý khi chọn Print
        } else if(command.equals("Exit")) {
            // Xử lý khi chọn Exit
            System.exit(0);
        } else if(command.equals("About")) {
            // Xử lý khi chọn About
        } else if(command.equals("Topics")) {
            // Xử lý khi chọn Topics
        }
    }

    public static void main(String[] args) {
        checkboxMenu  mn =new checkboxMenu();
    }
}
