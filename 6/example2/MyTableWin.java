package example2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class MyTableWin extends JFrame implements ActionListener {
    Object rows[][] = {{"001","zhangsan","03/04/2002","Computer"},{"002","lisi","05/10/2002","Computer"},{"003","wangwu","09/10/2002","English"}};
    String cols[] = {"number","name","birthday","department"};
    JTable table;
    JLabel lbl_show;
    JTextField txt_show;
    JButton btn_update;
    JPanel pSouth,pNorth;

    JScrollPane jp;

    public MyTableWin(){

        table = new JTable(rows,cols);
        table.addMouseListener(new MouseAdapter(){
            public void moouseClicked(MouseEvent e){
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();
                Object selectedvalue = table.getModel().getValueAt(row,column);
                txt_show.setText((String)selectedvalue);
                btn_update.setEnabled(true);
            }
        });

        lbl_show = new JLabel("Info.");
        txt_show = new JTextField(15);
        btn_update = new JButton("Update");
        btn_update.setEnabled(false);
        btn_update.addActionListener(this);
        pSouth = new JPanel();
        pNorth = new JPanel();

        jp = new JScrollPane(table);
        pNorth.add(jp);

        pSouth.add(lbl_show);
        pSouth.add(txt_show);
        pSouth.add(btn_update);

        add(pNorth,BorderLayout.CENTER);
        add(pSouth,BorderLayout.SOUTH);

        setSize(500,150);
        setTitle("Table Example");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        int row = table.getSelectedRow();
        int column = table.getSelectedColumn();
        rows[row][column] = txt_show.getText();
        int option = JOptionPane.showConfirmDialog(this,"do you confirm toupdate the table content?","warning",JOptionPane.OK_CANCEL_OPTION);
        if(option == JOptionPane.OK_OPTION){
            table.setModel(new DefaultTableModel(rows,cols));
        }
        btn_update.setEnabled(false);
    }

    public static void main(String[] args){
        MyTableWin win = new MyTableWin();
    }
}
