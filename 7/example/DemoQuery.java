package example;

import java.sql.*;
public class DemoQuery {
    public static void main(String[] args ){
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String user= "root",pwd = "Hw044529.";
        Connection con;
        Statement sql;
        ResultSet rs;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("数据库驱动程序加载失败"+e);
        }
        try{
            con = DriverManager.getConnection(url,user,pwd);
            sql = con.createStatement();
            String sqlStatement;
            sqlStatement = "SELECT * FROM message order by height desc";
            rs = sql.executeQuery(sqlStatement);
            while(rs.next()){
                String number = rs.getString("number");
                double height = rs.getDouble("height");
                Date birth = rs.getDate("birthday");
                String name = rs.getString("name");
                System.out.println(number+","+name+","+birth+","+height);
            }
            con.close();
        }catch(SQLException e ){
            System.out.println("数据库操作失败"+e);
        }
    }
}
