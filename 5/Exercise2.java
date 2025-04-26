import javax.swing.*;
import java.awt.*;

public class Exercise2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("证件信息处理");
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridLayout(7, 2, 5, 5));
        String[] fields = {"姓名:", "性别:", "身份证:", "单位:", "证件号码:", "注册日期:", "有效日期:"};
        for (String field : fields) {
            centerPanel.add(new JLabel(field));
            centerPanel.add(field.equals("性别:") ? new JComboBox<>(new String[]{"男", "女"}) : new JTextField());
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("添加"));
        buttonPanel.add(new JButton("删除"));
        buttonPanel.add(new JButton("撤销"));
        buttonPanel.add(new JButton("退出"));

        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}