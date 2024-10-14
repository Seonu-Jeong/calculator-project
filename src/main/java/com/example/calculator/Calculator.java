package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<Integer> result_list = new ArrayList<Integer>();

    public int calculate(String op, int a, int b) {

        int result = 0;

        try {
            switch (op) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
            }
        } catch (ArithmeticException e) {
            throw e;
        }

        result_list.add(result);

        return result;
    }


}
