package example1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyWindow extends JFrame implements ActionListener{
    JLabel lbl_input;
    JTextField txt_original,txt_square,txt_sqrt;
    JMenuBar menubar;
    JMenu menu_computer,menu_edit,menu_save;
    JMenuItem menuItem_square,menuItem_sqrt,menuItem_reset,menuItem_saveToFile,menuItem_saveToDataBase;

    MyWindow(String s){
        lbl_input = new JLabel("请输入一个数：");
        txt_original = new JTextField(10);
        txt_square = new JTextField(10);
        txt_sqrt = new JTextField(10);

        menubar = new JMenuBar();
        menu_computer = new JMenu("计算");
        menu_edit = new JMenu("编辑");
        menu_save = new JMenu("保存");
        menuItem_square = new JMenuItem("计算平方");
        menuItem_sqrt = new JMenuItem("计算平方根");
        menuItem_square.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
        menuItem_sqrt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
        menuItem_reset = new JMenuItem("重置");

        menuItem_saveToFile = new JMenuItem("保存到文件...");
        menuItem_saveToDataBase = new JMenuItem("保存到数据库...");

        menu_computer.add(menuItem_square);
        menu_computer.addSeparator();
        menu_computer.add(menuItem_sqrt);

        menu_save.add(menuItem_saveToFile);
        menu_save.add(menuItem_saveToDataBase);
        menu_edit.add(menuItem_reset);
        menu_edit.add(menu_save);

        menuItem_square.addActionListener(this);
        menuItem_sqrt.addActionListener(this);
        menuItem_reset.addActionListener(this);
        menuItem_saveToFile.addActionListener(this);
        menuItem_saveToDataBase.addActionListener(this);

        menubar.add(menu_computer);
        menubar.add(menu_edit);

        setJMenuBar(menubar);

        setLayout(new FlowLayout());
        add(lbl_input);
        add(txt_original);
        add(txt_square);
        add(txt_sqrt);

        setTitle(s);
        setSize(300,150);
        setLocation(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menuItem_square)
            try{
                int m = Integer.parseInt(txt_original.getText().trim());
                String s = Math.pow(m,2)+"";
                txt_square.setText(s);

            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(this,"please input aninteger");
                txt_original.setText("");
            }
        else if(e.getSource() == menuItem_sqrt)
            try{
                int m = Integer.parseInt(txt_original.getText().trim());
                String s = String.format("%.2f",Math.sqrt(m));
                txt_sqrt.setText(s);
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(this,"plese input an integer");
                txt_original.setText("");
            }
        else if(e.getSource() == menuItem_reset){
            txt_original.setText("");
            txt_square.setText("");
            txt_sqrt.setText("");
        }else if(e.getSource() == menuItem_saveToFile){
            System.out.println("save to file");
        }else if(e.getSource() ==  menuItem_saveToDataBase){
            System.out.println("save to database");
        }
    }
}
