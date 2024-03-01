import java.awt.*;
import java.awt.event.*;

public class SimplePopupMenu extends Frame {
    private PopupMenu popupMenu;

    public SimplePopupMenu() {
        setTitle("Simple Popup Menu Example");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Tạo một PopupMenu mới
        popupMenu = new PopupMenu("Options");

        // Tạo các MenuItem cho PopupMenu
        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");

        // Thêm các MenuItem vào PopupMenu
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);

        // Thêm ActionListener cho các MenuItem
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 selected");
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 selected");
            }
        });

        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 3 selected");
            }
        });

        // Thêm PopupMenu vào Frame
        add(popupMenu);

        // Thêm MouseListener để hiển thị PopupMenu khi chuột phải được nhấp vào
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // Kiểm tra nếu chuột phải được nhấp
                    popupMenu.show(SimplePopupMenu.this, e.getX(), e.getY()); // Hiển thị PopupMenu tại vị trí chuột
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimplePopupMenu();
    }
}
