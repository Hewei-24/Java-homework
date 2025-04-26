package Exercise5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomCalculator3 {
    public static void main(String[] args) {
        new CalculatorFrame3();
    }
}

class CalculatorFrame3 extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public CalculatorFrame3() {
        // 初始化界面
        setTitle("随机数计算器（匿名类实现）");
        setLayout(new GridLayout(4, 2, 10, 10));

        // 添加组件
        add(new JLabel("数字一:", SwingConstants.RIGHT));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("数字二:", SwingConstants.RIGHT));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("结果:", SwingConstants.RIGHT));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        JButton genBtn = new JButton("产生");
        genBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Math.random() * 100;
                double num2 = Math.random() * 100;
                num1Field.setText(String.format("%.2f", num1));
                num2Field.setText(String.format("%.2f", num2));
                resultField.setText("");
            }
        });
        add(genBtn);

        JButton calcBtn = new JButton("计算");
        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double sum = num1 + num2;
                    resultField.setText(String.format("%.2f", sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入有效的数字！", "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(calcBtn);

        // 设置窗口属性
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
