package sql7_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginSystem extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSystem() {
        setTitle("用户登录");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("用户名:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("密码:"));
        passwordField = new JPasswordField();
        add(passwordField);

        JButton loginBtn = new JButton("登录");
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String url = "jdbc:mysql://127.0.0.1:3306/student1";
                    String user= "root",pwd = "Hw044529.";

                    Connection conn = DriverManager.getConnection(url, user,pwd);
                    String sql = "SELECT * FROM users WHERE uname=? AND upwd=?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, usernameField.getText());
                    pstmt.setString(2, new String(passwordField.getPassword()));

                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "欢迎您，" + usernameField.getText() + " 登录");
                    } else {
                        JOptionPane.showMessageDialog(null, "用户名和密码错误");
                        usernameField.setText("");
                        passwordField.setText("");
                    }

                    rs.close();
                    pstmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        add(loginBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginSystem();
    }
}