package level3;

import java.util.Arrays;
import java.util.Optional;

public class test {
    public enum OperatorType {
        Plus('+') {
            @Override
            public int perform(int valueA, int valueB) {
                return valueA + valueB;
            }
        }, Minus('-') {
            @Override
            public int perform(int valueA, int valueB) {
                return valueA - valueB;
            }
        }, Multiply('*') {
            @Override
            public int perform(int valueA, int valueB) {
                return valueA * valueB;
            }
        }, Divide('/') {
            @Override
            public int perform(int valueA, int valueB) {
                return valueA / valueB;
            }
        };    // 인자 정의
        private final char operator;    // 매개 변수를 저장할 변수 선언

        OperatorType(char operator) {
            this.operator = operator;
        }    // 매개 변수를 변수에 할당

        public char getOperator() {
            return operator;
        }

        OperatorType[] operatorArray = OperatorType.values();

        public OperatorType findInsetance(char input) {
            for (OperatorType instance : operatorArray) {
                char operator = instance.getOperator();
                boolean flag = (operator == input);
                if (flag) {
                    return instance;
                }
            }
            return null;
        }

        abstract public int perform(int valueA, int valueB);
    }
}













