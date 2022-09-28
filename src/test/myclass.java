package test;

public class myclass {
    public int quotient(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return x * y;
    }
}