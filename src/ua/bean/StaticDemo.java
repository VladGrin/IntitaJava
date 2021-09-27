package ua.bean;

import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.E;
import static ua.bean.Car.STATIC_CONST;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(STATIC_CONST);
        final Car car = new Mers();
        car.setName("hgchgk");
        List<String> stringList;
        System.out.println(PI);
    }

}
class Car{
    public static final int STATIC_CONST = 55;
    private String name;
    public final int[] num = {1,2,3};

    public void getName(){
        System.out.println("Car");
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Mers extends Car{
    @Override
    public void getName(){
        System.out.println("Mers");
    }
}