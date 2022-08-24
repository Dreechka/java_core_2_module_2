package lesson_2.task_2;

import java.lang.reflect.Array;


public class MyList<T> {
    T[] objects;
    int size;

    public MyList(Class<T> t) {
        @SuppressWarnings("unchecked") T[] objects = (T[]) Array.newInstance(t, 3);
        this.objects = objects;
        size = 0;
    }

    public void add(T t) {
        if (size < objects.length) {
            objects[size] = t;
            size++;
        } else {
            @SuppressWarnings("unchecked") T[] biggerArray = (T[]) Array.newInstance(objects.getClass(), objects.length * 2);
            for (int i = 0; i < objects.length; i++) {
                biggerArray[i] = objects[i];
            }
            objects = biggerArray;
        }


    }
}
