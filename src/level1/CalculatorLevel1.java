package level1;

import java.util.Scanner;

public class CalculatorLevel1 {

    public static void main(String[] args) {
        // 변수 선언
        Scanner scanner = new Scanner(System.in);
        String inputA;
        String inputB;
        String inputC;
        boolean decision = true;
        char operator = ' ';
        int operandA = -1;
        int operandB = -1;
        int result = -1;
        // 전체 반복문
        while (decision) {
            System.out.println("------------------------------------------");
            System.out.println("계산을 시작합니다.");
            System.out.println("계산할 숫자를 입력해주세요.");
            System.out.println("exit를 입력해 종료할 수 있습니다.");

            // 첫번째 수 입력
            while (true) {
                System.out.print("숫자: ");
                inputA = scanner.nextLine();      // 유저가 직업 입력

                // 전체 반복문 false로 바꾸고 첫번째 수 반복 루프 탈출
                if (inputA.equals("exit")) {
                    System.out.println("프로그램을 종료합니다");
                    decision = false;
                    break;
                }
                // 정수 변환
                try {
                    operandA = Integer.parseInt(inputA);
                    if (operandA < 0) {
                        System.out.println("0 이상의 정수를 입력해주세요.");
                        continue;       // 반복 지점으로 Go
                    }
                } catch (NumberFormatException e) {     // 문자-> 정수 예외 처리
                    System.out.println("숫자를 입력해주세요.");
                    continue;       //  반복 지점으로 Go
                }


                break;
            }


            if (!decision) {
                break;
            }

            // 연산자 입력
            System.out.println("원하는 연산 기호를 입력해주세요. (+ - * / 중 하나를 입력 해주세요)");
            System.out.println("exit를 입력해 종료할 수 있습니다.");

            while (true) {
                System.out.print("연산 기호: ");
                inputB = scanner.nextLine();       // 유저가 직접 입력
                // 전체 반복문 false로 바꾸고 연산자 반복 루프 탈출
                if (inputB.equals("exit")) {
                    System.out.println("프로그램을 종료합니다");
                    decision = false;
                    break;
                }
                // 문자열을 유니코드로
                // 한 글자인지 확인하기 , -1 -6 /6 등 잘못된 값에서 추출이 일어날 수 있음
                if (inputB.length() == 1) {
                    operator = inputB.charAt(0);
                    // 연산자와 그 이외의 것 구별
                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break;
                    }
                }
                System.out.println("연산자를 입력해주세요. (+ - * / 중 하나를 입력 해주세요)");
            }

            // 전체 루프 탈출
            if (!decision) {
                break;
            }

            // 두 번째 수 입력
            System.out.println("계산할 숫자를 입력해주세요.");
            System.out.println("exit를 입력해 종료할 수 있습니다.");

            while (true) {
                System.out.print("숫자: ");
                inputC = scanner.nextLine();      // 유저가 직접 입력


                if (inputC.equals("exit")) {
                    System.out.println("프로그램을 종료합니다");
                    decision = false;
                    break;
                }

                // 정수 변환
                try {
                    operandB = Integer.parseInt(inputC);
                    if (operandB < 0) {
                        System.out.println("0 이상의 정수를 입력해주세요.");
                        continue;
                    }
                } catch (NumberFormatException e) {     // 문자-> 정수 예외 처리
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }

                // 분모 0 제외 1
                if ((operator == '/') && (operandB == 0)) {
                    System.out.println("제수에는 0이 들어갈 수 없습니다.\n다른 숫자를 입력해주세요");
                    continue;
                }


                break;


            }

            // 전체 반복문 탈출
            if (!decision) {
                break;
            }

            // 연산식
            switch (operator) {
                case '+':
                    result = operandA + operandB;
                    break;
                case '-':
                    result = operandA - operandB;
                    break;
                case '*':
                    result = operandA * operandB;
                    break;
                case '/':
                    result = operandA / operandB;
                    break;
            }

            // 결과 출력
            System.out.println("결과 값 : " + result);

        }       // for
    }       // main method
}       // class