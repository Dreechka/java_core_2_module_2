package lesson_4;

import java.util.List;

public class User {
    private List<Integer> list;
    private int id;

    public User(int id, List<Integer> list) {
        this.id = id;
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public int getId() {
        return id;
    }
}
