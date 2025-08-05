package com.cams.sms.service;

import com.cams.sms.dto.Stock;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StockService {
    public Stock createStock(Stock stock);
    public List<Stock> getAllStocks();
    public Stock getStockById(int stockId);
    public Stock updateStocks(Stock stock);
    public String deleteStocks(Stock stock);
}
