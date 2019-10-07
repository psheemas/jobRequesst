/*
package com.crud.app.controller;

import com.crud.app.calculator.Calculator;
import com.crud.app.calculator.ResultDto;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
@RequiredArgsConstructor
public class CalculatorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculatorAdd() throws Exception{
        //Given
        when(calculator.adding(10.5,11.5)).thenReturn(calculator.adding(10.5,11.5));
        //When $ Then
        mockMvc.perform(get("/v1/calculator")
                .param("val1","10.5")
                .param("val2","11.5")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.value", is("22.0")));

    }
}

 */