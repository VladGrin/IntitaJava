package ua.example;

import java.util.Objects;

public abstract class Person {
    private long id;
    private String name;
    private static String sex;

    {
        System.out.println("Non static Person Class ");
    }

    static {
        System.out.println("Static Person Class ");
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor Person Class ");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getTitle();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
