package example3;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class ScoreQuery extends JFrame implements TreeSelectionListener{

    String[] cols = {"学号","姓名","高等数学","大学物理","大学英语","程序设计"};
    Object[][] rows_202101 = {{"20211001","周小芳",90,80,99,85},{"20211002","赵华",80,90,75,82},{"20211003","王大骐",88,85,90,75},{"20211004","吴芸芸",90,90,88,90},{"20211005","刘丹青",80,75,80,70}};
    Object[][] rows_202102 = {{"20212001","郭磊磊",90,90,80,85},{"20212002","魏小荣",75,75,80,65}};
    Object[][] rows_202201 = {{"20221001","黄嘉敏",80,85,82,78},{"20221002","沈思思",95,90,90,80}};
    Object[][] rows_202202 = {{"20222001","马晓宇",78,82,92,88},{"20222002","李荣荣",85,95,90,80},{"20222003","邹晓瑞",75,80,80,78}};

    StudentInfo class202101 =new StudentInfo("2021级1班",cols,rows_202101);
    StudentInfo class202102 =new StudentInfo("2021级2班",cols,rows_202102);
    StudentInfo class202201 =new StudentInfo("2022级1班",cols,rows_202201);
    StudentInfo class202202 =new StudentInfo("2022级2班",cols,rows_202202);

    JTree mytree;
    JTable mytable;
    JTabbedPane jt;
    JSplitPane pSplit;

    public ScoreQuery(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("学生");
        DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("2021级");
        DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("2022级");

        DefaultMutableTreeNode d11 = new DefaultMutableTreeNode(new StudentInfo("2021级1班",cols,rows_202101));
        DefaultMutableTreeNode d12 = new DefaultMutableTreeNode(new StudentInfo("2021级2班",cols,rows_202102));
        DefaultMutableTreeNode d21 = new DefaultMutableTreeNode(new StudentInfo("2022级1班",cols,rows_202201));
        DefaultMutableTreeNode d22 = new DefaultMutableTreeNode(new StudentInfo("2022级2班",cols,rows_202202));

        d1.add(d11);
        d1.add(d12);
        d2.add(d21);
        d2.add(d22);

        root.add(d1);
        root.add(d2);

        mytree = new JTree(root);
        mytree.addTreeSelectionListener(this);

        jt = new JTabbedPane();

        pSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,mytree,jt);
        pSplit.setDividerSize(5);
        pSplit.setDividerLocation(150);

        this.add(pSplit,BorderLayout.CENTER);
        this.setTitle("计算机专业学生");
        this.setSize(650,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //编写树的事件处理程序
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) mytree.getLastSelectedPathComponent();
        if (node.isLeaf()) {
            jt.removeAll();
            StudentInfo obj = (StudentInfo) node.getUserObject();
            mytable = new JTable(obj.rows, obj.cols);
            jt.add(obj.toString(), new JScrollPane(mytable));
            for (int i = 0; i < obj.rows.length; i++)
                for (int j = 0; j < obj.rows[i].length; i++)
                    System.out.println(obj.rows[i][j]);
        }
    }

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        ScoreQuery frm = new ScoreQuery();
    }
}
