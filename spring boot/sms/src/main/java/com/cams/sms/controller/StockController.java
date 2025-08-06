package com.cams.sms.controller;

import com.cams.sms.dto.Stock;
import com.cams.sms.service.StockService;
import com.cams.sms.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-api")
public class StockController {
    StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/stocks")
    public Stock createPost(@RequestBody Stock stock){
        //StockService
        Stock ss=stockService.addPost(stock);
        return ss;
    }

}
