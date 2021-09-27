package ua.lesson8;

public interface CRUDOperation {
    public static final String name ="Hello";

    User save(User user);
    User find(int id);
    void update(User user);
    void remove(User user);
}
