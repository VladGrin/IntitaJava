package ua.example;

import java.util.Objects;

public class Subject {
    private final long subjectId;
    private final String name;

    public Subject(long subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return subjectId == subject.subjectId && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, name);
    }


    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                '}';
    }
}
