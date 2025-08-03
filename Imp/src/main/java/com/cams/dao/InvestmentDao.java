package com.cams.dao;

import com.cams.dto.InvestmentDto;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class InvestmentDao {
    public int addInvestment(InvestmentDto investment) {
        //investment data from main to service, from service to dao
        // jdbc code to insert an investment data to the database
        String url = "jdbc:mysql://localhost:3306/investmentdb";
        String username = "root";
        String password = "root@123";
        Connection con;
        PreparedStatement pstmt;
        int result = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            String insertQuery = "INSERT INTO investment VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(insertQuery);
            pstmt.setInt(1, investment.investmentId());
            pstmt.setString(2, investment.investmentName());
            pstmt.setString(3, investment.investmentType());
            pstmt.setInt(4, investment.investmentAmount());
            pstmt.setDate(5, investment.investmentDate());
            result = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<InvestmentDto> getAllInvestments() {
        //jdbc code to fetch all investments
        String url = "jdbc:mysql://localhost:3306/investmentdb";
        String username = "root";
        String password = "root@123";
        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;
        List<InvestmentDto> investmentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            String selectQuery = "SELECT * FROM investment";
            pstmt = con.prepareStatement(selectQuery);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                InvestmentDto investment = new InvestmentDto(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getDate(5));
                investmentList.add(investment);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return investmentList;
    }

public int deleteInvestmentById(int id){
            String url="jdbc:mysql://localhost:3306/investmentdb";
            String username="root";
            String password="root@123";
            Connection con;
            PreparedStatement pstmt;
            int result=0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection(url,username,password);
                String deleteQuery="DELETE FROM investment WHERE id=?";
                pstmt=con.prepareStatement(deleteQuery);
                pstmt.setInt(1,id);
                result=pstmt.executeUpdate();

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return result;
        }
}
