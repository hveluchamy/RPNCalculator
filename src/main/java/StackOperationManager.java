import org.apache.log4j.Logger;

import java.util.Stack;

public class StackOperationManager {
    final static Logger LOG = Logger.getLogger(StackOperationManager.class);

    public void clearStack(Stack stack){
        stack.clear();
    }

    public void undo(Stack stack){
        if(!stack.isEmpty())
        stack.pop();
    }

    public static void postArithmeticOperation(String operatorToken, Stack stack) {
        stack.pop();
        if(operatorToken.toLowerCase().equals("sqrt")){
            return;
        }

        stack.pop();
    }
}
