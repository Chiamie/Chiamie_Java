package DSA;


public class MySet extends MyArrayList {
    @Override
    public void add (Object value) {
        if(isEmpty())
            super.add(value);
        else if(!contains(value))
            super.add(value);
    }

    public boolean addAll(Object[] value) {
            for (int index = 0; index < value.length; index++) {
                if (!contains(value[index])) {
                    super.add(value[index]);
                    return true;
            }
        }
        return false;
    }

    public boolean containsAll(Object[] collection) {
        boolean result = false;
        int numberOfElements = 0;
        for (int index = 0; index < collection.length; index++) {
            if (contains(collection[index]))
                numberOfElements++;
        }
        if (numberOfElements == collection.length)
            result = true;
        return result;
    }

    @Override
    public boolean equals(Object value) {
        boolean result = false;
        if (value instanceof MySet) {
            MySet set = (MySet) value;
            if ((set.size() == size()) && containsAll(set.toArray()))
                result = true;
        }
        return result;
    }





}



