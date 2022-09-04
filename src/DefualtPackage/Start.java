package DefualtPackage;

import com.student.manage.student;
import com.student.manage.studentdao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Start {
    public Start() {
        super();
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Student Management System");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Press 1 : Add Student");
            System.out.println("Press 2 : Delete Student");
            System.out.println("Press 3 : Display Student");
            System.out.println("Press 4 : Exit App");
            int c = Integer.parseInt(br.readLine());

            if(c==1){
                System.out.println("Enter Student Name : ");
                String name = br.readLine();
                System.out.println("Enter Student Phone");
                String phone = br.readLine();
                System.out.println("Enter Student City");
                String city = br.readLine();

                student st = new student(name , phone , city);
                boolean ans = studentdao.insertStudToDB(st);
                if(ans){
                    System.out.println("Student Added");
                }else{
                    System.out.println("Something Went Wrong");
                }
                System.out.println(st);
            }
            else if (c==2){
                System.out.println("Enter Student Id :");
                int userId = Integer.parseInt(br.readLine());
                studentdao.deletestudent(userId);
                boolean ans = studentdao.deletestudent(userId);
                if(ans){
                    System.out.println("Deleted...");
                }else{
                    System.out.println("Something Went Wrong");
                }
            }
            else if(c == 3){
                System.out.println("All Student Data");
                studentdao.showAllStudent();
            }
            else if (c==4){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }



        }
        System.out.println("Thank you for Using App");
        System.out.println("Visit Again");




    }
}
