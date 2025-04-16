package level1;

import java.util.Scanner;

public class CalculatorLevel1 {

    public static void main(String[] args) {

        // 필수적인 변수 선언
        Scanner scanner = new Scanner(System.in);
        String operandA;
        String operandB;
        String operator;
        int result;

        for(int i = 0; i >= 0; i =+ 0) {        // 무한 반복문

        // 값 할당

        System.out.println("계산할 숫자를 입력해주세요.");
        System.out.println("exit를 입력해 종료할 수 있습니다.");
        System.out.print("숫자: ");
        operandA = scanner.nextLine();      //operandA 입력

        int operandC = Integer.parseInt(operandA);
        System.out.println("원하는 연산 기호를 입력해주세요 (+ - * / 중 하나를 입력 해주세요)");
        System.out.println("exit를 입력해 종료할 수 있습니다.");
        System.out.print("연산 기호: ");
        operator = scanner.nextLine();       // operator 입력


        System.out.println("계산할 숫자를 입력해주세요.");
        System.out.println("exit를 입력해 종료할 수 있습니다.");
        System.out.print("숫자: ");
        operandB = scanner.nextLine();      // operandB 입력

        int operandD = Integer.parseInt(operandB);
        // 연산
        // 제수가 0일 때 구분
        if(operator.equals("/") && (operandD == 0)) {
            System.out.println("제수에는 0이 들어갈 수 없습니다.\n다른 숫자를 입력해주세요");
        } else {
            switch (operator) {
                case "+":
                    result = operandC + operandD;
                    break;
                case "-":
                    result = operandC - operandD;
                    break;
                case "*":
                    result = operandC * operandD;
                    break;
                case "/":
                    result = operandC / operandD;
                    break;
            }
            System.out.println("결과 값 : " + result);
            //출력


        }
            }
        }
    }

