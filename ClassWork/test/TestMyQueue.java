import DSA.MyQueue;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyQueue {
    @Test
    public void testThatQueueIsEmpty() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatQueueIsNotEmpty() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("Dozie");
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void testThatElementsAreAddedToQueueSuccessfully() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.add("Amarachi"));
    }

    @Test
    public void testThatQueueCanHoldMoreThanOneElement() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("Obi");
        myQueue.add("Chibinye");
        myQueue.add("amaka");
        myQueue.add("Lawrence");

        String[] expected = {"Obi", "Chibinye", "amaka", "Lawrence", null, null, null, null, null, null};

        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatWhenQueueIsFullMoreElementsCannotBeAdded() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.add("femi");
        myQueue.add("eze");
        myQueue.add("ola");
        myQueue.add("ego");
        myQueue.add("silver");
        myQueue.add("Emma");
        myQueue.add("Mike");

        assertThrows(IllegalStateException.class, () -> myQueue.add("Goodness"));
    }

    @Test
    public void testThatElementOfDifferentClassCannotBeAddedToQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("ego");

        assertThrows(NullPointerException.class, () -> myQueue.add(null));
    }

    @Test
    public void testThatNumericStringsCannotBeAddedToQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("dozie");
        myQueue.add("mma");
        myQueue.add("ada");
        myQueue.add("ola");

        assertThrows(IllegalArgumentException.class, () -> myQueue.add("7"));
    }

    @Test
    public void testThatAnEmptyStringCannotBeAddedToQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("femi");

        assertThrows(IllegalArgumentException.class, () -> myQueue.add(""));

    }

    @Test
    public void testThatElementCanBeInsertedUsingOfferMethod() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.offer("obi"));
    }

    @Test
    public void testThatElementCannotBeInsertedUsingOfferMethodWhenQueueIsFull() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.add("femi");
        myQueue.add("eze");
        myQueue.add("ola");
        myQueue.add("ego");
        myQueue.add("silver");
        myQueue.add("Emma");
        myQueue.add("Mike");

        assertFalse(myQueue.offer("obi"));
    }

    @Test
    public void testThatNullElementCannotBeInsertedToQueueUsingOfferMethod() {
        MyQueue myQueue = new MyQueue();
        assertThrows(NullPointerException.class, () -> myQueue.offer(null));
    }

    @Test
    public void testThatNumericStringsCannotBeInsertedToQueueUsingOfferMethod() {
        MyQueue myQueue = new MyQueue();
        assertThrows(IllegalArgumentException.class, () -> myQueue.offer("123"));
    }

    @Test
    public void testThatEmptyStringCannotBeInsertedToQueueUsingOfferMethod() {
        MyQueue myQueue = new MyQueue();
        assertThrows(IllegalArgumentException.class, () -> myQueue.offer(""));
    }

    @Test
    public void testThatFirstElementCanBeRetrievedFromQueueUsingRemoveMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.add("femi");

        assertEquals("obi", myQueue.remove());
    }

    @Test
    public void testThatFirstElementIsRemovedFromQueueUsingRemoveMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.add("femi");
        myQueue.remove();
        String[] expected = {"ada", "feyi", "femi", null, null, null, null, null, null, null};
        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenQueueIsEmptyAndHeadWantsToBeRemovedFromQueue() {
        MyQueue myQueue = new MyQueue();
        assertThrows(NoSuchElementException.class, () -> myQueue.remove());
    }

    @Test
    public void testThatFirstElementCanBeRetriedFromQueueUsingPollMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");


        assertEquals("obi", myQueue.poll());
    }

    @Test
    public void testThatFirstElementCanBeRemovedFromQueueUsingPollMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.poll();

        String[] expected = {"ada", "feyi", null, null, null, null, null, null, null, null};
        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenQueueIsEmptyAndHeadWantsTobeRemovedUsingPollMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.poll();

        String[] expected = {"ada", "feyi", null, null, null, null, null, null, null, null};
        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatFirstElementCanBeRetrievedFromQueueUsingelementMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");

        assertEquals("obi", myQueue.element());
    }

    @Test
    public void testThatFirstElementIsNotRemovedFromQueueUsingelementMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.element();

        String[] expected = {"obi", "ada", "feyi", null, null, null, null, null, null, null};

        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenQueueIsEmptyAndElementMethodIscalled() {
        MyQueue myQueue = new MyQueue();

        assertThrows(NoSuchElementException.class, () ->myQueue.element());
    }

    @Test
    public void testThatFirstElementCanBeRetrievedFromQueueUsingPeekMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");

        assertEquals("obi", myQueue.peek());
    }

    @Test
    public void testThatFirstElementIsNotRemovedFromQueueUsingPeekMethod() {
        MyQueue myQueue = new MyQueue();
        myQueue.add("obi");
        myQueue.add("ada");
        myQueue.add("feyi");
        myQueue.peek();

        String[] expected = {"obi", "ada", "feyi", null, null, null, null, null, null, null};
        assertArrayEquals(expected, myQueue.getQueue());
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenQueueIsEmptyAndPeekMethodIscalled() {
        MyQueue myQueue = new MyQueue();

        assertEquals(null, myQueue.peek());
    }




}


