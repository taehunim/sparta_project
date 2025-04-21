package level3;

import java.util.ArrayList;
import java.util.List;


public class ArithmeticCalculator <T extends Number> {

    // 속성
    private List<T> resultCollection = new ArrayList<>();
    // 생성자

    // 기능
//    void calculate(Integer valueA, Integer valueB, char valueC) {
//        int result = 0;
//        switch (valueC) {
//            case '+':
//                result = valueA + valueB;
//                break;
//            case '-':
//                result = valueA - valueB;
//                break;
//
//            case '*':
//                result = valueA * valueB;
//                break;
//
//            case '/':
//                result = valueA / valueB;
//                break;
//
//            default:
//                return;
//        }
//        resultCollection.add(result);
//    }

    public double calculate (T valueA, T valueB, char input) {
        OperatorType op = OperatorType.findInstance(input);
        return op.perform(valueA, valueB);

    }



    T getResult() {
        return resultCollection.get(resultCollection.size() - 1);
    }

    T getResultWant(T valueA) {
        return resultCollection.get(valueA.intValue() - 1);
    }

    void addResult(T valueA) {
        resultCollection.add(valueA);
    }

    void removeResult() {
        if (resultCollection.size() > 0) {
            System.out.println(resultCollection.size() + "번 째 숫자 삭제완료");
            resultCollection.remove(0);
        } else {
            System.out.println("삭제할 요소가 없습니다.");
        }

    }
}


