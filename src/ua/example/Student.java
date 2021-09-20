package ua.example;

import java.util.Objects;

public class Student extends Person{

    private String course;
    private int age;

    {
        System.out.println("Non static Student Class ");
    }

    static {
        System.out.println("Static Student Class ");
    }

    public Student(long id, String name, String course) {
        super(id, name);
        this.course = course;
        System.out.println("Constructor Student Class ");
    }

    public Student(long id, String name, String course, int age) {
        this(id, name, course);
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void getTitle() {
        System.out.println("STUDENT");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course, age);
    }
}
