package com.cams.sms.service;

import com.cams.sms.dto.Stock;
import com.cams.sms.exception.StockIdIsNotExistsException;
import com.cams.sms.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById(int stockId) {
        Optional<Stock> optionalStock=stockRepository.findById(stockId);
        if (optionalStock.isPresent()){
            return optionalStock.get();
        }
        throw new StockIdIsNotExistsException("Getting stock is failed due to stock ID:"+stockId+" is invalid verify the stock id");
    }

    @Override
    public Stock updateStock(Stock stock) {
        if(stockRepository.existsById(stock.getId())){
            return stockRepository.save(stock);
        }
        throw new StockIdIsNotExistsException("Update is failed due to the stock ID:"+stock.getId()+" is invalid verify the stock id");//throw StockUpdateFailedException()
    }
}
