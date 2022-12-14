package lesson_6;

import java.util.HashMap;
import java.util.HashSet;

public class Homework_3 {
    public static void main(String[] args) {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

        HashSet<User> users = new HashSet<>();
        users.add(new User(31, "Bob"));
        users.add(new User(24, "Alina"));
        users.add(new User(42, "James"));
        System.out.println(users);

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер

        HashSet<UserBroken> usersBroken = new HashSet<>();
        usersBroken.add(new UserBroken(41, "Nikola"));
        usersBroken.add(new UserBroken(25, "Saimon"));
        usersBroken.add(new UserBroken(27, "Sally"));
        System.out.println(usersBroken);

        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.

        HashMap<CarBroken, Integer> carBrokenMap = new HashMap<>();
        carBrokenMap.put(new CarBroken(), 1);
        carBrokenMap.put(new CarBroken(), 2);
        carBrokenMap.put(new CarBroken(), 1);
        System.out.println(carBrokenMap);
    }
}
