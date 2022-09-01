package lesson_2.task_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyListWithToken<T> {
    private T[] array;
    private int size;
    Class<T> type;

    @SuppressWarnings("unchecked")
    public MyListWithToken(Class<T> type) {
        this.type = type;
        array = (T[]) Array.newInstance(type, 3);
    }

    public int getSize() {
        return size;
    }

    public Object[] getArray() {
        return array;
    }

    @SuppressWarnings("unchecked")
    public void add(T t) {
        if (size < array.length) {
            array[size] = t;
            size++;
        } else {
            T[] biggerArray = (T[]) Array.newInstance(type, array.length * 2);
            for (int i = 0; i < array.length; i++) {
                biggerArray[i] = array[i];
            }
            array = (T[]) biggerArray;
            array[size] = t;
            size++;
        }
    }


    public T get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
