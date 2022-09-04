package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConPro {
    static Connection con;
    public static Connection createCon(){
//        Load driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

//            Create the connection
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/student_manage1";

            con = DriverManager.getConnection(url, user , password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
