package ua.lesson8;

public class WrapperDemo {
    public static void main(String[] args) {
        final int i = Integer.valueOf("58");
        System.out.println(i);
        method(58);
        final Integer integer = new Integer(58);

    }

    public static void method(Integer num){
        final Integer integer = new Integer(58);
        final int i = integer.intValue();
        int x = num;
    }
}
/*
int Integer
byte Byte
short Short
long Long
float Float
double Double
boolean Boolean
char Character



 */
