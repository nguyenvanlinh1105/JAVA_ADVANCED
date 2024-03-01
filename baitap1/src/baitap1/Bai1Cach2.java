package baitap1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai1Cach2 extends JFrame implements ActionListener {
    private JPanel panel = new JPanel();
    private Label lbelMess;
    private Button btnVN, btnEL;
    public Bai1Cach2() {
        setTitle("My intro");
        setSize(500, 500);
        setLocationRelativeTo(null);
        Font font = new Font("Time new Romans", Font.BOLD, 10);

        // Set layout
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER, 100, 200);

        setLayout(flowLayout2);
        lbelMess = new Label();
        lbelMess.setPreferredSize(new Dimension(200, 30));
        lbelMess.setFont(font);
        btnVN = new Button("Việt Nam");
        btnEL = new Button("Inh lịt");
        btnVN.addActionListener(this);
        btnEL.addActionListener(this);

        panel.setLayout(new BorderLayout());
        panel.add(btnVN, BorderLayout.NORTH);
        panel.add(btnEL, BorderLayout.CENTER);
        add(panel);
        add(lbelMess);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVN) {
            lbelMess.setText("Xin chào Linh Nguyễn");
        } else if (e.getSource() == btnEL) {
            lbelMess.setText("Hello Linh Nguyễn");
        }
    }

    public static void main(String[] args) {
        Bai1Cach2 intro = new Bai1Cach2();
    }
}