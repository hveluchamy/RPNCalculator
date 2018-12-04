import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import ArithmeticOperator.*;
import Validaton.*;

import static Validaton.InputTokenValidation.isOperator;
import static Validaton.InputTokenValidation.isStackOperator;

public class RPNCalculatorManager {
    public static final String CLEAR = "clear";
    public static final String UNDO = "undo";
    public static boolean previousWasOperandOrUndo = false;

    static StackOperationManager stackOperationManager = new StackOperationManager();

    public static Stack<Double> stack = new Stack<Double>();



    public static void arithmeticOperationResolver(String op, double e1, double e2, Stack stack) {
        OperatorHandler operatorHandler;
        double calculatedValue;
        if(op.equals("+")) {
            operatorHandler = new AdditionOperator(e1,e2);
            calculatedValue =  operatorHandler.calculate();
        }
        else if(op.equals("-")) {
            operatorHandler = new SubtractionOperator(e1,e2);
            calculatedValue = operatorHandler.calculate();
        }
        else if(op.equals("*")) {
            operatorHandler = new MultiplicationOperator(e1,e2);
            calculatedValue = operatorHandler.calculate();
        }
        else if(op.equals("/")) {
            operatorHandler = new DivisionOperator(e1,e2);
            calculatedValue = operatorHandler.calculate();
        } else if(op.equals("sqrt")){
            operatorHandler = new SquareRootOperator(e1);
            calculatedValue = operatorHandler.calculate();
        }
        else {
            throw new IllegalArgumentException("Invalid operator.");
        }

        operatorHandler.postArithmeticOperation(op, stack, calculatedValue);
    }

    public static void stackOperationResolver(String token){
        if(token.toLowerCase().equals(CLEAR)){
            stackOperationManager.clearStack(stack);
            previousWasOperandOrUndo = false;
        } else if (token.toLowerCase().equals(UNDO)){
            if(previousWasOperandOrUndo){
                stackOperationManager.undo(stack);
            }
            else {
                System.out.println("Cant undo as stack has been modified");
            }
        }
    }

    public static void processTokens(String[] tokens) throws Exception {
        int i = 1;
        for(String token : tokens) {
            try {
                if (isOperator(token)) {
                    int stackSize = stack.size();
                    arithmeticOperationResolver(token, stack.get(stackSize-1), stack.get(stackSize-2), stack);
                    previousWasOperandOrUndo = false;
                } else if(InputTokenValidation.isNumeric(token)){
                    stack.push(Double.parseDouble(token));
                    previousWasOperandOrUndo =true;
                } else if (isStackOperator(token)){
                    stackOperationResolver(token);
                }
                else {
                    System.out.println("Not a valid input parameter: " + token);
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Operator " + token+ " (position " +i + "): insufficient parameters");
            }
        }
        System.out.println("Stack: " + stack);
    }




}
