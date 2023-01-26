package testing.hamcrest;

public class Vector {
    private double x;
    private double y;

    public double length(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}// class
