package level3;

public class App {

    public static void main(String[] args) {

        //객체 생성
        Output output = new Output();
        Input input = new Input();
        InputCheck check = new InputCheck();
        Change change = new Change();
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        int result;
        String strA;
        Double operandA;
        Double operandB;
        Double something;
        char operator;

        for (; ; ) {
            output.startCal();
            for (; ; ) {
                output.introIntInput();
                strA = input.getInputA();
                check.checkExit(strA);
                operandA = change.stringToDouble(strA);

                if (operandA == null) {
                    continue;
                }
                break;
            }

            for (; ; ) {
                output.introOperInput();
                strA = input.getInputB();
                check.checkExit(strA);
                operator = change.stringToChar(strA);
                operator = check.checkOperator(operator);
                if (operator == '!') {
                    continue;
                }
                break;
            }

            for (; ; ) {
                output.introIntInput();
                strA = input.getInputC();
                check.checkExit(strA);
                operandB = change.stringToDouble(strA);

                if (operandB == null) {
                    continue;
                }
                if ((operator == '/') && (operandB == 0)) {
                    output.divWrongInput();
                    continue;
                }
                break;
            }

            double resultA = calculator.calculate(operandA, operandB, operator);
            System.out.println("계산결과 = " + resultA);
            calculator.addResult(resultA);

            for (; ; ) {
                output.introEnd();
                output.introEndAdd();
                output.introEndDelete();
                output.introEndEnter();
                output.introEndExit();
                strA = input.getInputD();
                if (strA.equals("")) {
                    break;
                }

                check.checkExit(strA);

                strA = check.checkAdd(strA);
                strA = check.checkDelete(strA);
                if (strA.equals(InputCheck.keyA)) {
                    strA = input.getInputE();
                    something = change.stringToDouble(strA);
                    calculator.addResult(something);
                    output.introResultSave();
                    continue;
                }

                if (strA.equals(InputCheck.keyB)) {
                    calculator.removeResult();
                    output.introResultdelete();
                    continue;
                }

                output.introEndException();


            }
        }
    }
}