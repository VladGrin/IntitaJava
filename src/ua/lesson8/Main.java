package ua.lesson8;

public class Main {

    public static void main(String[] args) {
        final Dog dog = new Dog(1);
        printAlias(dog);
        final Cat cat = new Cat(2);
        printAlias(cat);

        Animal[] animals = {dog, cat, new Dog(2)};
        for (Animal animal : animals) {
            animal.run();
        }
        System.out.println(CRUDOperation.name);
        CRUDOperation operation = new UserCRUDOperation();
        operation.save(null);
    }

    public static void printAlias(Animal animal){
        animal.printAlias();
    }
}
