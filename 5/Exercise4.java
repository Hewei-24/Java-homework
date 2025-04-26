import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("数字转换");
        frame.setLayout(new FlowLayout());

        JTextField input = new JTextField(5);
        JLabel output = new JLabel("等待输入");

        input.addActionListener(e -> {
            String[] words = {"zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"};
            try {
                int num = Integer.parseInt(input.getText());
                if(num >= 0 && num <= 9) {
                    output.setText(words[num]);
                } else {
                    output.setText("请输入0-9");
                }
            } catch (NumberFormatException ex) {
                output.setText("请输入数字");
            }
        });

        frame.add(new JLabel("输入数字(0-9):"));
        frame.add(input);
        frame.add(output);
        frame.pack();
        frame.setVisible(true);
    }
}