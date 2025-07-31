package com.cams.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MutualFundDao {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Scanner s=new Scanner(System.in);
//        String answer="no";
//        do {
//            System.out.println("Welcome to mutual funds management Options");
//            System.out.println("Choose your option");
//            System.out.println("1. Add Mutual Fund");
//            System.out.println("2. Display Mutual Fund");
//            System.out.println("3. Update Mutual Fund");
//            System.out.println("4. Delete Mutual Fund");
//            System.out.println("Enter your choice");
//            int choice = s.nextInt();
//            switch (choice) {
//                case 1:
//                    addNewMutualFund();
//                    break;
//                case 2:
//                    getAllMutualFunds();
//                    break;
//                case 3:
//                    updateMutualFunds();
//                    break;
//                case 4:
//                    deleteMutualFundsById();
//                    break;
//                default:
//                    System.out.println("Wrong choice");
//            }
//            System.out.println("do you wanted to continue(yes | no )");
//            answer=s.next();
//        }while("yes".equalsIgnoreCase(answer));
//
//
//    }
    public int deleteMutualFundsById(int id) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
        String username="root";
        String password="root@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        String updateQuery="DELETE FROM mutualfunds WHERE id=?";
        PreparedStatement pstmt=con.prepareStatement(updateQuery);
        pstmt.setInt(1,id);
        int result = pstmt.executeUpdate();
        pstmt.close();
        con.close();
        return result;
    }
//
    public int updateMutualFunds(int id,String name,int amount,String email) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
        String username="root";
        String password="root@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        String updateQuery="UPDATE mutualfunds SET name=?,amount=?,email=? WHERE id=?";
        PreparedStatement pstmt=con.prepareStatement(updateQuery);
        pstmt.setString(1,name);
        pstmt.setInt(2,amount);
        pstmt.setString(3,email);
        pstmt.setInt(4,id);
        int result = pstmt.executeUpdate();
        pstmt.close();
        con.close();
        return result;
    }
//
//    private static void getAllMutualFunds() throws ClassNotFoundException, SQLException {
//        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
//        String username="root";
//        String password="root@123";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con=DriverManager.getConnection(url,username,password);
//        Statement stmt=con.createStatement();
//        String selectQuery="SELECT * FROM mutualfunds";
//        ResultSet rs = stmt.executeQuery(selectQuery);
//        rs.close();
//        stmt.close();
//        con.close();
//    }
    public int addNewMutualFund(int id,String name,int amount,String email,Date date) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
        String username="root";
        String password="root@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        String query="INSERT INTO mutualfunds VALUES(?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setInt(1,id);
        stmt.setString(2,name);
        stmt.setInt(3,amount);
        stmt.setString(4,email);
        stmt.setDate(5,date);
        int result=stmt.executeUpdate();
        stmt.close();
        con.close();
        return result;
    }
}