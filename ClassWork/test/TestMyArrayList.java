import DSA.MyArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyArrayList {

    @Test
    public void testThatAnEmptyListWithAnInitialCapacityOfTenCanBeConstructed() {
        MyArrayList myArrayList = new MyArrayList();
        assertEquals(10, myArrayList.getCapacity());
    }

    @Test
    public void testThatAnEmptyListCanBeConstructedWithSpecifiedCapacity() {
        MyArrayList myArrayList = new MyArrayList(20);
        assertEquals(20, myArrayList.getCapacity());
    }

    @Test
    public void testThatAnEmptyListCanBeInitializedWithSpecifiedCollection() {
        String[] names = {"obi", "ada", "feyi", "femi"};
        MyArrayList myArrayList = new MyArrayList(names);
        assertEquals(4, myArrayList.size());
    }

    @Test
    public void testThatArrayListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");

        assertFalse(myArrayList.isEmpty());
    }

    @Test
    @DisplayName("test that ArrayList can be initialized by specifying the size and that ArrayList Resizes")
    public void testThatListIsDynamic() {
        MyArrayList myArrayList = new MyArrayList(7);
        myArrayList.add("obi");
        myArrayList.add("ada");
        myArrayList.add("feyi");
        myArrayList.add("femi");
        myArrayList.add("tosin");
        myArrayList.add("tayo");
        myArrayList.add("eloka");
        myArrayList.add("emma");

        assertEquals(14, myArrayList.getCapacity());
    }

    @Test
    public void testThatArrayListContainsTheSpecifiedElement() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");

        assertTrue(myArrayList.contains("chemistry"));
    }

    @Test
    public void testThatTheIndexOfTheFirstOccurrenceOfSpecifiedElementCanBeReturned() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("physics");

        assertEquals(1, myArrayList.indexOf("physics"));
    }

    @Test
    public void testThatWhenTheSpecifiedElementIsNotInTheListMinusOneIsReturned() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        assertEquals(-1, myArrayList.indexOf("Biology"));

    }

    @Test
    public void testThatTheIndexOfTheLastOccurrenceOfSpecifiedElementIsReturned() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("physics");
        myArrayList.add("maths");

        assertEquals(3, myArrayList.lastIndexOf("physics"));
    }

    @Test
    public void testThatMinusOneIsReturnedWhenSpecifiedElementIsNotInTheList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("physics");
        myArrayList.add("maths");

        assertEquals(-1, myArrayList.lastIndexOf("English"));
    }

    @Test
    public void testThatTheElementAtTheSpecifiedPositionIsReturned() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("physics");
        myArrayList.add("maths");


        assertEquals("igbo", myArrayList.get(2));
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenIndexIsGreaterThanOrEqualToListLength() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.get(11));
    }

    @Test
    public void testThatTheSpecifiedElementIsInsertedATTheSpecifiedPosition() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        assertEquals("physics", myArrayList.set(1, "maths"));
    }

    @Test
    public void testThatAnExceptionIsThrowedWhenIndexIsGreaterThanOrEqualToListLengthWhileUsingSetMethod() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.set(11, "maths"));

    }

    @Test
    @DisplayName("testing that elements of the arraylist is returned as an array")
    public void testThatTheElementsOfTheArrayListIsReturned() {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        String[] expected = {"chemistry", "physics", "igbo"};
        assertArrayEquals(expected, myArrayList.toArray());
    }

    @Test
    public void testThatAnElementCanBeRemovedFromTheArrayListUsingTheElementIndex() {
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("physics");
        myArrayList.add("maths");

        assertEquals("physics", myArrayList.remove(3));
    }

    @Test
    public void testThatAnExceptionIsThrownWhenTheSpecifiedIndexIsGreaterThanOrEqualToTheArrayListLength() {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");

        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.remove(3));
    }

    @Test
    @DisplayName("test the remove method that returns boolean value")
    public void testThatTheFirstOccurrenceOfTheSpecifiedElementIsRemovedFromTheArrayList() {
        String[] names = {"feyi", "chiamie", "Eloka", "Emma"};
        MyArrayList myArrayList = new MyArrayList(names);

        assertTrue(myArrayList.remove("Emma"));
    }

    @Test
    @DisplayName("test the remove method that returns boolean value")
    public void testThatTheElementsOfTheArrayListDoNotShiftWhenAnElementIsRemovedFromTheArrayList() {
        String[] names = {"feyi", "chiamie", "Eloka", "Emma"};
        MyArrayList myArrayList = new MyArrayList(names);
        myArrayList.remove("chiamie");

        String[] expected = {"feyi", "Eloka", "Emma"};
        assertArrayEquals(expected, myArrayList.toArray());

    }

    @Test
    @DisplayName("test the remove method that returns boolean value")
    public void testThatTheElementsOfTheArrayListReturnsFalseWhenSpecifiedElementIsNotInTheList() {
        String[] names = {"feyi", "chiamie", "Eloka", "Emma"};
        MyArrayList myArrayList = new MyArrayList(names);

        assertFalse(myArrayList.remove("chemistry"));
    }

    @Test
    @DisplayName("testThatTheElementsOfTheArrayListContainedInTheSpecifiedCollectionIsremovedByRetainAllmethod")
    public void testThatTheRemoveMethodReturnsTrue () {
        Object[] ages = {1, 2, 3, 4, 5, 6, 7};
        MyArrayList myArrayList = new MyArrayList(ages);

        Object[] more = {2, 4, 5, 6};


        assertTrue(myArrayList.removeAll(more));

    }

    @Test
    public void testThatTheElementsOfTheArrayListContainedInTheSpecifiedCollectionIsremovedByRetainAllmethod() {
        Object[] ages = {1, 2, 3, 4, 5, 6, 7};
        MyArrayList myArrayList = new MyArrayList(ages);

        Object[] more = {2, 4, 5, 6};
        myArrayList.removeAll(more);

        Object[] expected = {1, 3, 7};
        assertArrayEquals(expected, myArrayList.toArray());
    }

    @Test
    public void testThatTheElementsOfAlistIsRemovedFromTheList() {
        MyArrayList myArrayList = new MyArrayList(4);
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("maths");


        myArrayList.clear();
        String[] expected = {};
        assertArrayEquals(expected, myArrayList.toArray());
    }

    @Test
    @DisplayName("Intersection")
    public void testThatAllTheElementsOfTheListNotContainedInTheSpecifiedCollectorIsRemoved() {
        MyArrayList myArrayList = new MyArrayList(4);
        myArrayList.add("chemistry");
        myArrayList.add("physics");
        myArrayList.add("igbo");
        myArrayList.add("maths");

        String[] collections = {"chemistry", "maths", "english"};
        myArrayList.retainAll(collections);

        String[] expected = {"chemistry", "maths"};
        assertArrayEquals(expected, myArrayList.toArray());
    }



}
