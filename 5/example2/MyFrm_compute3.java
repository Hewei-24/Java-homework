package example2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrm_compute3 extends JFrame {
    JLabel lbl_number = new JLabel("enter number:");
    JTextField txt_number = new JTextField(10);

    JButton btn_square = new JButton("square");
    JButton btn_sqrt = new JButton("sqrt");

    JTextField txt_square = new JTextField(10);
    JTextField txt_sqrt = new JTextField(10);

    public MyFrm_compute3() {
        setLayout(new GridLayout(3,3));
        add(lbl_number);
        add(txt_number);
        add(btn_square);
        add(txt_square);
        add(btn_sqrt);
        add(txt_sqrt);

        btn_square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(txt_number.getText().trim());
                txt_square.setText(Math.pow(number,2)+"");
            }
        });
        btn_sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number = Double.parseDouble(txt_number.getText().trim());
                txt_square.setText(Math.sqrt(number)+"");
            }
        });

        setSize(300,160);
        setVisible(true);
        setTitle("计算");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
