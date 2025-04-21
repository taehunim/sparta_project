package level2;

public class InputCheck {
    //속성
    public final static String keyA = "12312512621123144";
    public final static String keyB = "12312512621123143";
    //생성자

    //기능

    //exit 판별
    void checkExit(String value) {
        if (value.equals("exit")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }

    Integer checkNumber(Integer value) {
        if (value == null || value < 0) {
            return null;
        } else {
            return value;
        }
    }

    char checkOperator(char valueA) {
        if (valueA == '+' || valueA == '-' || valueA == '*' || valueA == '/') {
            return valueA;
        } else {
            return '!';
        }
    }

    String checkAdd(String valueA) {
        if (valueA.equals("add")) {
            System.out.print("추가하고 싶은 숫자를 입력하세요.\n숫자: ");
            return keyA;
        } else {
            return valueA;
        }
    }

    String checkDelete(String valueA) {
        if (valueA.equals("delete")) {
            System.out.println("가장 오래된 숫자를 삭제합니다.");
            return keyB;
        } else {
            return valueA;
        }
    }


}

