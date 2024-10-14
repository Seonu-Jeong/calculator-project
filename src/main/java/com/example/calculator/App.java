package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요:");
            String op = sc.next();

            int result = 0;
            Calculator calculator = new Calculator();

            try {

                result = calculator.calculate(op, a, b);

                System.out.println("결과: " + result);

                calculator.setResult_list(result);

            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();

            if (answer.equals("exit"))
                break;

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.next();

            if (answer.equals("remove"))
                calculator.removeResult();

        } while (true);
    }
}
