import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise8 extends JFrame implements ActionListener {
    private JTextField nameField;
    private JRadioButton maleBtn, femaleBtn;
    private JComboBox<String> deptCombo;
    private JCheckBox[] foodChecks;

    public Exercise8() {
        setLayout(new BorderLayout());

        // 基本信息面板
        JPanel infoPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        infoPanel.add(new JLabel("姓名:"));
        nameField = new JTextField();
        infoPanel.add(nameField);

        infoPanel.add(new JLabel("性别:"));
        JPanel genderPanel = new JPanel();
        maleBtn = new JRadioButton("男", true);
        femaleBtn = new JRadioButton("女");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn); genderGroup.add(femaleBtn);
        genderPanel.add(maleBtn); genderPanel.add(femaleBtn);
        infoPanel.add(genderPanel);

        infoPanel.add(new JLabel("院系:"));
        deptCombo = new JComboBox<>(new String[]{"计算机系", "数学系", "物理系"});
        infoPanel.add(deptCombo);

        // 食物选择面板
        JPanel foodPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        String[][] foods = {
                {"米饭", "面条", "粉丝", "水饺", "抄手"},
                {"清炒时蔬", "红烧小排", "清蒸河鱼", "红烧鸭块"},
                {"番茄蛋汤", "蘑菇汤", "酸菜粉丝汤", "青菜汤"}
        };

        foodChecks = new JCheckBox[foods[0].length + foods[1].length + foods[2].length];
        int index = 0;

        for (int i = 0; i < foods.length; i++) {
            JPanel categoryPanel = new JPanel();
            categoryPanel.add(new JLabel(i == 0 ? "主食:" : i == 1 ? "菜肴:" : "汤羹:"));
            for (String food : foods[i]) {
                foodChecks[index++] = new JCheckBox(food);
                categoryPanel.add(foodChecks[index-1]);
            }
            foodPanel.add(categoryPanel);
        }

        // 按钮面板
        JPanel buttonPanel = new JPanel();
        JButton confirmBtn = new JButton("确定");
        confirmBtn.addActionListener(this);
        JButton cancelBtn = new JButton("取消");
        cancelBtn.addActionListener(e -> {
            nameField.setText("");
            genderGroup.clearSelection();
            maleBtn.setSelected(true);
            deptCombo.setSelectedIndex(0);
            for (JCheckBox cb : foodChecks) cb.setSelected(false);
        });
        buttonPanel.add(confirmBtn); buttonPanel.add(cancelBtn);

        add(infoPanel, BorderLayout.NORTH);
        add(new JScrollPane(foodPanel), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        sb.append(nameField.getText()).append(" ");
        sb.append(maleBtn.isSelected() ? "男" : "女").append(" ");
        sb.append(deptCombo.getSelectedItem()).append("喜欢吃的食物有:\n");

        for (JCheckBox cb : foodChecks) {
            if (cb.isSelected()) sb.append(cb.getText()).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new Exercise8();
    }
}