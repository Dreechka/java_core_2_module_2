package lesson_2.task_1;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Flyable, E extends Swimable, J extends Bitable> {
    T flyableAnimal;
    E swimableAnimal;
    J biteableAnimal;

    public Zoo(T flyableAnimal, E swimableAnimal, J biteableAnimal) {
        this.flyableAnimal = flyableAnimal;
        this.swimableAnimal = swimableAnimal;
        this.biteableAnimal = biteableAnimal;
    }

    public T getFlyableAnimal() {
        return flyableAnimal;
    }

    public void setFlyableAnimal(T flyableAnimal) {
        this.flyableAnimal = flyableAnimal;
    }

    public E getSwimableAnimal() {
        return swimableAnimal;
    }

    public void setSwimableAnimal(E swimableAnimal) {
        this.swimableAnimal = swimableAnimal;
    }

    public J getBiteableAnimal() {
        return biteableAnimal;
    }

    public void setBiteableAnimal(J biteableAnimal) {
        this.biteableAnimal = biteableAnimal;
    }

    void feedFlyable() {
        System.out.println("летающее животное ест");
        flyableAnimal.fly();
    }

    void feedSwimable() {
        System.out.println("плавающее животное ест");
        swimableAnimal.swim();
    }

    void feedBitable() {
        System.out.println("кусающее животное ест");
        biteableAnimal.bite();
    }
}
