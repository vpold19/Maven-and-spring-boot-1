package com.skypro.vadim.calculator.controller;

import Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator {
private final CalculatorService calculatorService;

    public ControllerCalculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String helloToCalculator() {
        return "<h1> Добро пожаловать в калькулятор </h1>";
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " + " + b + " = " + (a + b);
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " - " + b + " = " + (a - b);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") float a, @RequestParam("num2") float b) {
        return a + " * " + b + " = " + (a * b);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " / " + b + " = " + (a / b);
    }
}
