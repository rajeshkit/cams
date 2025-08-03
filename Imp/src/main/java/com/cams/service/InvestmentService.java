package com.cams.service;

import com.cams.dao.InvestmentDao;
import com.cams.dto.InvestmentDto;
import com.cams.exception.InvalidInvestmentIdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InvestmentService {
    InvestmentDao investmentDao;
    @Autowired
    public InvestmentService(InvestmentDao investmentDao) {
        this.investmentDao = investmentDao;
    }

    public int addInvestment(InvestmentDto investment) {
        int result = investmentDao.addInvestment(investment);
        return result;
    }
    public List<InvestmentDto> getAllInvestment(){
        List<InvestmentDto> list=investmentDao.getAllInvestments();
        return list;
    }
    public int deleteInvestmentById(int id) throws InvalidInvestmentIdException {
        int result=0;
        if(id<0){
            throw new InvalidInvestmentIdException();
        }else {
            result = investmentDao.deleteInvestmentById(id);
        }
        return result;
    }
}
