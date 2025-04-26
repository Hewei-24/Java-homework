package example3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example {
    public static void main(String[] args) {
        MyFrm_StudentInfo myWin = new MyFrm_StudentInfo();
    }
}

class MyFrm_StudentInfo extends JFrame implements ItemListener, ActionListener, FocusListener {

    // 姓名
    JLabel lbl_name = new JLabel("Name");
    JTextField txt_name = new JTextField(10);

    // 性别
    JLabel lbl_sex = new JLabel("Gender");
    JRadioButton rb_man = new JRadioButton("male");
    JRadioButton rb_woman = new JRadioButton("female");

    // 爱好
    JLabel lbl_hobby = new JLabel("Hobby");
    JCheckBox ck1 = new JCheckBox("music");
    JCheckBox ck2 = new JCheckBox("cooking");
    JCheckBox ck3 = new JCheckBox("reading");

    // 系别
    JLabel lbl_department = new JLabel("Department");
    JComboBox cmb = new JComboBox();
    JButton btn_ok = new JButton("Confirm");
    JButton btn_exit = new JButton("Exit");

    public MyFrm_StudentInfo() {
        setLayout(new FlowLayout());

        // 加入姓名相关组件
        txt_name.addActionListener(this);
        txt_name.addFocusListener(this);
        add(lbl_name);
        add(txt_name);

        // 加入性别相关组件
        rb_man.setSelected(true);
        rb_man.addItemListener(this);
        rb_woman.addItemListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb_man);
        bg.add(rb_woman);

        add(lbl_sex);
        add(rb_man);
        add(rb_woman);

        // 加入爱好相关组件
        add(lbl_hobby);
        ck1.setSelected(true);
        ck1.addItemListener(this);
        ck2.addItemListener(this);
        ck3.addItemListener(this);

        add(ck1);
        add(ck2);
        add(ck3);

        // 设置系别，并加入该组件
        add(lbl_department);
        cmb.addItem("Math");
        cmb.addItem("Chinese");
        cmb.addItem("English");
        cmb.setSelectedIndex(0);
        cmb.setEditable(true);
        cmb.addItemListener(this);
        add(cmb);

        // 加入功能按钮
        add(btn_ok);
        btn_ok.addActionListener(this);
        add(btn_exit);
        btn_exit.addActionListener(this);

        setTitle("Student Information");
        setSize(600, 130);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == rb_man || e.getSource() == rb_woman) {
            if (rb_man.isSelected())
                System.out.println("You are a boy");
            if (rb_woman.isSelected())
                System.out.println("You are a girl");
        }
        if (e.getSource() == ck1) {
            if (ck1.isSelected())
                System.out.println("You like music");
            else
                System.out.println("You don't like music");
        }
        if (e.getSource() == ck2) {
            if (ck2.isSelected())
                System.out.println("You like cooking");
            else
                System.out.println("You don't like cooking");
        }
        if (e.getSource() == ck3) {
            if (ck3.isSelected())
                System.out.println("You like reading");
            else
                System.out.println("You don't like reading");
        }
        if (e.getSource() == cmb) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Your department is " + cmb.getSelectedItem().toString());
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txt_name)
            System.out.println("ActionListener: your name is " + txt_name.getText());
        else if (e.getSource() == btn_ok)
            System.out.println("You confirm the information");
        else if (e.getSource() == btn_exit)
            System.exit(0);
    }

    public void focusGained(FocusEvent e) {
        System.out.println("FocusListener: It gets the focus");
    }

    public void focusLost(FocusEvent e) {
        System.out.println("FocusListener: It loses the focus");
    }
}