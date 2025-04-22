package level3;

public class InputCheck <T extends Number> {
    //속성
    public final static String keyA = "2,099,999,957";
    public final static String keyB = "2,099,999,963";
    public final static String keyC = "2,099,999,971";
    public final static double keyD = 2099999981;
    //생성자

    //기능

    //exit 판별
    void checkExit(String value) {
        if (value.equals("exit")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
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

    String checkScan(String valueA) {
        if (valueA.equals("scan")) {
            System.out.println("입력한 숫자보다 큰 수를 조회합니다.");
            return keyC;
        } else {
            return valueA;
        }
    }


 }





