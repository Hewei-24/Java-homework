package example2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrm_compute1 extends JFrame{
    JLabel lbl_number = new JLabel("请输入一个数：");
    JTextField txt_number = new JTextField(10);

    JButton btn_square = new JButton("它的平方根是：");
    JButton btn_sqrt = new JButton("它的平方根是：");

    JTextField txt_square = new JTextField(10);
    JTextField txt_sqrt = new JTextField(10);

    squareListener listener1 = new squareListener();
    sqrtListener listener2 = new sqrtListener();

    public MyFrm_compute1() {
        setLayout(new GridLayout(3,3));
        add(lbl_number);
        add(txt_number);
        add(btn_square);
        add(txt_square);
        add(btn_sqrt);
        add(txt_sqrt);

        btn_square.addActionListener(listener1);
        btn_sqrt.addActionListener(listener2);

        setSize(300,160);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class squareListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int number = Integer.parseInt(txt_number.getText().trim());
            txt_square.setText(Math.pow(number,2)+"");
        }
    }
    class sqrtListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double number = Double.parseDouble(txt_number.getText().trim());
            txt_sqrt.setText(Math.sqrt(number)+"");
        }
    }
}
