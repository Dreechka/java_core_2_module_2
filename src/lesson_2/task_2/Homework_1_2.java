package lesson_2.task_2;

public class Homework_1_2 {
    public static void main(String[] args) {
        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        System.out.printf("Длина массива - %s количество элементов в массиве - %s", myList1.getArray().length, myList1.getSize());
        System.out.println();

        MyList<String> myList2 = new MyList<>();
        myList2.add("a");
        myList2.add("b");
        myList2.add("c");
        myList2.add("d");
        System.out.printf("Длина массива - %s количество элементов в массиве - %s", myList2.getArray().length, myList2.getSize());
        System.out.println();

        MyListWithToken<Integer> myListWithToken1 = new MyListWithToken<>(Integer.class);
        myListWithToken1.add(1);
        myListWithToken1.add(2);
        myListWithToken1.add(3);
        myListWithToken1.add(4);
        System.out.printf("Длина массива - %s количество элементов в массиве - %s", myListWithToken1.getArray().length, myListWithToken1.getSize());
        System.out.println();

        MyListWithToken<String> myListWithToken2 = new MyListWithToken<>(String.class);
        myListWithToken2.add("a");
        myListWithToken2.add("b");
        myListWithToken2.add("c");
        myListWithToken2.add("d");
        System.out.printf("Длина массива - %s количество элементов в массиве - %s", myListWithToken2.getArray().length, myListWithToken2.getSize());
    }
}
