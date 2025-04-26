import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("认证方式选择");
        frame.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createTitledBorder("选择认证方式"));
        ButtonGroup group = new ButtonGroup();
        String[] authTypes = {"护照", "身份证", "社会保障卡", "驾驶证"};

        for (String auth : authTypes) {
            JRadioButton rb = new JRadioButton(auth);
            rb.addActionListener(e -> {
                if (rb.isSelected()) {
                    ((JTextField)frame.getContentPane().getComponent(1))
                            .setText("您选择的认证方式是: " + auth);
                }
            });
            group.add(rb);
            leftPanel.add(rb);
        }

        JTextField resultField = new JTextField(20);
        resultField.setEditable(false);

        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(resultField, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
}