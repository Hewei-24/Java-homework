package bookexample.example9_2;
import javax.swing.*;
public class WindowMenu extends JFrame{
    JMenuBar menubar;
    JMenu menuFruit;
    JMenuItem bananaItem,pearItem;
    JMenu appleMenu;
    JMenuItem redAppleItem,YellowAppleItem;
    public WindowMenu() {}
    public WindowMenu(String s, int x,int y,int w,int h) {
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(String s){
        setTitle(s);
        menubar =  new JMenuBar();
        menuFruit = new JMenu("水果菜单");
        bananaItem = new JMenuItem("香蕉");
        pearItem = new JMenuItem("甜梨");
        appleMenu = new JMenu("苹果");
        redAppleItem = new JMenuItem("红苹果");
        YellowAppleItem = new JMenuItem("黄苹果");
        menuFruit.add(bananaItem);
        menuFruit.add(pearItem);
        menuFruit.addSeparator();
        menuFruit.add(appleMenu);
        appleMenu.add(redAppleItem);
        appleMenu.add(YellowAppleItem);
        menubar.add(menuFruit);
        setJMenuBar(menubar);
    }
}
