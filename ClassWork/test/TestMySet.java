
import DSA.MyArrayList;
import DSA.MySet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {
    @Test
    public void testThatASetOfSizeTenIsCreatedWhenNonParameterizedConstructorIsUsed() {
        MySet mySet = new MySet();

        assertEquals(10, mySet.getCapacity());
    }

    @Test
    public void testIfSetIsEmpty() {
        MySet mySet = new MySet();
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testIfSetIsNotEmpty() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        assertFalse(mySet.isEmpty());

    }

    @Test
    public void testIfSetAcceptsDuplicates() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(2);
        mySet.add(3);

        Object[] expected = {1, 2, 3};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    public void testIfAllTheElementsOfTheSpecifiedCollectionIsAddedToTheSetExcludingDuplicates(){
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);

        Object[] more = {1, 2, 3};
        mySet.addAll(more);
        Object[] expected = {1, 2, 3};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    public void testIfTheSpecifiedElementIsRemovedFromTheSet(){
        MySet mySet = new MySet();
        mySet.add("ada");
        mySet.add(2);
        mySet.add(3);
        Object value = "ada";
        mySet.remove(value);
        Object[] expected = {2, 3};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    @DisplayName("test That All The Elements Of The Specified Collector Are Contained In The List")
    public void testThatCollectionIsNotASubsetOfSet() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        Object[] collections = {2, 3, 4};

        assertFalse(mySet.containsAll(collections));
    }

    @Test
    @DisplayName("test that all the elements of the specified collector are contained in the list")
    public void testThatCollectionIsASubsetOfSet()  {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        Object[] collections = {2, 3};

        assertTrue(mySet.containsAll(collections));
    }

    @Test
    @DisplayName("Intersection")
    public void testThatAllElementsNotInSpecifiedCollectionIsRemovedFromTheSet() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        Object[] collections = {2, 3, 4};
        mySet.retainAll(collections);

        Object[] expected = {2, 3, 4};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    @DisplayName("assymmetric st difference of two sets")
    public void testThatSetRetainsAllElementsNotInSpecifiedCollection() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        Object[] collections = {2, 3, 4};
        mySet.removeAll(collections);

        Object[] expected = {1};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    public void testThatAllElemtsOfTheSetIsRemovedFromTheSet() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        mySet.clear();
        Object[] expected = {};
        assertArrayEquals(expected, mySet.toArray());
    }

    @Test
    @DisplayName("test for equality")
    public void testThatIfTheSpecifiedElementAndSetAreHaveEqualSizeAndSameElements() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        MySet values = new MySet();
        values.add(4);
        values.add(2);
        values.add(1);
        values.add(3);

        assertEquals(mySet, values);
    }

    @Test
    @DisplayName("test for equality")
    public void testThatIfTheSpecifiedElementAndSetAreHaveUnequalSizeWithSimilarElements() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        MySet values = new MySet();
        values.add(4);
        values.add(2);
        values.add(1);
        values.add(3);
        values.add(5);

        assertNotEquals(mySet, values);
    }

    @Test
    @DisplayName("test for equality")
    public void testThatIfTheSpecifiedElementAndSetHaveEqualSizeWithDifferentElements() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        MySet values = new MySet();
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);

        assertNotEquals(mySet, values);
    }

    @Test
    @DisplayName("test for equality")
    public void testThatIfTheSpecifiedElementIsNotASet() {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        Object[] values = {2, 3, 4};
        assertNotEquals(mySet, values);
    }







    }
