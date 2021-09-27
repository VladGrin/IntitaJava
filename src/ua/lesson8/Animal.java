package ua.lesson8;

public abstract class Animal {

    protected int id;

    public Animal(int id) {
        this.id = id;
    }

    public abstract void run();

    public void printAlias(){
        System.out.println("Alias");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
