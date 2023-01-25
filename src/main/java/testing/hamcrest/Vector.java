package testing.hamcrest;

public class Vector {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double length(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}// class