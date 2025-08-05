package com.cams.app;

import com.cams.AppConfig;
import com.cams.dto.InvestmentDto;
import com.cams.exception.InvalidInvestmentIdException;
import com.cams.service.InvestmentService;
import com.cams.service.InvestmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
@Component
public class InvestmentMain {
    InvestmentService investmentService;
    @Autowired
    public InvestmentMain(InvestmentServiceImpl investmentService) {
        this.investmentService = investmentService;
    }

    public static void main(String[] args) throws InvalidInvestmentIdException {
        //logic getting an input / output for Investment
        //addInvestment();
        //getAllInvestments();
       // deleteInvestmenById();
        ApplicationContext ac=
                new AnnotationConfigApplicationContext(AppConfig.class);
        InvestmentMain investmentMain=ac.getBean(InvestmentMain.class);
        //investmentMain.addInvestment();
       investmentMain.getAllInvestments();
//        investmentMain.deleteInvestmenById();
    }

    private void deleteInvestmenById() throws InvalidInvestmentIdException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the ID of the investment wanted to delete");
        int id=s.nextInt();
        int result=investmentService.deleteInvestmentById(id);
        if(result!=0){
            System.out.println("investment deleted successfully");
        }else{
            System.out.println("investment not deleted successfully");
        }
    }

    private void getAllInvestments() {
        List<InvestmentDto> allInvestment=investmentService.getAllInvestment();
        for(InvestmentDto i:allInvestment){
            System.out.println(i);
        }
    }

    private void addInvestment() {
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
        InvestmentDto investment=new InvestmentDto(iId,iName,iType,iAmount,iDate);
        int result=investmentService.addInvestment(investment);
        if(result!=0){
            System.out.println("Investment successfully added");
        }else{
            System.out.println("Investment has not added failed");
        }
    }
}
