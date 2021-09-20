package ua.example;

import java.util.Arrays;

public class PointD1 extends Object{
    private final int x;

    public PointD1(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public double length(){
        return Math.abs(x);
    }

    public void method(){
        System.out.println("Method");
    }

    public void method(int x){
        System.out.println("Method " + x);
    }

    public void method(String x){
        System.out.println("Method " + x);
    }

    public void method(double x){
        System.out.println("Method " + x);
    }

    public void methodVarArgs(int a, String... str){
        System.out.println(str.length);
        System.out.println(Arrays.toString(str));
        System.out.println(a);
    }
}
