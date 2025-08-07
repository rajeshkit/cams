package com.cams.sms.exception;

public class StockIdIsNotExistsException extends  RuntimeException{
    public StockIdIsNotExistsException(String msg) {
        super(msg);
    }
}
