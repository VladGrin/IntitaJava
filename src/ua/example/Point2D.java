package ua.example;

public class Point2D extends PointD1{

    private final int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public double length() {
        return (int) Math.hypot(getX(), y);
    }
}
