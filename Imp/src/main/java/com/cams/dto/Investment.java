package com.cams.dto;

import java.sql.Date;

public class Investment {
    private int investmentId;
    private String investmentName;
    private String investmentType;
    private int investmentAmount;
    private Date investmentDate;

    public Investment() {
    }

    public Investment(int investmentId, String investmentName, String investmentType,
                      int investmentAmount, Date investmentDate) {
        this.investmentId = investmentId;
        this.investmentName = investmentName;
        this.investmentType = investmentType;
        this.investmentAmount = investmentAmount;
        this.investmentDate = investmentDate;
    }

    public int getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(int investmentId) {
        this.investmentId = investmentId;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public int getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(int investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public Date getInvestmentDate() {
        return investmentDate;
    }

    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }

    @Override
    public String toString() {
        return "Investment{" +
                "investmentId=" + investmentId +
                ", investmentName='" + investmentName + '\'' +
                ", investmentType='" + investmentType + '\'' +
                ", investmentAmount=" + investmentAmount +
                ", investmentDate=" + investmentDate +
                '}';
    }
}
