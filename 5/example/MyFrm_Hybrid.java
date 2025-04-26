package example;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class MyFrm_Hybrid extends JFrame{
    JButton[ ] btn = new JButton[4];
    String[] str = {"OK","Cancel","Last","Next"};
    JLabel lbl_Name = new JLabel("Name");
    JLabel lbl_Number  = new JLabel("Number");
    JLabel lbl_Score = new JLabel("Score");

    JTextField txt_Name = new JTextField();
    JTextField txt_No = new JTextField();
    JTextField txt_Score = new JTextField();

    //在构造方法中将控件放入JFrame中
    public MyFrm_Hybrid(){
        for(int i = 0;i<4;i++){
            btn[i] = new JButton(str[i]);
        }
        JPanel jp1 = new JPanel();
        Border titleBorder1 = BorderFactory.createTitledBorder("Information");
        jp1.setBorder(titleBorder1);
        jp1.setLayout(new GridLayout(3,2));
        jp1.add(lbl_Name);
        jp1.add(txt_Name);
        jp1.add(lbl_Number);
        jp1.add(txt_No);
        jp1.add(lbl_Score);
        jp1.add(txt_Score);

        //下部分使用FlowLayout布局
        JPanel jp2 = new JPanel();
        jp2.add(btn[0]);
        jp2.add(btn[1]);
        jp2.add(btn[2]);
        jp2.add(btn[3]);
        //加jp1，jp2到窗口中
        add(jp1,BorderLayout.CENTER);
        add(jp2,BorderLayout.SOUTH);

        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Mixed Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MyFrm_Hybrid();
    }
}
