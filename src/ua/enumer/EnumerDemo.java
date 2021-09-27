package ua.enumer;

public class EnumerDemo {
    public static void main(String[] args) {
        System.out.println(MusicStyle.ROCK);
        getMusic(MusicStyle.POP);
        final MusicStyle style = MusicStyle.valueOf("ROCK");
        for (MusicStyle value : MusicStyle.values()) {
            System.out.println(value);
        }
        System.out.println(MusicStyle.ROCK.getDescription());
    }

    public static void getMusic(MusicStyle style) {
        System.out.println(style);
    }
}

enum MusicStyle {
    ROCK("hard") {
        @Override
        void method() {
            System.out.println("m1");
        }
    }, CLASSIC("soft") {
        @Override
        void method() {
            System.out.println("m2");
        }
    }, POP("stupid") {
        @Override
        void method() {
            System.out.println("m3");
        }
    };

    private String description;

    MusicStyle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract void method();
}
