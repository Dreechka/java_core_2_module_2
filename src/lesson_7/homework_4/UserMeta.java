package lesson_7.homework_4;

@GetMetaData
public class UserMeta {
    private String name;
    @GetMetaData
    private Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @GetMetaData
    public String GetSuperName(String prefix) throws InterruptedException {
        Thread.sleep(1000);
        return prefix + name;
    }

    @Override
    public String toString() {
        return "UserMeta{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
