package com.skypro.vadim.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator {
    @GetMapping("/calculator")
    public String helloToCalculator() {
        return "<h1> Добро пожаловать в калькулятор </h1>";
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") float a, @RequestParam ("num2") float b ) {
        return a + " + " + b + " + " + (a + b);
    }
}
