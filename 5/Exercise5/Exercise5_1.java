package Exercise5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise5_1 {
    public static void main(String[] args) {
        new RandomCalculator();
    }
}

class RandomCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public RandomCalculator() {
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("数字一:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("数字二:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("结果:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        JButton genBtn = new JButton("产生");
        genBtn.addActionListener(new GenerateListener());
        add(genBtn);

        JButton calcBtn = new JButton("计算");
        calcBtn.addActionListener(new CalculateListener());
        add(calcBtn);

        setTitle("随机数字计算器");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class GenerateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1Field.setText(String.format("%.2f", Math.random() * 100));
            num2Field.setText(String.format("%.2f", Math.random() * 100));
        }
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double sum = Double.parseDouble(num1Field.getText()) +
                        Double.parseDouble(num2Field.getText());
                resultField.setText(String.format("%.2f", sum));
            } catch (NumberFormatException ex) {
                resultField.setText("输入错误");
            }
        }
    }
}
