package ua.lesson8;

public class UserCRUDOperation implements CRUDOperation{
    @Override
    public User save(User user) {
        System.out.println("Save user");
        return null;
    }

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
