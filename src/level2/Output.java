package level2;

public class Input {

    // 속성

    // 생성자

    // 기능
    final void introIntInput() {
        System.out.println("0이상의 정수를 입력해주세요.");
    }

    final void warnigWrongInput() {
        System.out.println("유효하지 않은 값 입니다.");
    }

    final void introOperInput() {
        System.out.println("연산자를 입력해주세요.(+ - * /)");
    }

    final void divWrongInput() {
        System.out.println("나눗셈의 경우 제수에는 0이 들어갈 수 없습니다.");
    }

    final void introEnd() {
        System.out.println("다음을 입력해 진행하세요.");
    }

    final void introEndDelete() {
        System.out.println("delete : 저장된 값을 순서대로 하나씩 삭제합니다.");
    }

    final void introEndEnter() {
        System.out.println("Enter 키를 누르면 새로운 계산을 시작합니다");
    }

    final void introEndExit() {
        System.out.println("exit : 계산을 종료합니다.");
    }



}
