package ua.lesson8;

public class Dog extends Animal{

    public Dog(int id) {
        super(id);
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void printAlias() {
        System.out.println("Bobik");
    }
}
