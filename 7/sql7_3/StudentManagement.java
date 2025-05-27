package sql7_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentManagement extends JFrame {
    // 数据库连接信息
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/support";
    private static final String USER = "root";
    private static final String PASS = "Hw044529.";

    // 界面组件
    private JTextField snoField, snameField, sbirthField, ssexField, sclassField, saddressField;

    public StudentManagement() {
        setTitle("学生信息管理系统");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // 添加组件
        add(new JLabel("学号:"));
        snoField = new JTextField();
        add(snoField);

        add(new JLabel("姓名:"));
        snameField = new JTextField();
        add(snameField);

        add(new JLabel("出生日期:"));
        sbirthField = new JTextField();
        add(sbirthField);

        add(new JLabel("性别:"));
        ssexField = new JTextField();
        add(ssexField);

        add(new JLabel("班级:"));
        sclassField = new JTextField();
        add(sclassField);

        add(new JLabel("地址:"));
        saddressField = new JTextField();
        add(saddressField);

        // 添加按钮
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));

        JButton addBtn = new JButton("添加");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
        buttonPanel.add(addBtn);

        JButton delBtn = new JButton("删除");
        delBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });
        buttonPanel.add(delBtn);

        JButton updateBtn = new JButton("更新第一条记录");
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateFirstStudent();
            }
        });
        buttonPanel.add(updateBtn);

        add(buttonPanel);

        setVisible(true);
    }

    // 添加学生
    private void addStudent() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "INSERT INTO student VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, snoField.getText());
            pstmt.setString(2, snameField.getText());
            pstmt.setString(3, sbirthField.getText());
            pstmt.setString(4, ssexField.getText());
            pstmt.setString(5, sclassField.getText());
            pstmt.setString(6, saddressField.getText());

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "学生信息添加成功");
                clearFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "添加失败: " + e.getMessage());
        }
    }

    // 删除学生
    private void deleteStudent() {
        String sno = JOptionPane.showInputDialog("请输入要删除的学生学号:");
        if (sno == null || sno.isEmpty()) return;

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "DELETE FROM student WHERE sno=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sno);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "学号为 " + sno + " 的学生已删除");
            } else {
                JOptionPane.showMessageDialog(null, "未找到学号为 " + sno + " 的学生");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "删除失败: " + e.getMessage());
        }
    }

    // 更新第一条学生记录
    private void updateFirstStudent() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            // 获取第一条记录
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student ORDER BY sno LIMIT 1");

            if (rs.next()) {
                String oldName = rs.getString("sname");
                String sno = rs.getString("sno");

                // 更新姓名
                String newName = "田永慧"; // 替换为你的姓名
                PreparedStatement pstmt = conn.prepareStatement(
                        "UPDATE student SET sname=? WHERE sno=?");
                pstmt.setString(1, newName);
                pstmt.setString(2, sno);

                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(null,
                            "更新成功: " + sno + "号学生姓名从 " + oldName + " 改为 " + newName);
                }
            } else {
                JOptionPane.showMessageDialog(null, "没有学生记录可更新");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "更新失败: " + e.getMessage());
        }
    }

    // 清空输入框
    private void clearFields() {
        snoField.setText("");
        snameField.setText("");
        sbirthField.setText("");
        ssexField.setText("");
        sclassField.setText("");
        saddressField.setText("");
    }

    public static void main(String[] args) {
        new StudentManagement();
    }
}