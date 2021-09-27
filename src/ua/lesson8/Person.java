package ua.lesson8;

import java.util.Objects;

public class Person {
    {
        id = 5;
        System.out.println("Non Static Parent");
    }

    static {
        System.out.println("Static Parent");
    }

    private int id;

    public Person(int id) {
        this.id = id;
        System.out.println("Constructor Parent");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
