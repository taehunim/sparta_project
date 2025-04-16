package level1;

import java.util.Scanner;

public class CalculatorLevel1 {

    public static void main(String[] args) {

        // 필수적인 변수 선언
        Scanner scanner = new Scanner(System.in);
        String operandA;
        String operandB;
        String operator;
        int operandC = -1;
        int operandD = -1;
        int result = -1; // 값이 할당되지 않는 경우를 막기위한 값 할당 , 초기화가 되지 않을 경우를 대비한 값 할당
        boolean decision = true ;
        for(int i = 0; i >= 0; i =+ 0) {        // 무한 반복문

        // 값 할당

        System.out.println("계산할 숫자를 입력해주세요.");
        System.out.println("exit를 입력해 종료할 수 있습니다.");

        while(decision) {
            System.out.print("숫자: ");
            operandA = scanner.nextLine();      // 유저가 직업 입력

            // for문 종료 조건 1
            if (operandA.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            // 정수 변환 1
            try {
                operandC = Integer.parseInt(operandA);      // 문자열을 정수형으로 변환
            } catch (NumberFormatException e) {     // 문자-> 정수 예외 처리
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            // 음수 제외 1
            if (operandC < 0) {
                System.out.println("0 이상의 정수를 입력해주세요.");
                continue;
            }
            decision
        }

        System.out.println("원하는 연산 기호를 입력해주세요 (+ - * / 중 하나를 입력 해주세요)");
        System.out.println("exit를 입력해 종료할 수 있습니다.");
        System.out.print("연산 기호: ");
        operator = scanner.nextLine();       // operator 입력


        if (operator.equals("exit")) {      // operator exit 루프 탈출
            System.out.println("프로그램을 종료합니다");
            break;
        }

        System.out.println("계산할 숫자를 입력해주세요.");
        System.out.println("exit를 입력해 종료할 수 있습니다.");
        System.out.print("숫자: ");
        operandB = scanner.nextLine();      // operandB 입력


        if (operandB.equals("exit")) {      // operandB exit 루프 탈출
            System.out.println("프로그램을 종료합니다");
            break;
        }

        operandD = Integer.parseInt(operandB);
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

