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
}
