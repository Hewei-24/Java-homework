package example;

import java.sql.*;
import javax.swing.JOptionPane;
public class DemoDelete {
    public static void main(String[] args){
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String user= "root",pwd = "Hw044529.";
        Connection con;
        Statement sql;
        ResultSet rs;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("test"+e);
        }
        try{
            con= DriverManager.getConnection(url,user,pwd);
            sql = con.createStatement();
            String mysql = "delete from message where number = '001'";
            System.out.println(mysql);
            int k = sql.executeUpdate(mysql);
            if(k==1)
                JOptionPane.showMessageDialog(null,"删除记录成功","成功",JOptionPane.PLAIN_MESSAGE);
            con.close();
        }catch(SQLException ee){
            JOptionPane.showMessageDialog(null,"删除记录失败"+ee,"失败",JOptionPane.ERROR_MESSAGE);
        }
    }
}
