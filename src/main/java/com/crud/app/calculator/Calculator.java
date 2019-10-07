package com.crud.app.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public ResultDto adding(double val1, double val2){
        return new ResultDto(val1+val2);
    }
    public ResultDto dividing(double val1, double val2){
        return new ResultDto(val1/val2);
    }
}
