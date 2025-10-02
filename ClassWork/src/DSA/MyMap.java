package DSA;

public class MyMap {
    private MySet keys;
    private MyArrayList values;
    private int count;

    public MyMap() {
        keys = new MySet();
        values = new MyArrayList();
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void put(Object key, Object value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
        count++;
    }

    public int size(){
        return count;
    }

    public boolean containsKey(Object key) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        int index = keys.indexOf(key);
        return index != -1;
    }

    public boolean containsValue(Object value) {
        if (value == null)
            throw new NullPointerException("value is null");
        int index = values.indexOf(value);
        return index != -1;
    }

    public Object get(Object key) {
        int index = keys.indexOf(key);
        if (index != -1)
            return values.get(index);
        return null;
    }

    public Object remove(Object key) {
        if  (key == null) {
            throw new NullPointerException("key is null");
        }
        int index = keys.indexOf(key);
        if (index != -1) {
            Object value = values.get(index);
            values.remove(index);
            return value;
        }
        return null;
    }

    public void clear() {
        keys.clear();
        values.clear();
        count = 0;
    }

    public MySet keySet() {
        return keys;
    }

    public  MyArrayList valueSet() {
        return values;
    }
}
