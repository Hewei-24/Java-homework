package loginframe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("登录页面");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("用户名"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("密码"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel());
        loginButton = new JButton("登陆");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("abc") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "欢迎您，abc登陆");
            this.dispose();
            new MainFrame().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "用户名或密码错误", "错误", JOptionPane.ERROR_MESSAGE);
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}