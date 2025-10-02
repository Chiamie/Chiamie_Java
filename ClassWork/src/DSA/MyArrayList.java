package DSA;

import java.util.Objects;

public class MyArrayList {
    private int count;
    private Object[] array;

    public MyArrayList() {
        array = new Object[10];
        count = 0;
    }

    public MyArrayList(int capacity) {
        array = new Object[capacity];
        count = 0;
    }

    public MyArrayList(Object[] array) {
        this.array = array;
        for (int count = 0; count < array.length; count++) {
            this.count++;
        }
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int getCapacity(){
        return array.length;
    }

    public int size(){
        return count;
    }

    private void resize(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }


    public void add(Object value){
        if (count == array.length)
            resize(array.length * 2);

        array[count++] = value;
    }

    public boolean contains(Object value){

        for(int count = 0; count < array.length; count++) {
            if (Objects.equals(array[count], value))
                return true;
        }
        return false;
    }

    public int indexOf (Object value){
        for(int count = 0; count < array.length; count++) {
            if (array[count] != null && array[count].equals(value))
                return count;
        }
        return -1;
    }

    public int lastIndexOf (Object value){
        int index = -1;
        for(int count = 0; count < array.length; count++) {
            if (array[count] != null && array[count].equals(value))
                index = count;
        }
        return index;
    }

    public Object get(int index){
        if (index < 0 || index >= array.length)
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        return array[index];
    }

    public Object set(int index, Object value){
        if (index < 0 || index >= array.length)
            throw new IndexOutOfBoundsException("Index is out of bounds!");

        Object oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    public Object[] toArray(){
        int numberOfElements = 0;
        for(int count = 0; count < array.length; count++) {
            if(array[count] != null)
                numberOfElements++;
        }
        Object[] newArray = new Object[numberOfElements];
        int newIndex = 0;
        for(int index = 0; index < array.length; index++) {
            if(array[index] != null) {
                newArray[newIndex] = array[index];
                newIndex++;
            }
        }
        return newArray;
    }

    public Object remove(int index){
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index is out of bounds!");

        Object oldValue = array[index];
        for(int count = index; count < array.length - 1; count++) {
            array[count] = array[count+1];
        }
        array[array.length-1] = null;
        return oldValue;
    }

    public boolean remove(Object value){
        boolean result = false;
        for(int count = 0; count < array.length; count++) {
            if(Objects.equals(array[count], value)){
                array[count] = null;
                result = true;
            }
        }
        return result;
    }

    public boolean removeAll(Object[] values) {
        boolean changed = false;
        for (int count = 0; count < values.length; count++) {
            for (int counter = 0; counter < array.length; counter++) {
                if (Objects.equals(array[counter], values[count]))
                    array[counter] = null;
                changed = true;
            }
        }
        return changed;
    }

    public boolean retainAll(Object[] values) {
        boolean changed = false;
        for(int count = 0; count < array.length; count++){
            for(int counter = 0; counter <= values.length; counter++){
                if (counter ==  values.length ) {
                    array[count] = null;
                    changed = true;
                }
                else if (Objects.equals(array[count], values[counter]))
                    break;
            }
        }
        return changed;
    }

    public void clear(){
        array = new Object[size()];
        count = 0;
    }

    //public abstract boolean equals();
}
