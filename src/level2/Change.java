package level2;

public class Change {

    //속성

    //생성자

    //기능
    Integer stringToInt (String valueA) {
        try {
            return Integer.parseInt(valueA);
        } catch (NumberFormatException e) {
            return null;
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
