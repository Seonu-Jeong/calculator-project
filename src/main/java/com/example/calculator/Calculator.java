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
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            result=-1;
        }

        result_list.add(result);

        return result;
    }


}
