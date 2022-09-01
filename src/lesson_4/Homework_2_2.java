package lesson_4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Homework_2_2 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());
        //Задача №2
        // 1. Отсортировать список lists так, чтобы сначала были самые большие списки по размеру
        // 2. Вывести на экран все элементы
        // Ожидаемый результат: 3,4,5,1,2
        lists.stream()
                .sorted(Comparator.comparingInt(List<Integer>::size).reversed())
                .flatMap(Collection::stream)
                .forEach(System.out::print);

        System.out.println();

        //Задача №3
        // 1. Узнать, есть ли в lists хотя бы один список, который содержит сумму всех элементов вложенного листа
        // равную 12
        boolean check = lists.stream()
                .map(Collection::stream)
                .map(e -> e.reduce(Integer::sum))
                .anyMatch(e -> e.orElse(0) == 12);
        System.out.println(check);
    }
}
