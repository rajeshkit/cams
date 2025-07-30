package com.cams;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
        String username="root";
        String password="root@123";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection(url,username,password);
            String query="INSERT INTO mutualfunds VALUES" +
                "(?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(query);
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the mutual fund id: ");
            stmt.setInt(1,s.nextInt());
            s.nextLine();
            System.out.println("Enter the mutual fund name");
            stmt.setString(2,s.nextLine());
            System.out.println("Enter the mutual fund total amount");
            stmt.setInt(3,s.nextInt());
            System.out.println("Enter the mutual fund email");
            stmt.setString(4,s.next());
            System.out.println("Date will be set automatically");
            stmt.setDate(5, Date.valueOf(LocalDate.now()));
            int result=stmt.executeUpdate();
            if(result>0){
                System.out.println("The mutualfund is added to the db");
            }else{
                System.out.println("The mutualfund is not added to the db");
            }
            stmt.close();
            con.close();

    }
}