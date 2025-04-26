import javax.swing.*;
import java.awt.*;

public class Exercise1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("个人信息");
        frame.setLayout(new BorderLayout());

        // 使用Box创建垂直布局
        Box centerBox = Box.createVerticalBox();
        String[] labels = {"姓名:", "职业:", "邮箱:"};
        for (String label : labels) {
            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));
            row.add(new JLabel(label));
            row.add(new JTextField(15));
            centerBox.add(row);
        }

        // 按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("OK"));
        buttonPanel.add(new JButton("Cancel"));
        buttonPanel.add(new JButton("Return"));

        frame.add(centerBox, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}