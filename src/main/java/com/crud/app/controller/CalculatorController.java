package com.crud.app.controller;

import com.crud.app.calculator.Calculator;
import com.crud.app.calculator.ResultDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/calculator")
public class CalculatorController {

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @RequestMapping(method = RequestMethod.POST, value = "add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultDto add(
            @RequestParam(value = "val1", required = true) double val1,
            @RequestParam(value = "val2", required = true) double val2){
       return calculator.adding(val1,val2);
    }

    @RequestMapping(method = RequestMethod.GET, value = "div", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultDto div(
            @RequestParam(value = "val1", required = true) double val1,
            @RequestParam(value = "val2", required = true) double val2){

        return calculator.dividing(val1,val2);
    }
}
