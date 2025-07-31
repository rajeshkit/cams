package com.cams.app;

import com.cams.dao.MutualFundDao;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner s=new Scanner(System.in);
        String answer="no";
        do {
            System.out.println("Welcome to mutual funds management Options");
            System.out.println("Choose your option");
            System.out.println("1. Add Mutual Fund");
            System.out.println("2. Display Mutual Fund");
            System.out.println("3. Update Mutual Fund");
            System.out.println("4. Delete Mutual Fund");
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    addNewMutualFund();
                    break;
                case 2:
                    getAllMutualFunds();
                    break;
                case 3:
                    updateMutualFunds();
                    break;
                case 4:
                    deleteMutualFundsById();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("do you wanted to continue(yes | no )");
            answer=s.next();
        }while("yes".equalsIgnoreCase(answer));


    }
    private static void deleteMutualFundsById() throws ClassNotFoundException, SQLException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the mutual fund id to be deleted");
        int id = s.nextInt();
        MutualFundDao mutualFundDao=new MutualFundDao();
        int result = mutualFundDao.deleteMutualFundsById(id);
        if(result!=0){
            System.out.println("mutual fund with id: "+id+" deleted successfully");
        }else{
            System.out.println("mutual fund with id: "+id+" deletion failed");
        }

    }

    private static void updateMutualFunds() throws ClassNotFoundException, SQLException {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter mutual fund id to be updated");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Enter the new name want to updated");
        String nn=s.nextLine();
        System.out.println("Enter the new amount to be updated");
        int na=s.nextInt();
        System.out.println("Enter the new email to be updated");
        String ne=s.next();
        MutualFundDao mutualFundDao=new MutualFundDao();
        int result=mutualFundDao.updateMutualFunds(id,nn,na,ne);

        if(result!=0){
            System.out.println("mutual fund with id: "+id+" updated successfully");
        }else{
            System.out.println("mutual fund with id: "+id+" updation failed");
        }

    }

    private static void getAllMutualFunds() throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mutualfundsdb";
        String username="root";
        String password="root@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();
        String selectQuery="SELECT * FROM mutualfunds";
        ResultSet rs = stmt.executeQuery(selectQuery);
        while(rs.next()) {
            System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getDate(5));
            System.out.println("*******************************");
            //put in a collection
        }
        rs.close();
        stmt.close();
        con.close();
    }
    private static void addNewMutualFund() throws ClassNotFoundException, SQLException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the mutual fund id: ");
        int i = s.nextInt();
        s.nextLine();
        System.out.println("Enter the mutual fund name");
        String n = s.nextLine();
        System.out.println("Enter the mutual fund total amount");
        int a = s.nextInt();
        System.out.println("Enter the mutual fund email");
        String e = s.next();
        System.out.println("Date will be set automatically");
        Date d=Date.valueOf(LocalDate.now());
        MutualFundDao mutualFundDao=new MutualFundDao();
        int result=mutualFundDao.addNewMutualFund(i,n,a,e,d);
        if(result>0){
            System.out.println("Mutual Fund is added");
        }else{
            System.out.println("Mutual Fund is not added");
        }

    }
}