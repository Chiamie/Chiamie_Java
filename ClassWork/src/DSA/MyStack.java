package DSA;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    String[] myStack = new String[5];
    int count = 0;


    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String value) {
        if (count != myStack.length)
            myStack[count++] = value;
        else
            throw new IndexOutOfBoundsException("Stack Overflow");
    }

    public String pop() {
        if (count > 0) {
            return myStack[--count];
        } else
            throw new EmptyStackException();
    }


    public int sized() {
        return myStack.length;
    }

    public String peek() {
        if (count != 0)
            return myStack[--count];
        throw new EmptyStackException();
    }

    public int search(String value) {
        if (count != 0) {
            for (int count = 0; count < myStack.length; count++) {
                if (myStack[count].equals(value))
                    return count + 1;
            }
        }
        throw new EmptyStackException();
    }
}

