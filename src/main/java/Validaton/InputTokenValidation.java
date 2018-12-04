package Validaton;

public class InputTokenValidation {
    public static final String[] OPERATORS = { "+", "-", "*", "/", "sqrt"};
    public static final String[] STACKOPERATORS = {"undo", "clear"};

    public static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static Boolean isOperator(String token) {
        for(String op : OPERATORS) {
            if(op.toLowerCase().equals(token)) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isStackOperator(String token) {
        for(String op : STACKOPERATORS) {
            if(op.toLowerCase().equals(token)) {
                return true;
            }
        }
        return false;
    }
}
