package com.cams.sms.service;

import com.cams.sms.dao.StockDao;
import com.cams.sms.dao.StockDaoImpl;
import com.cams.sms.dto.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImpl implements StockService{

    StockDao stockDao;
    @Autowired
    public StockServiceImpl(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public Stock createStock(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> getAllStocks() {
        return List.of();
    }

    @Override
    public Stock getStockById(int stockId) {
        return null;
    }

    @Override
    public Stock updateStocks(Stock stock) {
        return null;
    }

    @Override
    public String deleteStocks(Stock stock) {
        return "";
    }
}
