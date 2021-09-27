package ua.bean;

public final class ImmutableDeme {

    private final String name;
    private final int age;

    public ImmutableDeme(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
