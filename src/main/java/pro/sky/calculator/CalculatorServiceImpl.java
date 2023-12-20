package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    public String minus(Integer num1, Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    public String multiply(Integer num1, Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(Integer num1, Integer num2) {
        if (num2 == null || num1 == null || (num2 == null && num1 == null)) {
            return "Ошибка ввода данных";
        }
        if (num2 == 0) {
            return "Делить на 0 нельзя";}
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

}
