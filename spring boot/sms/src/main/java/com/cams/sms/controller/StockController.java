package com.cams.sms.controller;

import com.cams.sms.dto.Stock;
import com.cams.sms.service.StockService;
import com.cams.sms.service.StockServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock-api")
public class StockController {
    StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/stocks")
    public Stock createPost(@Valid @RequestBody Stock stock){
        //StockService
        Stock ss=stockService.addPost(stock);
        return ss;
    }
    @GetMapping("/stocks")
    public List<Stock> getAllStocks(){
        return  stockService.getAllStocks();
    }
    @GetMapping("/stocks/{stockId}")
    public Stock getStockById(@PathVariable("stockId") int sId){
        return  stockService.getStockById(sId);
    }
    @PutMapping("/stocks")
    public Stock updateStocks(@RequestBody Stock stock){
        return stockService.updateStock(stock);
    }

}
