package lesson_6;

public class UserBroken {
    int age;
    String name;

    public UserBroken(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "UserBroken{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
