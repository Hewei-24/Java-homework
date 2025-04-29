import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise7_20241576_5_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("认证方式选择");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("选择认证方式"));

        String[] authTypes = {"护照", "身份证", "社会保障卡", "驾驶证"};
        JComboBox<String> comboBox = new JComboBox<>(authTypes);

        JTextField resultField = new JTextField(20);
        resultField.setEditable(false);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                resultField.setText("您选择的认证方式是: " + selected);
            }
        });

        panel.add(comboBox);
        frame.add(panel, BorderLayout.WEST);
        frame.add(resultField, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
