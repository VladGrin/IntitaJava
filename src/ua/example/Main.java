package ua.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
//        PointD1 pointD1 = new PointD1(-50);
//        pointD1.methodVarArgs(100,"hi", "world", "!");

        Person person = new Student(10, "", "Java", 30);
        Person person2 = new Student(15, "", "Java", 30);
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        /*
        public final native Class<?> getClass();
        public native int hashCode();
        public boolean equals(Object obj)
        protected native Object clone()
        public String toString() {return getClass().getName() + "@" + Integer.toHexString(hashCode());
            public final native void notify();
            public final native void notifyAll();
            public final native void wait(long timeout)
            public final void wait(long timeout, int nanos)
            public final void wait()
            protected void finalize()
                */
    }
}
