package example2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrm_compute2 extends JFrame implements ActionListener {
    JLabel lbl_number = new JLabel("Enter number");
    JTextField txt_number = new JTextField(10);

    JButton btn_square = new JButton("square");
    JButton btn_sqrt = new JButton("sqrt");

    JTextField txt_square = new JTextField(10);
    JTextField txt_sqrt = new JTextField(10);

    public MyFrm_compute2() {
        setLayout(new GridLayout(3,3));
        add(lbl_number);
        add(txt_number);
        add(btn_square);
        add(txt_square);
        add(btn_sqrt);
        add(txt_sqrt);

        btn_square.addActionListener(this);
        btn_sqrt.addActionListener(this);

        setSize(300,160);
        setVisible(true);
        setTitle("计算");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_square) {
            int number = Integer.parseInt(txt_number.getText().trim());
            txt_square.setText(Math.pow(number,2)+"");
        }else if(e.getSource() == btn_sqrt) {
            int number = Integer.parseInt(txt_number.getText().trim());
            txt_sqrt.setText(Math.sqrt(number)+"");
        }
    }
}
