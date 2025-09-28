import DSA.MyStack;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyStack {
    @Test
    public void testThatStackIsEmpty() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatStackIsNotEmpty() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.isEmpty());

        myStack.push("Rice");
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatStackPopsLastElement() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");

        assertEquals("Beans", myStack.pop());
    }

    @Test
    public void testThatStackReducesByOneElementAfterPop() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");
        myStack.pop();

        assertEquals(5, myStack.sized());

    }

    @Test
    public void testThatStackCanREturnTheLastElementUsingPeek() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");

        assertEquals("Garri", myStack.peek());
    }

    @Test
    public void testThatStackCanSearchAnItemToReturnTheItemPosition() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");
        assertEquals(1, myStack.search("Rice"));
    }

    @Test
    public void testThatStackHasAfixedSize() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");
        myStack.push("onions");
        myStack.push("FioFio");

        assertThrows(IndexOutOfBoundsException.class, () -> myStack.push("Bread"));
    }

    @Test
    public void testThatStackThrowsErrorWhenStackIsEmpty() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");
        myStack.pop();
        myStack.pop();
        myStack.pop();

        assertThrows(EmptyStackException.class, () -> myStack.pop());
    }

    @Test
    public void testThatStackThrows() {
        MyStack myStack = new MyStack();
        myStack.push("Rice");
        myStack.push("Beans");
        myStack.push("Garri");
        myStack.pop();
        myStack.push("onions");
        myStack.push("FioFio");
        myStack.push("Bread");


        assertThrows(IndexOutOfBoundsException.class, () -> myStack.push("Pepper"));
    }
}

