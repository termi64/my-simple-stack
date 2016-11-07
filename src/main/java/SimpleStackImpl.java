/**
 * Created by 21506348 on 07/11/2016.
 */

import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack{
    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }
}
