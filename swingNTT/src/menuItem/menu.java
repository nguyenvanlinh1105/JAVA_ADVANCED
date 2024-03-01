/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuItem;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuComponent;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author HP
 */
public class menu extends Frame implements ActionListener {
    Label status ;
    public menu(){
        status  = new Label("Please select an item on menu");
        this.add(status);
        this.setSize(300,400);
        MenuBar appMenu = new MenuBar();
        this.setMenuBar(appMenu);// set menu 
       Menu FileMenu = new Menu("File");
        appMenu.add(FileMenu);// menu chính 
        MenuItem newItem  = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        CheckboxMenuItem AutoSaveItem = new CheckboxMenuItem("Auto save");
        AutoSaveItem.setState(true);
       Menu printItem = new Menu("Print");
        MenuItem Item1 = new MenuItem("Print preview");
        MenuItem Item2 = new MenuItem("to printer");
        printItem.add(Item1);
        printItem.add(Item2);
        FileMenu.add(newItem);
        FileMenu.add(openItem);
        FileMenu.add(saveItem);
        FileMenu.add(AutoSaveItem);
        FileMenu.addSeparator();
        FileMenu.add(printItem);
        
        
        
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        AutoSaveItem.addActionListener(this);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e ){
                System.exit(0);
            };
        });
        this.setVisible(true);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()instanceof MenuComponent){
            MenuItem Item = (MenuItem)e.getSource();
            status.setText("You have selecter:"+Item.getLabel());
        }
    }
    public static void main(String[] args) {
        menu mn = new menu();
    }
}
