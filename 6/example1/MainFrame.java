package example1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{
    private JTextField usernameField, telephoneField;
    private JTextArea resumeArea;
    private JComboBox<String> sexCombo, departmentCombo;
    private JCheckBox readingCheck, musicCheck, sportsCheck;
    private JTextArea displayArea;
    private JButton confirmButton, cancelButton, saveButton;

    public MainFrame(){
        setTitle("信息录入系统");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //初始化菜单
        initMenu();

        //左侧输入面板
        JPanel leftPanel = new JPanel(new GridLayout(8,2,5,5));
        leftPanel.setBorder(BorderFactory.createTitledBorder("个人信息输入"));

        leftPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        leftPanel.add(usernameField);

        leftPanel.add(new Label("sex"));
        sexCombo = new JComboBox<>(new String[]{"Male","Female"});
        leftPanel.add(sexCombo);

        leftPanel.add(new JLabel("Department:"));
        departmentCombo = new JComboBox<>(new String[]{"Computer Science", "Mathematics", "Physics"});
        leftPanel.add(departmentCombo);

        leftPanel.add(new JLabel("hobby:"));
        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        readingCheck = new JCheckBox("Reading");
        musicCheck = new JCheckBox("Music");
        sportsCheck = new JCheckBox("Sports");
        hobbyPanel.add(readingCheck);
        hobbyPanel.add(musicCheck);
        hobbyPanel.add(sportsCheck);
        leftPanel.add(hobbyPanel);

        leftPanel.add(new JLabel("Telephone No:"));
        telephoneField = new JTextField();
        leftPanel.add(telephoneField);

        leftPanel.add(new JLabel("Resume:"));
        resumeArea = new JTextArea(3,20);
        leftPanel.add(new JScrollPane(resumeArea));

        //按钮面板
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        confirmButton = new JButton("Confirm");
        cancelButton = new JButton("Cancel");
        saveButton = new JButton("Save");

        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);
        saveButton.addActionListener(this);

        buttonPanel.add(confirmButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(saveButton);

        leftPanel.add(buttonPanel);

        //右侧显示区域
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane rightScroll = new JScrollPane(displayArea);
        rightScroll.setBorder(BorderFactory.createTitledBorder("个人信息显示"));

        //主面板布局
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,leftPanel,rightScroll);
        splitPane.setDividerLocation(350);

        add(splitPane);
    }

    private void initMenu(){
        JMenuBar menuBar = new JMenuBar();

        //File菜单
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");

        //设置快捷键
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        newItem.addActionListener(this);
        openItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);

        //Edit菜单
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);

        editMenu.add(cutItem);
        editMenu.add(copyItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        switch(command){
            case "Confirm":
                displayInfo();
                break;
            case "Cancel":
                int option = JOptionPane.showConfirmDialog(this,"确定要清空所有信息吗？","确认",JOptionPane.YES_NO_OPTION);
                if(option == JOptionPane.YES_NO_OPTION){
                    clearFields();
                }
                break;
            case "Save":
                System.out.println("信息已保存");
                break;
            case "New":
                clearFields();
                sexCombo.setSelectedIndex(0);
                departmentCombo.setSelectedIndex(0);
                break;
            case "Open":
                System.out.println("用户点击Open菜单项");
                break;
            case "Cut":
                System.out.println("用户点击Cut菜单项");
                break;
            case "Copy":
                System.out.println("用户点击Copy菜单项");
                break;
        }
    }

    private void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ").append(usernameField.getText()).append("\n");
        sb.append("Sex: ").append(sexCombo.getSelectedItem()).append("\n");
        sb.append("Department: ").append(departmentCombo.getSelectedItem()).append("\n");

        sb.append("Hobby: ");
        if (readingCheck.isSelected()) sb.append("Reading ");
        if (musicCheck.isSelected()) sb.append("Music ");
        if (sportsCheck.isSelected()) sb.append("Sports ");
        sb.append("\n");

        sb.append("Telephone No: ").append(telephoneField.getText()).append("\n");
        sb.append("Resume: ").append(resumeArea.getText()).append("\n");

        displayArea.setText(sb.toString());
    }

    private void clearFields() {
        usernameField.setText("");
        telephoneField.setText("");
        resumeArea.setText("");
        readingCheck.setSelected(false);
        musicCheck.setSelected(false);
        sportsCheck.setSelected(false);
        displayArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
