package com.cams.sms.controller;

import com.cams.sms.dto.Stock;
import com.cams.sms.service.StockService;
import com.cams.sms.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock-api")
public class StockController {

    StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping(value = "/stocks")
    public Stock createStock(@RequestBody Stock stock){ //create a stock
        System.out.println(stock);
        stockService.createStock(stock);
        return stock;
    }
    @GetMapping(value = "/stocks")
    public String getAllStocks(){  // read - get all stock details
        return "display";//model
    }
    @GetMapping(value = "/stocks/id") // read - get stock details by stockid
    public String getStockById(){
        return "stock by id";//model
    }
    @PutMapping(value = "/stocks")// update
    public String updateStocks(){
        return "update";//model
    }
    @DeleteMapping(value = "/stocks")//delete
    public String deleteStocks(){
        return "delete";//model
    }
}
