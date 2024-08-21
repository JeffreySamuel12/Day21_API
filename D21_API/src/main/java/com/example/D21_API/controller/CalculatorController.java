package com.example.D21_API.controller;


import com.example.D21_API.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculate")
    public double calculate(
            @RequestParam String operation,
            @RequestParam double num1,
            @RequestParam double num2) {
        return calculatorService.calculate(operation, num1, num2);
    }
}
