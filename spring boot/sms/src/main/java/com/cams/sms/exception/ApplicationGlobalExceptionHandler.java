package com.cams.sms.exception;

import com.cams.sms.dto.ApiError;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class ApplicationGlobalExceptionHandler {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ApiError handlerMethodArgumentNotValidException(
            MethodArgumentNotValidException e, HttpServletRequest request){
        List<FieldError> list =e.getBindingResult().getFieldErrors();
        StringBuilder stringBuilder=new StringBuilder();
        for (FieldError fieldError:list){
            stringBuilder.append(fieldError.getField()+":"+fieldError.getDefaultMessage()+"  ");
        }
        ApiError apiError=ApiError.builder()
                .when(LocalDateTime.now())
                .message(stringBuilder.toString())
                .path(request.getRequestURI())
                .build();
        return  apiError;
    }
    @ExceptionHandler(value = StockIdIsNotExistsException.class)
    public ApiError handlerStockIdIsNotException(StockIdIsNotExistsException e,
                                               HttpServletRequest request){
        ApiError apiError=ApiError
                .builder()
                .message(e.getMessage())
                .path(request.getContextPath())
                .when(LocalDateTime.now())
                            .build();
        return apiError;
    }


}
