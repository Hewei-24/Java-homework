package ontheclass;

import java.awt.*;
import javax.swing.*;
public class MyFrm_FlowLayout extends JFrame {

    //declare member variables;
    //name
    JLabel lbl_name=new JLabel("name");
    JTextField txt_name=new JTextField(10);

    //sex
    JLabel lbl_sex=new JLabel("sex");
    JRadioButton rb_man=new JRadioButton("male");
    JRadioButton rb_woman=new JRadioButton("female");

    //hobby
    JLabel lbl_hobby=new JLabel("hobby");
    JCheckBox ck1=new JCheckBox("music");
    JCheckBox ck2=new JCheckBox("travel");
    JCheckBox ck3=new JCheckBox("cook");

    //department
    JLabel lbl_department=new JLabel("Department");
    JComboBox<String> cmb=new JComboBox<String>();

    JButton btn_ok=new JButton("confirm");

    public MyFrm_FlowLayout() {
        //put these controllers in the constructor method
        setLayout(new FlowLayout());
        add(lbl_name);
        add(txt_name);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb_man);
        bg.add(rb_woman);
        add(lbl_sex);
        add(rb_man);
        add(rb_woman);
        rb_man.setSelected(true);

        add(lbl_hobby);
        add(ck1);add(ck2);add(ck3);

        cmb.addItem("Math");
        cmb.addItem("Chinese");
        cmb.addItem("Computer");
        add(lbl_department);
        add(cmb);

        add(btn_ok);

        setTitle("FlowLayout window");
        setVisible(true);
        setLocation(300,300);
        setSize(300,150);
        //	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
