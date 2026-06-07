package com.meet.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("calculate/{num1}/{num2}/{operation}")
    public String calculate(
            @PathVariable double num1,
            @PathVariable double num2,
            @PathVariable String operation) {

        double result;

        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) return "Error: Cannot divide by zero";
                result = num1 / num2;
                break;
            default:
                return "Invalid Operation. Use: add, subtract, multiply, divide";
        }
        return "Result is: " + result;
    }
}
