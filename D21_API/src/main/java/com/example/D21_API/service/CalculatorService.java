package com.example.D21_API.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculate(String operation, double num1, double num2) {
        switch (operation.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
