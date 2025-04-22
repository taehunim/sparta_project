package level3;

import java.util.Scanner;

public class Input {
    //속성
    private Scanner scanner;
    //생성자
    public Input() {
        this.scanner = new Scanner(System.in);
    }
    //기능
    String getInputA() {
        System.out.print("계산할 숫자 A: ");
        String result = scanner.nextLine();
        return result;
    }

    String getInputC() {
        System.out.print("계산할 숫자 B: ");
        String result = scanner.nextLine();
        return result;
    }

    String getInputB() {
        System.out.print("연산자: ");
        String result = scanner.nextLine();
        return result;
    }

    String getInputD() {
        System.out.print("명령어: ");
        String result = scanner.nextLine();
        return result;
    }

    String getInputE() {
        System.out.print("저장하고 싶은 숫자: ");
        String result = scanner.nextLine();
        return result;
    }

    String getInputF() {
        System.out.print("저장된 수 중 입력한 숫자보다 더 큰 숫자를 검색합니다\n숫자: ");
        String result = scanner.nextLine();
        return result;
    }
}
