package ua.lesson8;

import java.io.Serializable;

public class Cat extends Animal implements Serializable, Comparable<Cat> {

    public Cat(int id) {
        super(id);
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void printAlias() {
        System.out.println("Murka");
    }


    @Override
    public int compareTo(Cat o) {
        return this.id - o.id;
    }
}
