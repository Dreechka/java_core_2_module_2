package lesson_2.task_2;

import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int size;

    public MyList() {
        array = new Object[3];
    }

    public int getSize() {
        return size;
    }

    public Object[] getArray() {
        return array;
    }

    public void add(T t) {
        if (size < array.length) {
            array[size] = t;
            size++;
        } else {
            Object[] biggerArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                biggerArray[i] = array[i];
            }
            array = biggerArray;
            array[size] = t;
            size++;
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
