import javax.swing.*;

public class Exercise3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("绝对布局示例");
        frame.setLayout(null);

        JLabel label = new JLabel("用户名:");
        label.setBounds(20, 20, 80, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(100, 20, 160, 25);
        frame.add(textField);

        JButton button = new JButton("登录");
        button.setBounds(100, 80, 80, 25);
        frame.add(button);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}