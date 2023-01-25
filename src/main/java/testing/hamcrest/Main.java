package testing.hamcrest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SquareRoot root1 = new SquareRoot();
        double a = 4;
        System.out.println(root1.calcSquareRoot(a));

        Vector vector = new Vector();
        System.out.println(vector.length(3, 4));
    }
}