import DSA.MyArrayList;
import DSA.MyMap;
import DSA.MySet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyMap {
    @Test
    public void testThatAMapOf10CapacityCanBeCreatedUsingEmptyConstructor() {
        MyMap myMap = new MyMap();

        assertEquals(0, myMap.size());
    }
    @Test
    public void testIfMapIsEmpty() {
        MyMap myMap = new MyMap();
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void testIfMapIsNotEmpty() {
        MyMap myMap = new MyMap();

        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertFalse(myMap.isEmpty());
    }

    @Test
    public void testIfMapContainsKey() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertTrue(myMap.containsKey("name1"));
    }

    @Test
    @DisplayName("test if this map doesn't contain specified key")
    public void testIfMapDoesNotContainsKey() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertFalse(myMap.containsKey("name4"));
    }

    @Test
    public void testIfKeyIsNullThrowsNullPointerException() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertThrows(NullPointerException.class, () -> myMap.containsKey(null));
    }

    @Test
    public void testIfMapContainsSpecifiedValue() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertTrue(myMap.containsValue("Oma"));
    }

    @Test
    public void testIfMapDoesNotContainSpecifiedValue() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertFalse(myMap.containsValue("amaka"));
    }

    @Test
    public void testIfSpecifiedValueIsNullAndThrowsNullPointerException() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertThrows(NullPointerException.class, () -> myMap.containsValue(null));
    }

    @Test
    public void testThatAValueCanBeAccessedUsingTheKey() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertEquals("Loveth", myMap.get("name3"));
    }

    @Test
    @DisplayName("test That A Value Can Be Accessed Using The Key")
    public void testThatIfMapContainsNoMappingForTheKeyAnExecptionIsthrown() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        assertEquals(null, myMap.get("name4"));
    }

    @Test
    public void testThatAKeyValuePairIsRemovedFromTheMap() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        myMap.remove("name3");

        assertEquals(null, myMap.get("name3"));
    }

    @Test
    @DisplayName("test that a Key-Value Pair is removed from the map")
    public void testThatThePreviousValueAssociatedWithAKeyIsReturnedAfterTheKeyValuePairIsRemovedFromTheMap() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");


        assertEquals("Loveth", myMap.remove("name3"));
    }

    @Test
    @DisplayName("test that a Key-Value Pair is removed from the map")
    public void testThatNullIsReturnedIfKeyIsNotInMap() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");


        assertEquals(null, myMap.remove("name4"));
    }

    @Test
    @DisplayName("test that a Key-Value Pair is removed from the map")
    public void testThatAnExceptionIsThrownIfSpecifiedKeyIsNull() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");


        assertThrows(NullPointerException.class, () -> myMap.remove(null));
    }

    @Test
    public void testThatAllKeyValuePairsAreRemovedFromTheMap() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        myMap.clear();
        assertEquals(0, myMap.size());
    }

    @Test
    public void testThatASetViewOfTheKeysOfTheMapIsReturned() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        MySet expected = new MySet();
        expected.add("name1");
        expected.add("name2");
        expected.add("name3");

        assertEquals(expected, myMap.keySet());
    }

    @Test
    public void testThatAnArrayListViewOfTheValuesOfTheMapIsReturned() {
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");

        MyArrayList expected = new MyArrayList(3);
        expected.add("Amaka");
        expected.add("Oma");
        expected.add("Loveth");


        assertArrayEquals(expected.toArray(), myMap.valueSet().toArray());
    }

    @Test
    public void testThatASetViewOfTheMappingsCotainedInThisMao(){
        MyMap myMap = new MyMap();
        myMap.put("name1", "Amaka");
        myMap.put("name2", "Oma");
        myMap.put("name3", "Loveth");
        MySet expected = new MySet();
        expected.add("name1", "Amaka");
        
    }

}
