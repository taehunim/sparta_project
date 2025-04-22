package level3;

public class Change <T extends Number> {

    //속성

    //생성자

    //기능
    Double stringToDouble (String valueA) {
        try {
            return Double.parseDouble(valueA);
        } catch (NumberFormatException e) {
            return InputCheck.keyD;
        }
    }

    char stringToChar (String valueA) {
        if (valueA.length() == 1) {
            return valueA.charAt(0);
        } else {
            return '!';
        }
    }



}
