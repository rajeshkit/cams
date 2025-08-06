package com.cams.sms.service;

import com.cams.sms.dto.Stock;
import com.cams.sms.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{
   StockRepository stockRepository;
    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock addPost(Stock stock) {
        Stock s=stockRepository.save(stock);
        return s;
    }
}
