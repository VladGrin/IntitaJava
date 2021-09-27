package ua.lesson8;

import java.util.Objects;

public class User extends Person{

    {
        System.out.println("Non Static Child");
    }

    static {
        System.out.println("Static Child");
    }

    private String name;
    public User(int id) {
        super(id);
        System.out.println("Constructor Child");
    }

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
