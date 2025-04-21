package level2;

public class App {

    public static void main(String[] args) {

        //객체 생성
        Output output = new Output();
        Input input = new Input();
        InputCheck check = new InputCheck();
        Change change = new Change();
        Calculator calculator = new Calculator();

        int result;
        String strA = "-1";
        Integer operandA = -1;
        Integer operandB = -1;
        Integer something = -1;
        char operator = ' ';

        for (; ; ) {
            output.startCal();
            for (; ; ) {
                output.introIntInput();
                strA = input.getInputA();
                check.checkExit(strA);
                operandA = change.stringToInt(strA);
                operandA = check.checkNumber(operandA);
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
                operandB = change.stringToInt(strA);
                operandB = check.checkNumber(operandB);
                if (operandB == null) {
                    continue;
                }
                if ((operator == '/') && (operandB == 0)) {
                    output.divWrongInput();
                    continue;
                }
                break;
            }

            calculator.calculate(operandA, operandB, operator);
            result = calculator.getResult();
            System.out.println("계산 결과 = " + result);
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
                    something = change.stringToInt(strA);
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