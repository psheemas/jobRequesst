package com.crud.app.controller;

import com.crud.app.calculator.Calculator;
import com.crud.app.calculator.ResultDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Calculator calculator;

    @Test
    public void testCalculatorAdd() throws Exception{
        //Given
        ResultDto resultDto = new ResultDto(8.0);

        when(calculator.adding(6,2)).thenReturn(resultDto);

        //When $ Then
        mockMvc.perform(post("/v1/calculator/add")
                .param("val1","6")
                .param("val2","2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.value", is(8.0)));
    }

    @Test
    public void testCalculatorDivide() throws Exception{
        //Given
        ResultDto resultDto = new ResultDto(3.0);

        when(calculator.dividing(6,2)).thenReturn(resultDto);
        //When & Then
        mockMvc.perform(get("/v1/calculator/div")
                .param("val1","6")
                .param("val2", "2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.value", is(3.0)));
    }
}