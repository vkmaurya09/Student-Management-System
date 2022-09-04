package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentdao {

    public static boolean insertStudToDB(student st){
        boolean f = false;
        try{
            Connection con = ConPro.createCon();
            String q = "insert into student(sname , sphone , scity) values(?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1,st.getStudName());
            pstmt.setString(2,st.getStudPhone());
            pstmt.setString(3,st.getStudCity());

//            execute
            pstmt.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deletestudent(int userId){
        boolean f = false;
        try{
            Connection con = ConPro.createCon();
            String q = "delete from student where sID=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setInt(1, userId);


//            execute
            pstmt.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }

    public static void showAllStudent(){
        boolean f = false;
        try{
            Connection con = ConPro.createCon();
            String q = "select * from student";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String Phone = set.getString(3);
                String city = set.getString("sCity");

                System.out.println("ID : " + id);
                System.out.println("Name : "+ name);
                System.out.println("Phone :"+ Phone);
                System.out.println("City : " + city);
                System.out.println("_________________________________");
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
