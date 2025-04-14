package ontheclass;

import java.awt.*;
import javax.swing.*;
public class MyFrm_BorderLayout extends JFrame{
    JButton btn[]=new JButton[5];
    String[] str= {"North","South","West","East","Center"};

    public MyFrm_BorderLayout() {
        for(int i=0;i<btn.length;i++) {
            btn[i]=new JButton(str[i]);
        }
        //	setLayout(new BorderLayout());
        add(btn[0],BorderLayout.NORTH);
        add(btn[1],BorderLayout.SOUTH);
        add(btn[2],BorderLayout.WEST);
        add(btn[3],BorderLayout.EAST);
        add(btn[4],BorderLayout.CENTER);


        setTitle("BorderLayout window");
        setVisible(true);
        setLocation(300,300);
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}