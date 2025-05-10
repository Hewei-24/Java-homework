package example9_21;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.tree.*;

public class TreeWin extends JFrame implements TreeSelectionListener {
    JTree tree;
    JTextArea showText;
    TreeWin(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("商品");
        DefaultMutableTreeNode nodeTV = new DefaultMutableTreeNode("电视机类");
        DefaultMutableTreeNode nodePhone = new DefaultMutableTreeNode("手机类");
        DefaultMutableTreeNode tv1 = new DefaultMutableTreeNode(new Goods("长虹电视",5699));
        DefaultMutableTreeNode tv2 = new DefaultMutableTreeNode(new Goods("海尔电视",7832));
        DefaultMutableTreeNode phone1 = new DefaultMutableTreeNode(new Goods("诺基亚手机",3600));
        DefaultMutableTreeNode phone2 = new DefaultMutableTreeNode(new Goods("三星手机",2155));

        root.add(nodeTV);
        root.add(nodePhone);

        nodeTV.add(tv1);
        nodeTV.add(tv2);

        nodePhone.add(phone1);
        nodePhone.add(phone2);

        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        showText = new JTextArea();
        setLayout(new GridLayout(1,2));
        add(new JScrollPane(tree));
        add(new JScrollPane(showText));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(80,80,600,500);
        Font font = new Font("宋体", Font.PLAIN, 22);
        showText.setFont(font);
        tree.setFont(font);
        validate();
    }
    public void valueChanged(TreeSelectionEvent e){
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if(node == null)
            return;
        if(node.isLeaf()){
            Goods s = (Goods)node.getUserObject();
            showText.append(s.name+","+s.price+"元\n");
        }else{
            showText.setText(null);
        }
    }

}
