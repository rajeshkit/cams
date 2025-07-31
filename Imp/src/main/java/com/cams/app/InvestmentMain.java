package com.cams.app;

import com.cams.dto.Investment;
import com.cams.service.InvestmentService;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        //logic getting an input / output for Investment
        //addInvestment();
        //getAllInvestments();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the ID of the investment wanted to delete");
        int id=s.nextInt();
        InvestmentService investmentService=new InvestmentService();
        int result=investmentService.deleteInvestmentById(id);
        if(result!=0){
            System.out.println("investment deleted successfully");
        }else{
            System.out.println("investment not deleted successfully");
        }
    }

    private static void getAllInvestments() {
        InvestmentService investmentService=new InvestmentService();
        List<Investment> allInvestment=investmentService.getAllInvestment();
        for(Investment i:allInvestment){
            System.out.println(i);
        }
    }

    private static void addInvestment() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the investment ID:");
        int iId=s.nextInt();
        s.nextLine();
        System.out.println("Enter the investment Name:");
        String iName=s.nextLine();
        System.out.println("Enter the investment Type:");
        String iType=s.nextLine();
        System.out.println("Enter the investment Amount:");
        int iAmount=s.nextInt();
        Date iDate = Date.valueOf(LocalDate.now());
        Investment investment=new Investment(iId,iName,iType,iAmount,iDate);
        InvestmentService investmentService=new InvestmentService();
        int result=investmentService.addInvestment(investment);
        if(result!=0){
            System.out.println("Investment successfully added");
        }else{
            System.out.println("Investment has not added failed");
        }
    }
}
