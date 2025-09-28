package DSA;

import java.util.NoSuchElementException;

public class MyQueue {
    String[] myQueue = new String[10];
    int count = 0;


    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(String value) {
        if (value != null) {
            if (!value.isEmpty() && value.matches("[a-zA-Z]+")) {
                if (count != myQueue.length) {
                    myQueue[count++] = value;
                    return true;
                } else
                    throw new IllegalStateException("Queue is full");
            } else
                throw new IllegalArgumentException("Unacceptable value");
        } else
            throw new NullPointerException("Null element is not allowed");

    }

    public String[] getQueue() {
        return myQueue;
    }

    public boolean offer(String value) {
        if (value != null) {
            if (!value.isEmpty() && value.matches("[a-zA-Z]+")) {
                if (count != myQueue.length) {
                    myQueue[count++] = value;
                    return true;
                } else
                    return false;
            } else
                throw new IllegalArgumentException("Unacceptable value");
        } else
            throw new NullPointerException("Null element is not allowed");
    }

    public String remove() {
        if (!isEmpty()) {
            String head = myQueue[0];
            for (int index = 0; index < myQueue.length - 1; index++) {
                myQueue[index] = myQueue[index + 1];
            }
            myQueue[myQueue.length - 1] = null;
            return head;
        }else
            throw new NoSuchElementException("Queue is empty");
    }

    public String poll() {
        if (!isEmpty()) {
            String head = myQueue[0];
            for (int index = 0; index < myQueue.length - 1; index++) {
                myQueue[index] = myQueue[index + 1];
            }
            myQueue[myQueue.length - 1] = null;
            return head;
        }else
            return null;
    }

    public String element() {
        if (!isEmpty())
            return myQueue[0];
        else
            throw new NoSuchElementException("Queue is empty");
    }

    public String peek() {
        if (!isEmpty())
            return myQueue[0];
        else
            return null;
    }
}
