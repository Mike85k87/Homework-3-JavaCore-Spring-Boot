package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }


    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        if (num2 == 0) {
            return "Делить на 0 нельзя";}
        double result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
}
