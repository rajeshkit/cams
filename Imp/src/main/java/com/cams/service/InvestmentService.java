package com.cams.service;

import com.cams.dao.InvestmentDao;
import com.cams.dto.Investment;

import java.sql.Date;
import java.util.List;

public class InvestmentService {
    public int addInvestment(Investment investment) {
        InvestmentDao investmentDao=new InvestmentDao();
        int result = investmentDao.addInvestment(investment);
        return result;
    }
    public List<Investment> getAllInvestment(){
        InvestmentDao investmentDao=new InvestmentDao();
        List<Investment> list=investmentDao.getAllInvestments();
        return list;
    }
    public int deleteInvestmentById(int id){
        InvestmentDao investmentDao=new InvestmentDao();
        int result=investmentDao.deleteInvestmentById(id);
        return result;
    }
}
