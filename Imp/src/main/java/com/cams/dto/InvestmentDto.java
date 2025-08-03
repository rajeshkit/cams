package com.cams.dto;

import java.sql.Date;

public record InvestmentDto(
        int investmentId,
        String investmentName,
        String investmentType,
        int investmentAmount,
        Date investmentDate) {

}
