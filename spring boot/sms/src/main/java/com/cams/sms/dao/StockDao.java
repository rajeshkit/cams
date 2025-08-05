package com.cams.sms.dao;

import com.cams.sms.dto.Stock;

public interface StockDao {
    public void createStock(Stock stock);
    public void getAllStocks();
    public void getStockById(int id);
    public void updateStock(Stock stock);
    public void delete(Stock stock);
}
