package level3;

 public enum OperatorType {
        Plus('+') {
            @Override
            public <T extends Number> double perform(T valueA, T valueB) {
                return valueA.doubleValue() + valueB.doubleValue();
            }
        }, Minus('-') {
            @Override
            public <T extends Number> double perform(T valueA, T valueB) {
                return valueA.doubleValue() - valueB.doubleValue();
            }
        }, Multiply('*') {
            @Override
            public <T extends Number> double perform(T valueA, T valueB) {
                return valueA.doubleValue() * valueB.doubleValue();
            }
        }, Divide('/') {
            @Override
            public <T extends Number> double perform(T valueA, T valueB) {
                return valueA.doubleValue() / valueB.doubleValue();
            }
        };    // 인자 정의
        private final char operator;    // 매개 변수를 저장할 변수 선언

        OperatorType(char operator) {
            this.operator = operator;
        }    // 매개 변수를 변수에 할당

        public char getOperator() {
            return operator;
        }

        static OperatorType[] operatorArray = OperatorType.values();

        public static OperatorType findInstance(char input) {
            for (OperatorType instance : operatorArray) {
                char op = instance.getOperator();
                boolean flag = (op == input);
                if (flag) {
                    return instance;
                }
            }
            return null;
        }

        abstract public <T extends Number> double perform(T valueA, T valueB);
    }














