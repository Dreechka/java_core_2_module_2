package lesson_7.homework_4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем
        //method3.1
        //method3.2
        //method3.3

        UserMeta vasya = new UserMeta("Vasya", 2);
        printFields(vasya);
        printFieldValue(vasya);
        printDurationMethod(vasya, "Super ");
    }

    public static void printFields(UserMeta userMeta) {
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            for (Field declaredField : userMeta.getClass().getDeclaredFields())
                System.out.println(declaredField);
        }
    }

    public static void printFieldValue(UserMeta userMeta) throws IllegalAccessException {
        for (Field declaredField : userMeta.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(GetMetaData.class)) {
                declaredField.setAccessible(true);
                System.out.printf("%s = %s \n", declaredField.getName(), declaredField.get(userMeta));
            }
        }
    }

    public static void printDurationMethod(UserMeta userMeta, String prefix) throws InvocationTargetException, IllegalAccessException {
        for (Method declaredMethod : userMeta.getClass().getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(GetMetaData.class)) {
                long start = System.currentTimeMillis();
                declaredMethod.invoke(userMeta, prefix);
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
    }

}

