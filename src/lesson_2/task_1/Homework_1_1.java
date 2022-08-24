package lesson_2.task_1;

public class Homework_1_1 {
    public static void main(String[] args) {
        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.
        Fish fish = new Fish();
        Turtle turtle = new Turtle();
        Bat bat = new Bat();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        Zoo<Flyable, Swimable, Bitable> firstZoo = new Zoo<>(bat, fish, cat);
        Zoo<Flyable, Swimable, Bitable> secondZoo = new Zoo<>(bird, turtle, wolf);

        firstZoo.feedFlyable();
        firstZoo.feedSwimable();
        firstZoo.feedBitable();

        secondZoo.feedFlyable();
        secondZoo.feedSwimable();
        secondZoo.feedBitable();
    }
}
